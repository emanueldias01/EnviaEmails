package com.example.enviaemails.service;

import com.example.enviaemails.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EmailService {

    @Autowired
    JavaMailSender mailSender;

    public void enviaEmail(Email email){

        var mensagem = new SimpleMailMessage();
        mensagem.setTo(email.destino());
        mensagem.setSubject(email.assunto());
        mensagem.setText(email.escrito());

        mailSender.send(mensagem);
    }

}
