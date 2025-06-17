package dev.filipvde.springforgeservicetemplate.controller;

import dev.filipvde.springforge.libs.exceptions.ResourceForbiddenException;
import dev.filipvde.springforge.libs.exceptions.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

	@GetMapping("not-found-endpoint")
	public String findById() {
		throw new ResourceNotFoundException("Resource not found");
	}

	@GetMapping("forbidden-endpoint")
	public String forbiddenPlace() {
		throw new ResourceForbiddenException("Resource is forbidden");
	}

}
