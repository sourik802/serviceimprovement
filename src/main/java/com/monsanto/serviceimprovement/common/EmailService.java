package com.monsanto.serviceimprovement.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.CompletableFuture;

/**
 * Created by SNAND3 on 5/6/2018.
 */
@Async
public class EmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    public CompletableFuture<Boolean>
    sendMail() throws Exception {

        Boolean isMailSuccessful = true;
        Properties props = null;
        Session session = null;
        Message message = null;
        InternetAddress addressTo[] = null;
        List<String> recipients = new ArrayList<String>(
                Arrays.asList("sourik.nandi@monsanto.com"));
        int i = 0;
        try {

            //Get system properties
            props = System.getProperties();
            //Specify the desired SMTP server
            props.put("mail.smtp.host", "mail.monsanto.com");
            //create a new Session object
            session = Session.getInstance(props);
            //create a new MimeMessage object (using the Session created above)
            message = new MimeMessage(session);
            message.setFrom(new InternetAddress("DL-Cognizant-Operations-Webjava-L2-Support@monsanto.com"));

            addressTo = new InternetAddress[1];
            for (String add : recipients) {
                addressTo[i] = new InternetAddress(add);
                i++;
            }
            message.setRecipients(Message.RecipientType.TO, addressTo);
            message.setSubject("test");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("");
            messageBodyPart.setContent("hiiii", "text/html;charset=utf-8");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);
            Transport.send(message);

        } catch (MessagingException me) {
            LOGGER.error("MessagingException during sending email " + me.getMessage());
            isMailSuccessful = false;
        } catch (Exception ex) {
            LOGGER.error("Exception during sending email " + ex.getMessage());
            isMailSuccessful = false;
        }
        return CompletableFuture.completedFuture(isMailSuccessful);
    }
}
