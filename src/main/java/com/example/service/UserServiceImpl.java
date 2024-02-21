package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.IUserRepository;



@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepository repo;
	@Override
	public void register(String name) {
		// TODO Auto-generated method stub
		repo.register(name);
	}

}
