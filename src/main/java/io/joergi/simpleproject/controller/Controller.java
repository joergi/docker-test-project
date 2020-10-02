package io.joergi.simpleproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class Controller {


	@GetMapping(value ="/")
	@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
	public String returnString() {
		return "it's tea o clock with docker";
	}
}
