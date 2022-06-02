package com.pluralsight.tddjunit5.Testairport;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.pluralsight.tddjunit5.airport.Flight;
import com.pluralsight.tddjunit5.airport.Passenger;

class AirportTest {

	@Test
	public void testAirport() {
		 Flight economyFlight = new Flight("1", "Economy");
	        Flight businessFlight = new Flight("2", "Business");

	        Passenger john = new Passenger("John", true);
	        Passenger mike = new Passenger("Mike", false);
	        
	        assertEquals(true,economyFlight.addPassenger(john));
	        assertEquals(false,economyFlight.removePassenger(john));
	        assertEquals(true,businessFlight.addPassenger(john));
	        assertEquals(false,businessFlight.removePassenger(john));
	        
	        assertEquals(true,economyFlight.addPassenger(mike));
	        assertEquals(true,economyFlight.removePassenger(mike));
	        assertEquals(false,businessFlight.addPassenger(mike));
	        assertEquals(false,businessFlight.addPassenger(mike));
	}

}
