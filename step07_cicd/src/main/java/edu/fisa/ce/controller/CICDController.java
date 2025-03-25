package edu.fisa.ce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CICDController {
	// http://localhost/fisa1
	@GetMapping("fisa1")
	public String reqRes() {
		System.out.println("reqRes() *******");
		System.out.println("ci/cd test");
		return "요청 응답 성공";
	}
}
