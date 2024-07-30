// 1. Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

package first;

public class Person {
	
	String name;
	int age;

	//Constructor
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// Main method
	
	public static void main(String[] args) {

		Person person1 = new Person("Julia Donaldson", 55);
		Person person2 = new Person("Axel Scheffler", 40);
		System.out.println("Name :" + person1.name + " Age: " +person1.age);
		System.out.println("Name :" + person2.name + " Age: " +person2.age);
	}

}