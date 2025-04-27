// Write your code here
import java.util.Scanner;
public class ValidatePassword{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string >> ");
        String pw = input.nextLine();
        int upCase = 0;
        int lowCase = 0;
        int digit = 0;
      

        for (int i = 0 ; i < pw.length() ; i ++ ){
            char character = pw.charAt(i);
            if (Character.isLowerCase(character)) {
                lowCase ++;
                // System.out.println(character + " is a lowercase letter.");
            } else if (Character.isUpperCase(character)) {
                upCase++;
                // System.out.println(character + " is an uppercase letter.");
            } else if (Character.isDigit(character)) {
                digit ++;
                // System.out.println(character + " is a digit.");
            } 
        }
        if ((upCase >= 2) && (lowCase>=3) && (digit>=1)){
            System.out.println("Valid password");

        }
        else{
            if ((upCase >= 2) && (lowCase>=3)){
            System.out.println("The password did not have enough: " + "digits");
        }
        else if ((lowCase>=3) && (digit>=1)){
            System.out.println("The password did not have enough: " + "uppercase");
        }
        else if ((upCase >=2 ) && (digit >= 1)){
            System.out.println("The password did not have enough: " + "lowerCase");
        }
        else if (upCase >=2 ){
            System.out.println("The password did not have enough: " + "digits, lowercase");
        }
        else if (lowCase>=3){
            System.out.println("The password did not have enough: " + "uppercase, digit");

        }
        else if (digit >= 1){
            System.out.println("The password did not have enough: " + "lowerCase, uppercase");
        }
        else{
            System.out.println("The password did not have enough: " + "digits, lowerCase, uppercase");
            
            
        }


    }
    input.close();
    }

}

