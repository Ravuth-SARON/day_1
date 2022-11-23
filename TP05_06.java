import java.util.Scanner;


public class TP05_06 {
    static void MakePalindrome(String string){
        char RevWord;
        String rev="";
        
        
        for(int i=0;i<string.length();i++){
            RevWord=string.charAt(i);
            rev=RevWord+rev; 
        }
        System.out.println(string+rev);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter a word : ");
        String word=in.nextLine();

        MakePalindrome(word);
    }
    
}
