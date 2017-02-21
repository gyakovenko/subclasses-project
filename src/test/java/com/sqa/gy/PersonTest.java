package com.sqa.gy;

import org.junit.*;

public class PersonTest {

	@Test
	@Ignore
	public void PersonDefaultTest() {
		Person person1 = new Person();
		System.out.println(person1);
	}

	@Test
	@Ignore
	public void PersonThreeArgsTest() {
		Person person2 = new Person("Galina", 'F', "04/06/1987");
		System.out.println(person2);
	}

	@Test
	@Ignore
	public void testAllTheArgsWorker() {
		Person worker2 = new Worker("Isha", 'F', "08/07/1990", "03/01/2017", true, 0, 40, true, "Automation Engineer",
				95000);
		System.out.println(worker2);
	}

	@Test
	@Ignore
	public void testDefaultWorker() {
		Person worker1 = new Worker();
		System.out.println(worker1);
		System.out.println("");
	}

	@Test
	public void testDisplayJobResponsibilities1() {
		Person worker3 = new Worker("Isha", 'F', "08/07/1990", "03/01/2017", true, 0, 40, true, "Automation Engineer",
				95000);
		System.out.println(worker3);
		((Worker) worker3).displayJobAction("testing", "a web application", "Selenium with Java");
	}

	@Test
	public void testDisplayJobResponsibilities2() {
		Person worker4 = new Worker("Galina", 'F', "04/06/1987", "01/01/2017", false, 0, 0, false, "unemployed", 0);
		System.out.println(worker4);
		((Worker) worker4).displayJobAction("searching for", "a job", "craigslist");
	}

}
