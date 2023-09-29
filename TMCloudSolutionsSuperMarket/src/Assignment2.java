import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		Double number = sc.nextDouble();
		
		// fizzbuzz exercise
		if(number%3==0 && number%5==0){
			System.out.println("fizzbuzz");
			}
		else if(number%5 ==0) {
			System.out.println("buzz");
			}
		else if(number%3==0) {
			System.out.println("fizz");
		}
		else {
			System.out.println(number);		
		}
		sc.close();


	}

}
