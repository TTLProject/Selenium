package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Second {
	@Test(groups= {"bike","car"})
	public void bike() {
		System.out.println("bike is running");
	}
	@Test(groups= {"car"})
	public void car() {
		System.out.println("car is running");
	}
	@Test(groups= {"bike","car"})
	public void bike1() {
		System.out.println("bike1 is running");
	}
	@Test(groups= {"bike","car"})
	public void car1() {
		System.out.println("car1 is running");
	}

}
