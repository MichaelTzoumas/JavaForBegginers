package javaForBeginners;


import java.util.Scanner;

public class JavaForBeginners {

	public static void main(String[] args) {
		System.out.println("Hello World");                  //Τυπώνει Hello World
		Scanner in = new Scanner(System.in);		    // Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S
		/*	Scanner s = new Scanner(System.in);  -----> //2ος τρόπος να δουλέψει το Scanner()*/
		String s=in.nextLine();				    //Παίρνει δεδομένα απο το πληκτρολόγιο και τα βάζει στην μεταβλητη S Τύπου String
	        System.out.println(s+" Michael");                       //Τυπώνει το περιεχόμενο της s (δλδ οτι πληρκτρολογήσαμε)

	    
	    
	    
	    
	    
	    in.close();                                              //κλείνω το Scanner για να μη καταναλώνει τζαμπα μνήμη
	}

}
