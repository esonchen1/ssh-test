package com.jld.ssh.action;

import com.jld.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserAction extends ActionSupport {
    @Autowired
    private UserService userService;

    public String asd() throws Exception {
        userService.add();
        return NONE;
    }
}
