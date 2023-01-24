package com.example.testemil;



import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.service.SendMailService;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestMailService {
	
	@Autowired
	private SendMailService mailService;
	
	@Order(1)
	@Test
	void testSendMail() throws Exception {
		mailService.sendMail(
				TestData.to,
				TestData.cc,
				TestData.subject,
				TestData.body,
				TestData.filePaths
				);
		
	}
	
	interface TestData{
		String to = "nbbmike@gmail.com";
		
		List<String> cc = Arrays.asList("624235032@parichat.skru.ac.th", "nbbmike@gmail.com");
		
		String subject = "Test Mail Message";
		
		String body = "Hell word";
		
		String[] filePaths =  {"C:/Send Email/บันทึก-แจ้งเวียนคณะให้นักศึกษาปีสุดท้ายส.pdf", "C:/Send Email/01.jpg"};
		
		
		
		
	}

}
