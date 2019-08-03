package com.testService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/***
* This is the javadoc example.
*/
@RestController
@CrossOrigin
public class TestController {

	@GetMapping("/home")
	public String homeRequest() {
		return "Hello World!";
	}
}
