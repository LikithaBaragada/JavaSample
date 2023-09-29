import java.util.*;
import java.io.*;

public class Loops2 {
	public static void main(String []argh){
    Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        
        for(int j= 0; j<n; j++){
            int y;
            int s =0;
            for(int z= 0; z<=j; z++){
            y = (int) Math.pow(2,z);
            s= s +  b*y;
            }
            
            int ans = (a + s);
            System.out.print(ans + " ");
        }
        System.out.println();
    }
    in.close();
}


}
