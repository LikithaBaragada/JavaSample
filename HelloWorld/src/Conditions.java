import java.util.Scanner;
public class Conditions {

	public static void main(String[] args) {
		System.out.print("Enter your salary : ");
		Scanner sc = new Scanner(System.in);
		Double salary = sc.nextDouble();
		
		// if condition
		// below 50k - 10%tax cut aythadhi
		if(salary < 50000){
			Double tax = salary * 0.10;
			Double finalAmount = salary - tax;
			System.out.println(finalAmount);
			}
		
		// 50-100k income - 15%tax
		else if(50000 <= salary && salary < 100000) {
			Double tax = salary * 0.15;
			Double finalAmount = salary - tax;
			System.out.println(finalAmount);
			}
		else {
			System.out.println("else block");
		}
		sc.close();
		}

}
