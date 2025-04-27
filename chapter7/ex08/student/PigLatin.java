// Write your code here
import java.util.Scanner;
public class PigLatin{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word to be converted to Pig Latin >> ");
        String word = input.nextLine();

        char start =  word.charAt(0);

        
        if ((start == 'a') || (start == 'e') || (start == 'i') || (start == 'o') || (start == 'u')){
            System.out.print("Pig Latin version: " + (word + "ay"));
        }
        else{
            int i = 1;
            start = word.charAt(i);
            while (!((start == 'a') || (start == 'e') || (start == 'i') || (start == 'o') || (start == 'u') || (start == 'y'))){
                i++;
                start = word.charAt(i);
            }

            System.out.print("Pig Latin version: " + (word.substring(i) + "ay"));

        }



        input.close();

    } 
}