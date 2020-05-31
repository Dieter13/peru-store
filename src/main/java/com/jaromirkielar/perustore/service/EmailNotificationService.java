package com.jaromirkielar.perustore.service;

import com.jaromirkielar.perustore.model.Customer;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService {

    private JavaMailSender javaMailSender;

    public EmailNotificationService(JavaMailSender javaMailSender){
        this.javaMailSender = javaMailSender;
    }

    public void sentNotification(Customer customer) throws MailException{
        // sending mail

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(customer.getEmail());
        mail.setFrom("jarekkielar@gmail.com");
        mail.setSubject("notification from Spring");
        mail.setText("hello this is notification that email was delivered to you ");

        javaMailSender.send(mail);
    }
}
