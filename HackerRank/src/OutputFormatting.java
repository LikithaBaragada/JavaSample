import java.util.Scanner;

public class OutputFormatting {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            System.out.print(s1);
            for (int j= s1.length(); j<15; j++){
                System.out.print(" ");
            }
            int x=sc.nextInt();
            String s2 = Integer.toString(x);
            for (int z = s2.length(); z<3; z++ ){
                System.out.print("0");
            }
            System.out.println(x);
            
        }
        System.out.println("================================");

}

}
