package in.co.porogram;

public class HelloName {
 public static void main(String[] args) {
	 //System.out.println(args[0]);
	 if (args.length==3) {
		 System.out.println("Hello" +args[0]);
	 }
	 else  {
		 System.out.println("Parameter name is required");
	 }
	 
	 
	}
}
