package com.tutorialspoint.struts2;


import com.opensymphony.xwork2.ModelDriven;
import com.tutorialspoint.struts2.info.*;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Locale;

public class LoginAction extends ActionSupport implements ModelDriven<User>
{

    private User user = new User();

    public String login() {



        System.out.println(user.getUsername());
        System.out.println(user.getBookList().get(0).getUsername());
        System.out.println(user.getBookList().get(1).getUsername());
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getModel(){
        return user;
    }

    public void validate(){
        if(user.getUsername() == null || "".equals((user.getUsername()))){
            this.addFieldError("username","用户名不能为空");
        }
    }
}


