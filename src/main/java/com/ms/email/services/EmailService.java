package com.ms.email.services;

import com.ms.email.models.EmailModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    /**
     *
     */
    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {


    }
}
