package pom.com;

public class Calling {
	public static void call() throws Exception {
		Objectes.profile().selectByIndex(3);
		Objectes.name().sendKeys("gfdfdd");
		//Objectes.gender().click();
		Objectes.dd().selectByIndex(5);
		Objectes.month().selectByValue("5");
		Objectes.year().selectByValue("1995");
		Objectes.region().selectByValue("1");
		Objectes.mothertoung().selectByValue("47");
		Objectes.caste().selectByValue("98");
		Objectes.covntryivingin().selectByValue("98");
		Objectes.country().selectByValue("98");
		Objectes.moblieno().sendKeys("9635845285");
		Objectes.email().sendKeys("jgjsfsdh@gmail.com");
		Objectes.pwd().sendKeys("hdgdgfhfh");
		Objectes.register().click();
	}

}
