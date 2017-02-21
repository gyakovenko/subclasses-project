package com.sqa.gy;

import java.text.*;

public class Worker extends Person implements IPerson {
	private static int numOfEmployees; // will be true for all employees and
	static DecimalFormat dfMoney = new DecimalFormat("$#,###.##");

	public static int getNumOfEmployees() {
		return numOfEmployees;
	}

	public static void setNumOfEmployees(int numOfEmployees) {
		Worker.numOfEmployees = numOfEmployees;
	}

	// will update for all not for each
	private String dateOfHire;
	private boolean fullTime;
	private double hourlyRate;
	private int hoursPerWeek;
	private boolean isSalary;

	private String jobTitle;

	private double yearlySalary;

	public Worker() {
		super();
		this.dateOfHire = "MM/DD/YYYY";
		this.fullTime = false;
		this.hourlyRate = 0;
		this.hoursPerWeek = 0;
		this.isSalary = false;
		this.jobTitle = "Unknown";
		this.yearlySalary = 0;
	}

	public Worker(String name, char gender, String dateOfBirth, String dateOfHire, boolean fullTime, double hourlyRate,
			int hoursPerWeek, boolean isSalary, String jobTitle, double yearlySalary) {
		super(name, gender, dateOfBirth);
		this.dateOfHire = dateOfHire;
		this.fullTime = fullTime;
		this.hourlyRate = hourlyRate;
		this.hoursPerWeek = hoursPerWeek;
		this.isSalary = isSalary;
		this.jobTitle = jobTitle;
		this.yearlySalary = yearlySalary;
	}

	public void convertAndUpdateHourlyandYearly() {
		if (getHourlyRate() == 0) {
			setHourlyRate(getYearlySalary() / 2080);
		} else if (getYearlySalary() == 0) {
			setYearlySalary(getYearlySalary() * 2080);
		}
	}

	public void displayJobAction(String whatIsDoing, String whatTo, String usingWhat) {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getName());
		builder.append(" is responsible for ");
		builder.append(whatIsDoing);
		builder.append(" ");
		builder.append(whatTo);
		builder.append(" using ");
		builder.append(usingWhat);
		builder.append(".\n");
		System.out.println(builder);
	}

	public String getDateOfHire() {
		return this.dateOfHire;
	}

	public double getHourlyRate() {
		return this.hourlyRate;
	}

	public int getHoursPerWeek() {
		return this.hoursPerWeek;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public double getYearlySalary() {
		return this.yearlySalary;
	}

	public boolean isFullTime() {
		return this.fullTime;
	}

	public boolean isSalary() {
		return this.isSalary;
	}

	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public void setYearlySalary(double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}

	/**
	 * @see com.sqa.gy.IPerson#talk(java.lang.String)
	 */
	@Override
	public void talk(String words) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("As of ");
		builder.append(this.dateOfHire);
		builder.append(", ");
		builder.append(super.getName());
		builder.append(" is a ");
		builder.append(this.jobTitle);
		builder.append(" earning ");
		builder.append(dfMoney.format(this.yearlySalary));
		builder.append(" per year.");
		return builder.toString();

	}

}
