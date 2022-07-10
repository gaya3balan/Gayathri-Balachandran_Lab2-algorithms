package com.gl.gayathri.lab2algorithm.problem1.service;

import java.util.Scanner;

public class PayMoneyService {
	
	public void targetcheck(int targetAmount[], int transactionAmounts[]) { //targetcheck method
		
		Scanner scan = new Scanner(System.in);
		
	for(int i=0; i< targetAmount.length; i++) {
		
		System.out.println("enter the value of target ");    //request user to enter value of target
		
		int targettedAmount = scan.nextInt();
		
		boolean isTargetAchieved = false; 
		
		int total = 0;                                       //initialize total before computation
		
		for (int j=0; j< transactionAmounts.length; j++) {
			
			total += transactionAmounts[j];                     // start adding the amounts in transactionAmounts array 
			
			if (total>= targettedAmount) {
				
				System.out.println("Target achieved after " + (j+1)+ " transactions" + "\n");   //once sum of transaction amounts >= targetted amount
				isTargetAchieved = true;                                                 //set flag isTargetAchieved to true and exit loop 
				break;
				
			}
			
		}
		
		if ( ! isTargetAchieved )
			
			System.out.println("Given target is not achieved");                   //if target is not achieved
		
	   }
	
	}
}
