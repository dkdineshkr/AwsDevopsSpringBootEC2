package com.zensar.MySpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@RequestMapping("/")
	public String getMessage() {
		return "Hello World";
	}
}
