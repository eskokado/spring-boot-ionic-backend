package com.nelioalves.cursomc.services;

import java.io.Serializable;

import org.springframework.security.core.context.SecurityContextHolder;

import com.nelioalves.cursomc.security.UserSS;

public class UserService implements Serializable {
	private static final long serialVersionUID = 1L;

	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}

	
}
