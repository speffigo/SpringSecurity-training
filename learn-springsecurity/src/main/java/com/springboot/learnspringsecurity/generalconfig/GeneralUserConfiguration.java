package com.springboot.learnspringsecurity.generalconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class GeneralUserConfiguration {

	@Bean
	public UserDetailsService userDetailsService() {
		var user = User.withUsername("saurabh").password("{noop}dummy").roles("User").build();
		var user2 = User.withUsername("ankit").password("{noop}dummy").roles("Admin").build();

		return new InMemoryUserDetailsManager(user, user2);
	}
}
