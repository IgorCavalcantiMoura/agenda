package br.com.aulabe.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@RestController
public class AgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaApplication.class, args);
	}

@RequestMapping (value= "/xablau", method = RequestMethod.GET)
	public String getHello(){
		return String.format(Format:"hello");
	}
}
