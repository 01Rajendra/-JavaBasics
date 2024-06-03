package in.co.porogram;

public class DivisibleNo {
	

	    public static void main(String[] args) {
	        int sum = 0;
	        int count = 0;

	        for (int i = 101; i < 200; i++) {
	            if (i % 7 == 0) {
	                sum += i;
	                count++;
	            }
	        }

	        System.out.println("The Sum of the numbers between 100 and 200 which are divisible by 7 is: " + sum);
	        System.out.println("Total numbers between 100 and 200 which are divisible by 7: " + count);
	    }
	}

	    
	



