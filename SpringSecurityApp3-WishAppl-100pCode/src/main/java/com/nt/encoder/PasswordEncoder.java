package com.nt.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
	
	public static void main(String[] args) {
		BCryptPasswordEncoder passwordEncoder=
				new BCryptPasswordEncoder();
		
		String pwd1=passwordEncoder.encode("rani");
		String pwd3=passwordEncoder.encode("hyd");
		System.out.println(pwd1+"          "+pwd3);
	}

}
