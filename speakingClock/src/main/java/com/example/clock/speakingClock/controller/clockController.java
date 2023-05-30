package com.example.clock.speakingClock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clock.speakingClock.service.ClockService;

@RestController
@RequestMapping("/time")
public class clockController {
	
	private final ClockService clockService;
	
	public clockController(ClockService clockService ) {
		this.clockService = clockService;
	}
	
	@GetMapping("/{time}")
	public String convertTimeToWords(@PathVariable String time) {
		
		return clockService.convertToWords(time);
		
	}

}
