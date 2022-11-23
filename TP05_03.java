import java.util.*;

public class TP05_03{
    public static void main(String[] args) {
        int i;
        
        Scanner in=new Scanner(System.in);
        System.out.println("\t\tFinding All Even number between A and 500");
        System.out.print("\n\t\tInput A:");
        int number=in.nextInt();
        if(number>=500){
            System.out.println("Please Enter the value of A below 500 ");
        }
        else{
            System.out.println("\n\t\tAll the Even Number between  "+ number +" to 500 are: ");

            for(i=number;i<500;i++){
                if(i%2==0){
                    System.out.println(i);   
                }
            }
       }

    }
}
