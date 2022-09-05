package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailApplication {
@Autowired
private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}
		@EventListener(ApplicationReadyEvent.class)
		public void triggerMail()
		{
			service.sendSimpleEmail("tarun55misra@gmail.com", "Saloni is BEST", "Saloni appreciation mail");
		}
	}

