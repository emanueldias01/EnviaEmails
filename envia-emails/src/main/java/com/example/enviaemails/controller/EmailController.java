package com.example.enviaemails.controller;

import com.example.enviaemails.entity.Email;
import com.example.enviaemails.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("envia-email")
public class EmailController {

    @Autowired
    EmailService service;

    @PostMapping
    public void sendEmail(@RequestBody Email email){
        service.enviaEmail(email);

    }

}
