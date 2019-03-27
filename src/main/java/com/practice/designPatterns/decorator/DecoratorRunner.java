package com.practice.designPatterns.decorator;

public class DecoratorRunner {

	public static void main(String[] args) {

		//SatelliteTV satelliteTV = new Discovery(new ESPN(new CartoonNetwork(new SkyTV())));
		// SatelliteTV satelliteTV = new ESPN(new SkyTV());
		SatelliteTV satelliteTV = new Discovery(new ESPN(new SkyTV()));
		satelliteTV.show(110);
		System.out.println("Total Subscription Fee: " + satelliteTV.subscriptionPrice());
	}

}
