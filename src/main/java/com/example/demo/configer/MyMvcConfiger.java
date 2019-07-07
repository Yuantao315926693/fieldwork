package com.example.demo.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurerAdapter来扩展Spring Mvc
@Configuration
//不能加EnableWebMvc,否则禁止掉SpringMvc的自动装配
//Ctrl+O可以打开可以继承或者重写的方法
public class MyMvcConfiger extends WebMvcConfigurerAdapter {
    //视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        //接收到什么连接(urlpath)到什么页面(setViewName()),用于不请求数据直接访问页面的
        registry.addViewController("/").setViewName("login.html");
    }
    //shift+F6给文件改名
    @Bean //将组件注册在容器中
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login.html");
                registry.addViewController("/index.html").setViewName("login.html");
            }
        };
        return adapter;
    }
}
