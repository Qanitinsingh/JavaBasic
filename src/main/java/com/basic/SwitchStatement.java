package com.basic;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	void switchExample()
	{
		int day = 4;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
	}
	
	
	void defaultSwitch()
	{
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
	}
	
	void switchContinueExample () {
		{
		    // First label
		    first:
		        for (int i = 0; i < 3; i++) {
		        // Second label
		        second:
		            for (int j = 0; j < 3; j++) {
		                if (i == 1 && j == 1) {
		 
		                    // Using continue statement with label
		                    continue first;
		                }
		                System.out.println(i + " " + j);
		            }
		        }
		    }
	}
}
