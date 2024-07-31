package com.zwt.charsjavaee.i_spring_ssm.controller;

import com.zwt.charsjavaee.i_spring_ssm.chars.Account;
import com.zwt.charsjavaee.i_spring_ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/save")
    @ResponseBody
    private String saveAccount(Account account){
        accountService.save(account);
        return "Saved";
    }

    @RequestMapping("/queryAll")
    private ModelAndView queryAccount(){
        List<Account> accounts = accountService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("accountList",accounts);
        modelAndView.setViewName("accountList");
        return modelAndView;
    }

}
