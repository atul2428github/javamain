package com.assignment1;    // create package
                // writ program to print anything STRING by using user input

import java.util.Scanner; // scanner import

         //class design
public class WlcomeProgram { 
	//design main method 
	public static void main(String [] args) {
		//scanner design  
		Scanner scanner =new Scanner(System.in);
		//printing statment
	       System.out.println("Enter the name..... ");
	       // assine in variable
	       String S=scanner.next();  //call by using scanner objet
	       // printing statment a
	       System.out.println("The name is........" +S +" ");
		
	}

}
