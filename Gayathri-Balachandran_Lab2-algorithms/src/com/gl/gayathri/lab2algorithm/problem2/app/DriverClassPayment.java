package com.gl.gayathri.lab2algorithm.problem2.app;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import com.gl.gayathri.lab2algorithm.problem2.service.TravelerPayment;

public class DriverClassPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		TravelerPayment object = new TravelerPayment();    //create object of TravelerPayment class 
		
		System.out.println("Enter the size of currency denominations" );   //request user for inputs
		
		int denominationsNumber = scan.nextInt();            
		
		Integer denominationsArray[] = new Integer[denominationsNumber];
		
		System.out.println("Enter the currency denominations value" );   //request user for inputs 
		
		object.getDenominations(denominationsArray);       // use object to call getDenomations method and pass denomationsArray 
		
        System.out.println("Enter the amount you want to pay" );          //request user for inputs
		
		int amountToBePaid=scan.nextInt();
		
		Arrays.sort(denominationsArray, Collections.reverseOrder());   //use Arrays.sort method and reverse Order to sort array in descending order 
		
		object.denominationsToPay( denominationsArray,  amountToBePaid,  denominationsNumber); //Call denominationsToPay method using object 

		scan.close();
	}
}

