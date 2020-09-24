package br.com.cpqi.controller;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {

	@Timed(value = "app.hello.request", histogram = true, percentiles = { 0.95, 0.99 }, extraTags = { "version", "1.0" })
	@GetMapping("/hello")
	public String hello() {
		return "Hello Micrometer with Spring Boot";
	}

	@Timed(value = "app.hello2.request", histogram = true, percentiles = { 0.95, 0.99 }, extraTags = { "version", "1.0" })
	@GetMapping("/hello2")
	public String hello2() {
		return "Hello Micrometer with Spring Boot";
	}

}
