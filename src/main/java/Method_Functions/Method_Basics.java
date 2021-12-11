package Method_Functions;

public class Method_Basics {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		
		int k1 = test();
		System.out.println(k1);
		
		//String S4 = test1();
		//System.out.println(S4);

	}

		public static int test() {
		System.out.println("This is a test method");
		int i = 10;
		int j = 20;
		int k = i+j;
		
		return k;
	}

		//public static String() {
			
		}