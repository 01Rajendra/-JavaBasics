package in.co.porogram;

public class SearchKey {
//	public static void main(String[] args) {
	//	int num[] = {12,445,6,34,645,4543,35,65,46,46,653};
		//int key = 46;
	//	int index = search(num,key);
	//	if(index == -1) {
		//	System.out.println("key not found"+key);
	//	}else {
		//	System.out.println("key found at: " + key);
		//}
		
//	}
	//public static int search(int num[],int key) {
		//for(int i=0;i<num.length;i++) {
			//if(num[i]==key) {
				//return i;
		//	}else {
			//}
			
	//	}
		//return -1;
	//}
//}

	public static void main(String []args) {
		String fruit[] = {"mango ", " banana","orange","grapes","lemon","apple","litchi"};
		String key = "apple";
		int index = search(fruit,key);
		if(index == -1) {
			System.out.println("key is not found " + key);
		}else {
			System.out.println("key is found at " + key);
		}
		
	}
	public static int  search(String fruit[],String key) {
		for (int  i=0;i<fruit.length;i++) {
			if(fruit[i] == key) {
				return i;
			}
		
	}
		return -1;
	}
}