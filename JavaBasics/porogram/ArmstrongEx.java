package in.co.porogram;

public class ArmstrongEx {
	public static void main(String[] args) {		
	
	int number = 1634; // Change this to the desired number 153/3
    int originalNumber, remainder, result = 0;
    originalNumber = number ;

    while (originalNumber != 0) {
        remainder = originalNumber % 10;
        result += Math.pow(remainder, 4);
        originalNumber /= 10;
    }

    if (result == number)
        System.out.println(number + " is an Armstrong number.");
    else
        System.out.println(number + " is not an Armstrong number.");

}
}
