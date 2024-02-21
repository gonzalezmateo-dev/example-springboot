package com.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.MyAppApplication;

@Repository
public class UserRepositoryImpl implements IUserRepository{

	private static Logger LOG = LoggerFactory.getLogger(MyAppApplication.class);
	@Override
	public void register(String name) {
		// TODO Auto-generated method stub
		LOG.info("Se registro " + name);
	}
	
}
