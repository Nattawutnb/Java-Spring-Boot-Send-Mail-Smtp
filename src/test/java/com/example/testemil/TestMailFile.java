package com.example.testemil;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.service.SendMailFileService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMailFile {
	
	@Autowired
	private SendMailFileService service;
	
	@Order(1)
	@Test
	void testSendMailFile() throws Exception {
		service.sendMailFile(
				TestData.to,
				TestData.cc,
				TestData.subject,
				TestData.body,
				TestData.filePath
				);
	}
	
	interface TestData{
		String to = "nbbmike@gmail.com";
		String cc = "nbbmike058@gmail.com";
		String subject = "Test Mail Message";
		String body = "Hello Word";
		String filePath = "C:/Send Email/image.jpg";
	}
	


}
