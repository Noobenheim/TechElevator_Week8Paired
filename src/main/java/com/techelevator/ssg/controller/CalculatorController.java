package com.techelevator.ssg.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.PlanetCalculator;

@Controller
public class CalculatorController {
	
	
	//URL for Alien Age, should match with header.jsp
	@RequestMapping("/alienAgeInput")
	public String displayAlienAge(ModelMap modelHolder) {
		modelHolder.put("planets",PlanetCalculator.planets);
		return "alienAgeInput";
	}
	
	@RequestMapping("/alienAgeResult")
	public String calculateAlienAge(@RequestParam String inputPlanet, int inputAge, ModelMap modelHolder) {
		modelHolder.put("planet", PlanetCalculator.getPlanetFromString(inputPlanet));
		modelHolder.put("planetAge", PlanetCalculator.planetAge(inputAge, inputPlanet));
		return "alienAgeResult";
	}
	
	@RequestMapping("/alienWeightInput")
	public String displayAlienWeight(ModelMap modelHolder) {
		modelHolder.put("planets", PlanetCalculator.planets);
		return "alienWeightInput";
	}
	
	@RequestMapping("/alienWeightResult")
	public String calculateAlienWeight(@RequestParam String inputPlanet, int inputWeight, ModelMap modelHolder) {
		modelHolder.put("planet",PlanetCalculator.getPlanetFromString(inputPlanet));
		modelHolder.put("planetWeight", PlanetCalculator.planetWeight(inputWeight, inputPlanet));
		return "alienWeightResult";
	}
	
	@RequestMapping("/alienDriveTimeInput")
	public String displayAlientDriveTime(ModelMap modelHolder) {
		modelHolder.put("planets",PlanetCalculator.planets);
		return "alienDriveTimeInput";
	}
	
	@RequestMapping("/alienDriveTimeResult")
	public String calculateAlienDriveTime(@RequestParam String inputPlanet, @RequestParam String inputType, @RequestParam int inputAge, ModelMap modelHolder) {
		double time = PlanetCalculator.timeToTravelInYears(inputPlanet, inputType);
		
		String travelMethod = "unknown";
		switch( inputType.toLowerCase() ) {
		case "walking":
			travelMethod = "walking";
			break;
		case "car":
			travelMethod = "car";
			break;
		case "bullet_train":
			travelMethod = "bullet train";
			break;
		case "boeing_747":
			travelMethod = "Boeing 747";
			break;
		case "concorde":
			travelMethod = "Concorde";
			break;
	}
		
		modelHolder.put("planet", PlanetCalculator.getPlanetFromString(inputPlanet));
		modelHolder.put("travelMethod", travelMethod);
		modelHolder.put("newAge", inputAge + time);
		modelHolder.put("travelTime", time);
		
		return "alienDriveTimeResult";
	}
}
