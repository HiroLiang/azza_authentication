package com.azza.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.azza.authentication.repository.AzzaUserRepository;

@Service
public class AzzaUserService implements UserDetailsService {

	@Autowired
	private AzzaUserRepository azzaUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(Long ) throws UsernameNotFoundException {
		return azzaUserRepository.findById(null);
	}

}
