package com.majid.JPA.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.majid.JPA.practice.entity.User;
import com.majid.JPA.practice.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	@Autowired
	private UserDAOService daoService;
	
	@Override
	public void run(String... args) throws Exception {
		User majid = new User("Majid","Admin");
		daoService.insert(majid);
		
	}

}
