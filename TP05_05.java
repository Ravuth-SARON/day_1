import java.util.Scanner;

public class TP05_05 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        char RevWord;
        String rev="";
        Scanner in=new Scanner(System.in);
        System.out.print("Enter string: ");
        String word=in.nextLine();
        System.out.println("Choose method (REV, LOOP): REV ");
        
        for(int i=0;i<word.length();i++){
            RevWord=word.charAt(i);
            rev=RevWord+rev; 
            
        }
        if(word.equals(rev)){
            System.out.println(word + " is  a Palindrome.");

        }
        else{
            System.out.println(word+" is not Palindrome string");
        }
        
       
        
    }
    

    
}
