
package ex11;
import java.util.*;

public class Ex11 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("forward distance");
        int f=sc.nextInt();
         System.out.println("backward distance");
        int b=sc.nextInt();
         System.out.println("time need cover 1distance");
        int t=sc.nextInt();
        System.out.println("distance of wall");
        int d=sc.nextInt();
        int t1=0;
        while(b<d){
            d=d-b;
            t1=t1+(t*b);
            d=d+f;
            t1=t1+(t*f);
        }
        System.out.println("before hit distance"+d);
        if(d==b){
          
            t1=t1+(t*b);
        }
        System.out.println("time"+ t1);
    }
    
}
