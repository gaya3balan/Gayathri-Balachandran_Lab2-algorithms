package com.gl.gayathri.lab2algorithm.problem2.service;
import java.util.Scanner;

public class TravelerPayment {

	public void getDenominations(Integer denominations[]) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<denominations.length; i++) {
			denominations[i]=scan.nextInt();
			
		}
		
	}
	
	public void denominationsToPay(Integer denominations[], int amountToBePaid, int noOfDenominations) {      //Pass denominations array type as Integer instead of int as we are using Arrays sort method that takes Integer type in driver class 
		
		int denominationsToPay[] = new int[noOfDenominations];
		
		int amount = amountToBePaid;
		
		for(int i=0; i<denominations.length;i++) {
			
			denominationsToPay[i]=amount/denominations[i];              //divide the
			
			amount-=(denominations[i]*denominationsToPay[i]);
			
		           }
		
		if(amount!=0) {
			System.out.println("Sorry cant make exact payment");
			return;
		      }
	
		System.out.println("Your payment approach in order to give min no of notes will be" );
		
		for (int j=0; j<denominations.length; j++) {
			
			if(denominationsToPay[j] !=0) {
				System.out.println(denominations[j] + ":" +denominationsToPay[j]);
				
			       }
			
		   }
		
	}
	
 
}