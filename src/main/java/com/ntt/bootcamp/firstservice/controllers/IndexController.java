package com.ntt.bootcamp.firstservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	private static final Logger Logger = LoggerFactory.getLogger(IndexController.class);

	public IndexController() {
	}

	@GetMapping("/")
	public ResponseEntity<String> index() {
		Logger.info("Llamada al endpoint inicial");
		return new ResponseEntity<String>(HttpStatus.OK).ok("Hola mundo");
	}

}
