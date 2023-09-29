import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println("Hi, Welcome to TM cLoud solutions ");
		System.out.print("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String ab = a.substring(0 , 1);
		String cd = a.substring(1);
		System.out.println("Hello," + ab.toUpperCase() + cd.toLowerCase()  + ", below are the items present in our super market"
				+ " 1.Shanpoo"
				+ " 2. Body Wash"
				+ " 3. Hair Oil ");

	}

}
