package in.co.porogram;

public class TestBuffer {
	public static void main(String[]args) {
	String name= "Rajendra Negi";
	System.out.println("String Length-" + name.length()); 
	System.out.println("7th character is-" +name.charAt(6));
	System.out.println("Negi index is-"  +name.indexOf("Negi"));
	System.out.println("first i position-" +name.indexOf("i"));
	System.out.println("Last i postion-" +name.indexOf("i"));
	System.out.println("a is replaced by b-" + name.replace("a","b"));
	System.out.println(" chota Negi-" +name.toLowerCase());
	System.out.println("Bada Negi-" +name.toUpperCase());
	System.out.println("Start with Rajendra-" + name.startsWith("Rajendra"));
	System.out.println("End with egi-" +name.endsWith("egi"));
	System.out.println("Substring-" +name.substring(6));
	}

}
