package com.example.demo.Controller;

import com.example.demo.mapper.DepartmentDao;
import com.example.demo.mapper.EmployeeDao;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.service.UploadImageService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Controller
public class EmployeeController{
    //查询所有员工返回列表页面
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    @Autowired
    UploadImageService uploadImageService;
    //跳转到员工列表页面
    @GetMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "/emp/list.html";
    }
    //跳转到添加页面
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //来到添加页面,查出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/add.html";
    }
    //员工添加
    @PostMapping("/emp")
    //spring mvc会自动将请求对象和入参对象一一对应，要求请求参数和JAVABean里面属性参数名一致即可
    public String addEmp(Employee employee, Model model, @RequestParam(value = "file", required = true) MultipartFile file,
                         HttpSession session, HttpServletRequest request)throws IOException {
//        System.out.println("Hello");
        //来到员工列表页面
//        if(employee==null){
//            System.out.println("false");
//        }
//        else{
//            System.out.println("true");
//        }
//        System.out.println(employee.toString());
        String str;
        StringBuffer url = request.getRequestURL();
        System.out.println("URL:"+url.toString());
        try{
            if(file!=null){
                //获取当前项目的路径
                String pathRoot=request.getSession().getServletContext().getRealPath("");
                System.out.println("当前项目的路径为:"+pathRoot);
                //生成UUID作为文件夹名称
                String uuid = UUID.randomUUID().toString().replaceAll("-", "");
                System.out.println("文件名称："+uuid);
                //获取上传文件类型
                String contentType = file.getContentType();
                System.out.println("文件类型为:"+contentType);
                //获得文件后缀名称
                String imageName=contentType.substring(contentType.indexOf("/")+1);
                System.out.println("文件后缀名称："+imageName);
//                if (!"BMP".equals(imageName) || !"JPG".equals(imageName)
//                        || !"JPEG".equals(imageName) ||! "bmp".equals(imageName)
//                        || !"jpg".equals(imageName) || !"jpeg".equals(imageName)){
//                    //file.transferTo(new File(tmpFilePath));
//                    model.addAttribute("status", "0");
//                    model.addAttribute("message", "文件格式不正确");
//                    return "emp/add.html";
//                }

                String filepath = "E:/demo_01/src/main/resources/static/image/";
                //获取项目路径
//                String path = ResourceUtils.getURL("classpath:").getPath();
//                System.out.println("path"+path);

                String imagename=employee.getLastName()+"/";
                System.out.println("imagename:"+imagename);
                String path = filepath+imagename;
                System.out.println("path:"+path);

                //如果不存在，则创建新文件夹
                File f=new File(path);
                if(!f.exists()){
                    f.mkdirs();
                }
                //新生成的文件名称
                String fileName=uuid+"."+imageName;
                System.out.println("新生成的文件名称："+fileName);
                session.setAttribute("fileName",fileName);
                //图片保存的完整路径
                String pathName=path+fileName;
                System.out.println(pathName);
                //图片的静态资源路径
                String staticPath="/upload/images/"+employee.getLastName()+"/"+fileName;
                System.out.println("静态资源路径："+staticPath);

                //复制操作
                //将图片从源位置复制到目标位置
                file.transferTo(new File(pathName));
                model.addAttribute("location", pathName);
//                //根据日期来创建对应的文件夹
//                String datePath=new SimpleDateFormat("yyyy/MM/dd/").format(new Date());
//                System.out.println("日期："+datePath);
            }
        }catch(Exception e){

        }
//        if(uploadImageService.uploadImage(file)){
//            model.addAttribute("status", 0);
//        }
//        else{
//            model.addAttribute("status", 1);
//        }
        employeeDao.save(employee);
        return "redirect:/emps";
    }
    //员工修改
    //来到修改页面，先查询员工信息并进行回显，再提交进行修改
    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp", employee);

        //来到添加页面,查出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
        return "emp/update.html";
    }
    //员工提交修改申请以后进行响应
    @PutMapping("/emp")
    public String updateEmployee(Employee employee){
        System.out.println("Hello");
        System.out.println(employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }
    //员工进行删除
    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
