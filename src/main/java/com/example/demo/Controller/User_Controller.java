package com.example.demo.Controller;

import com.example.demo.model.Login_guest;
import com.example.demo.model.User;
import com.example.demo.service.Login_Server;
import com.example.demo.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@RestController
@Controller
@EnableAutoConfiguration
//@Controller
public class User_Controller {
    @Resource
//    private Login_Server guest;
    //控制层不予许有任何实现逻辑
    private Login_Server guest;
    //以下是登录
    @RequestMapping(value = "/userLogin/submit",method = RequestMethod.POST)
    public String userLogin(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
//        if (usi.findUserByUsernameAndPassowrd(username,password)==null){
//            return false;
//        }
//        return true;

        if(guest.ExistUser(username, password)){
            return "redirect:/houtai";
        }
        else{
            return "redirect:/";
        }
    }
    //以下是注册
    @RequestMapping(value = "/userRegister/submit",method = RequestMethod.POST)
    public String userRegister(HttpServletRequest request){
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
//        User u =new User(username,password);
        if(guest.Exist_Username(name,username)){
            return "用户已经存在,不允许注册";
        }else{
            int i = guest.RegisterUser(name,username, password);
            if(i==1){
                return "redirect:/";
            }
            else{
                return "redirect:/index";
            }
        }


    }

}
