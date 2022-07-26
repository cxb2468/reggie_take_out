package com.itheima.reggie.controller;


import com.itheima.reggie.service.EmplyeeSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/employee")


public class EmployeeController {
    @Autowired
    private EmplyeeSevice emplyeeSevice;
}
