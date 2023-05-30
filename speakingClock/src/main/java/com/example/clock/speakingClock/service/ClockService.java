package com.example.clock.speakingClock.service;

import org.springframework.stereotype.Service;

@Service
public class ClockService {
	
	public String convertToWords(String time) {
		
		if(time.equals("12:00")) {
			return "It's Midday";
		} else if (time.equals("00:00")) {
			return "It's Midnight";
		}
		
		String[] timeParts = time.split(":");
		int hours = Integer.parseInt(timeParts[0]);
		int minutes = Integer.parseInt(timeParts[1]);
		
		String hourWords = convertToWords(hours);
		String minuteWords = convertToWords(minutes);
		
		return "It's " + hourWords + " " + minuteWords;	
		
	}
	
	private String convertToWords(int number) {
		
		String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve","thirteen",
				"fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		
		String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};
		
		
		if(number < 20) {
			return units[number];
		} else {
			int tensPlace = number/10;
			int unitsPlace = number % 10;
			
			return tens[tensPlace] + (unitsPlace > 0 ? " " + units[unitsPlace] : "");
		}
		
	}

}
