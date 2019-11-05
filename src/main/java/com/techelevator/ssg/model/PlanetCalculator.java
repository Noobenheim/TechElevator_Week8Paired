package com.techelevator.ssg.model;

import java.util.ArrayList;
import java.util.List;

public class PlanetCalculator {
	
	public static List<Planet> planets = new ArrayList<>();
	
	private static final int WALKING_SPEED = 3;
	private static final int CAR_SPEED = 100;
	private static final int BULLET_TRAIN_SPEED = 200;
	private static final int BOEING_747_SPEED = 570;
	private static final int CONCORDE_SPEED = 1350;
	
	static {
		Planet mercury = new Planet("Mercury", 0.37, 87.96, 56974146);
		Planet venus = new Planet("Venus", 0.90, 224.68, 25724767);
		Planet earth = new Planet("Earth", 1, 365.26, 0);
		Planet mars = new Planet("Mars", 0.38, 686.98, 48678219);
		Planet jupiter = new Planet("Jupiter", 2.65, 11.862, 390674710);
		Planet saturn = new Planet("Saturn", 1.13, 29.456, 792248270);
		Planet uranus = new Planet("Uranus", 1.09, 84.07, 1692662530);
		Planet neptune = new Planet("Neptune", 1.43, 164.81, 2703959960L);
		
		planets.add(mercury);
		planets.add(venus);
		planets.add(earth);
		planets.add(mars);
		planets.add(jupiter);
		planets.add(saturn);
		planets.add(uranus);
		planets.add(neptune);

		//Dear Tom: If Pluto is a planet, so are the rest of the Kuiper Belt objects.
		/*planets.add("Eris");
		planets.add("Makemake");
		planets.add("Pluto");
		planets.add("Haumea");*/
	}
	
	public static double planetAge(int earthAge, String planetName) {
		Planet inputPlanet = getPlanetFromString(planetName);
		Planet earth = getPlanetFromString("Earth");
		
		return earthAge * earth.getYearInEarthDays() / inputPlanet.getYearInEarthDays();
	}
	
	public static Planet getPlanetFromString(String input) {
		for(Planet p : planets) {
			if(p.getName().equals(input)) {
				return p;
			}
		} return null;
	}
	
	public static double planetWeight(int earthWeight, String planetName) {
		Planet inputPlanet = getPlanetFromString(planetName);
		
		return earthWeight * inputPlanet.getGravity();
	}
	
	public static double timeToTravelInYears(String planetName, String travelMethod) {
		int speed = 0;
		switch( travelMethod.toLowerCase() ) {
			case "walking":
				speed = WALKING_SPEED;
				break;
			case "car":
				speed = CAR_SPEED;
				break;
			case "bullet_train":
				speed = BULLET_TRAIN_SPEED;
				break;
			case "boeing_747":
				speed = BOEING_747_SPEED;
				break;
			case "concorde":
				speed = CONCORDE_SPEED;
				break;
			default:
				return 0;
		}
		
		Planet planet = getPlanetFromString(planetName);
		return (planet.getAverageDistance() / (double)speed) / 24.0 / 365.0;
		//											   hours   days   years
	}
}
