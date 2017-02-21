/**
 *   File Name: Character.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 25, 2017
 *
 */

package com.sqa.gy;

/**
 * Character
 *
 * @author Yakovenko, Galina
 */
public class Person {

	private String dateOfBirth;

	private char gender;

	private String name;
	String[] pronouns = new String[2];

	public Person() {
		super();
		this.name = "Unknown";
		this.gender = 'U';
		this.dateOfBirth = "MM/DD/YYYY";
		setPronouns();
	}

	public Person(String name, char gender, String dateOfBirth) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		setPronouns();
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public char getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public String[] getPronouns() {
		return this.pronouns;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Override
	public void setPronouns() {
		if (this.gender == 'F') {
			this.pronouns[0] = "she";
			this.pronouns[1] = "her";
		} else if (this.gender == 'M') {
			this.pronouns[0] = "he";
			this.pronouns[1] = "his";
		} else {
			this.pronouns[0] = "they";
			this.pronouns[1] = "their";
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person: ");
		builder.append(this.name);
		builder.append("\n");
		builder.append((this.pronouns[1].substring(0, 1)).toUpperCase());
		builder.append(this.pronouns[1].substring(1, this.pronouns[1].length()));
		builder.append(" birthday is ");
		builder.append(this.dateOfBirth);
		builder.append(".\n");
		return builder.toString();
	}
}
