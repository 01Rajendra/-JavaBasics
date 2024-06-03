package in.co.porogram;

public class TwoDimentional {
	
	
	    public static void main(String[] args) {
	        int[][] table = new int[9][10];

	        // Fill the table with values from 2 to 10
	        for (int row = 0; row < 9; row++) {
	            for (int col = 0; col < 10; col++) {
	                table[row][col] = (row + 1) * (col + 2);
	            }
	        }

	        // Display the table
	        for (int row = 0; row < 9; row++) {
	            for (int col = 0; col < 10; col++) {
	                System.out.print(table[row][col] + "\t");
	            }
	            System.out.println();
	        }
	    }
	}



