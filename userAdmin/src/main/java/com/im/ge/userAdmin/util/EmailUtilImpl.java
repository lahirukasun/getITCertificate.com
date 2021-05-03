package com.im.ge.userAdmin.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	private JavaMailSender sender;

	@Override
	public void sendEmail(String toAddress, String subject, String body) {

		
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper helper =new MimeMessageHelper(msg);
		try {
			helper.setTo(toAddress);
			helper.setText(body);
			helper.setSubject(subject);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		sender.send(msg);
	}

}
