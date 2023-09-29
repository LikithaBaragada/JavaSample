import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		// Arithmetic operations +, -, *, /, %, 
		int a = (int) Math.pow(2,3); // 2 to the power of 3
		System.out.println(a);
		
		// Comparison operations <, >, <=, >=, ==, !=
		double b = 10;
		double c = 4;
		boolean d = b>c;
		System.out.println(d);
		
		//string operations
		String g = "BarAgaDa";
		String h = "sai";
		System.out.println(h.toUpperCase() + " " + g.toLowerCase());
		System.out.println(h.concat(g));
		
		//logical operators - ||,&&,!
		boolean i = (b==c);
		boolean j = d && i ;
		System.out.println(j);
		
		// scanner function
		System.out.print("enter your name: ");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		String abc = sc.nextLine();
		System.out.println(abc);
		}
	}

}
