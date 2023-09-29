
import java.io.*;
import java.math.*;
import java.util.*;


public class JavaIfElse{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        if (n%2 == 1){
            System.out.println("Weird");
        }
        else if(n%2 == 0){
            if(2<=n && n<5){
               System.out.println("Not Weird"); 
            }
            else if(6<=n && n<=20){
                System.out.println("Weird");
            }
            else if(n>20) {
                System.out.println("Not Weird");
            }
        }

    
    }
}

