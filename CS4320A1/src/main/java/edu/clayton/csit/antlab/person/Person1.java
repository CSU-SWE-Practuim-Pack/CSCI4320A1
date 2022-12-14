package edu.clayton.csit.antlab.person;

/*
   A simple class for person 1
   returns their name and a
   modified string

   @author Darnel Castor
 *  @version 1.1
 */
  /** Holds the persons real name */
  public class Person1 {
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		// loop to reverse the string
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str += input.charAt(i);
		}
	  return str;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
