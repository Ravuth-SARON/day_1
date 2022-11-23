import java.util.Scanner;
public class TP06_07 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please Enter a sentence: ");
        String input=in.nextLine();

       input= input.replace("\\n", "(new_line)");
       input= input.replace("\\t", "(tab)");
       input= input.replace("\\\\", "(slash)");
       input= input.replace("//", "(comment)");
       input= input.replace(":)", "(smile)");


        System.out.println(input);



        
        
    }
    
}
