package com.gl.gayathri.lab2algorithm.problem1.app;
import java.util.Scanner;

import com.gl.gayathri.lab2algorithm.problem1.service.PayMoneyService;

public class DriverPayMoney {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int transactionsCount;
			
			System.out.println("enter the size of transaction array");   //ask user to enter no. of transactions 
			
			transactionsCount=scan.nextInt();                             
			
			int amountOfTransaction [] = new int[ transactionsCount];
			
			System.out.println("enter the values of array");            // ask user to enter values
			
			for (int i=0; i< amountOfTransaction.length; i++) {         //scan the amounts to transaction amounts array 
				
				amountOfTransaction[i] =scan.nextInt();
				
			}
			
			System.out.println("enter the total no of targets that needs to be achieved ");
			
			int targetCount = scan.nextInt();                           // ask use to enter target count and scan it
			
			int targettedAmount[] = new int[targetCount];              
			
			PayMoneyService object = new PayMoneyService();            // create object of PayMoneyService class
			
			object.targetcheck(targettedAmount, amountOfTransaction);   //use object to access method targetcheck of PayMoneyService class
			
			scan.close();                                               //close scanner at end of main to free up resources
		}
		
	}



