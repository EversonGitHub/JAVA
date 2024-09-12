package DesignPatterns.Builder;

public class Person {
	private String name;
	private String lastName;
	private String userName;
	private String email;
	
	private Person(String n, String ln, String un, String e) {
		name = n;
		lastName = ln;
		userName = un;
		email = e;
	}
	
	@Override
	public String toString() {
		return "PersonBuilder\nName: " + name + ".\nLast Name: " + lastName + ".\nUserName: " + userName + ".\nEmail: " + email + ".";
	}
	
	public static class PersonBuilder{
		private String name;
		private String lastName;
		private String userName;
		private String email;
		
		

		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public PersonBuilder userName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public PersonBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public Person build() {
			return new Person(name, lastName, userName, email);
		}
	}
}