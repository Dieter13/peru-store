package com.jaromirkielar.perustore.controller;

import com.jaromirkielar.perustore.model.Customer;
import com.jaromirkielar.perustore.service.EmailNotificationService;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private EmailNotificationService emailNotificationService;

    public RegistrationController(EmailNotificationService emailNotificationService){
        this.emailNotificationService = emailNotificationService;
    }

    @RequestMapping("/signup")
    public String signup(){
        return "please sign up for our service";
    }

    @RequestMapping("/signup-success")
    public String signupSuccess(){

        // create user
        Customer customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setEmail("jayree13@live.com");

        // send notification
        try{
            emailNotificationService.sentNotification(customer);

        } catch( MailException e){
            // catch error
        }

        return "thank you for registering";
    }


}
