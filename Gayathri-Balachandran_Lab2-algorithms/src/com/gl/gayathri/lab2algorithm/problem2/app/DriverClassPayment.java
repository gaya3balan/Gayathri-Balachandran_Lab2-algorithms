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
		
		System.out.println("enter the size of currency denominations" );
		
		int denominationsNumber = scan.nextInt();            
		
		Integer denominationsArray[] = new Integer[denominationsNumber];
		
		System.out.println("enter the currency denominations value: " );
		
		object.getDenominations(denominationsArray);
		
        System.out.println("enter the amount you want to pay " );
		
		int amountToBePaid=scan.nextInt();
		
		Arrays.sort(denominationsArray, Collections.reverseOrder());   //use Arrays.sort method and reverse Order to sort array in descending order 
		
		object.denominationsToPay( denominationsArray,  amountToBePaid,  denominationsNumber); //call de

	}
}

