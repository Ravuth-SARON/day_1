import java.util.*;
public class TP05_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=12;i++){
          System.out.print("Profit for month "+i+ ":");
          int num=in.nextInt();
          sum=sum+num;
          
        }
        System.out.println("Total profits for 12 months : "+sum);
    }
    
}
