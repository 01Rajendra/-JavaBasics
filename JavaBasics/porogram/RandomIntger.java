package in.co.porogram;

import java.util.Random;

public class RandomIntger {
	
	    public static void main(String[] args) {
	        Random random = new Random();
	        for (int i = 0; i < 5; i++) {
	            int randomNumber = random.nextInt(100) + 1;
	            System.out.println("Random Integer " + (i + 1) + ": " + randomNumber);
	        }
	    }
	}


