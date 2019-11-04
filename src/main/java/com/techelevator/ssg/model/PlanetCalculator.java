package com.techelevator.ssg.model;

import java.util.ArrayList;
import java.util.List;

public class PlanetCalculator {
	
	public static List<Planet> planets = new ArrayList();
	
	static {
		Planet mercury = new Planet("Mercury", 3.59, 87.96, 56974146);
		Planet venus = new Planet("Venus", 8.87, 224.68, 25724767);
		Planet earth = new Planet("Earth", 9.81, 365.26, 0);
		Planet mars = new Planet("Mars", 3.77, 686.98, 48678219);
		Planet jupiter = new Planet("Jupiter", 25.95, 11.862, 390674710);
		Planet saturn = new Planet("Saturn", 11.08, 29.456, 792248270);
		Planet uranus = new Planet("Uranus", 10.67, 84.07, 1692662530);
		Planet neptune = new Planet("Neptune", 14.07, 164.81, 2703959960L);
		
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
	
	
}
