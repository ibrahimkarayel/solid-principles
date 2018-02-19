package tr.com.jowl.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.jowl.controller.MailController;
import tr.com.jowl.services.MailService;

public class MailControllerImpl implements MailController{

    @Autowired
    private MailService mailService;

    public void send(String subject, String to) {
        mailService.send(subject, to);
    }
}
