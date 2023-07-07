package com.springboot.learnspringsecurity.csrf;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class SpringSecurityCSRF {

	@GetMapping("/csrf-token")
	public CsrfToken retrieveCsrfToken(HttpServletRequest r) {
		return (CsrfToken) r.getAttribute("_csrf");

	}

}
