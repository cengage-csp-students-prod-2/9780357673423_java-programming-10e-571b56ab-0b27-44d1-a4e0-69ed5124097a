// Write your code here
import java.util.Scanner;
public class AcmePay{
    public static void main(String[] args){

        double firstShift = 17;
        double secondShift = 18.50;
        double thirdShift = 22;

        double payRate = 0, regPay = 0, overPay = 0, grossPay, retPay = 0, netPay;
        double ret = 2;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter shift - 1, 2, or 3 >> ");
        double shift = input.nextFloat();

        System.out.print("Please enter hours worked (can be a fraction) >> ");
        double hour = input.nextFloat();
        if (shift == 2 || shift == 3){
        System.out.println("Do you want to participate in the retirement plan?");
        System.out.print("Enter 1 for Yes and 2 for No >> ");
        ret = input.nextFloat();
        }

        System.out.println("Hours worked is " + hour);
        System.out.println("Shift: " + shift);
        if (shift == 1){
            payRate = firstShift;
        }
    
        else if(shift == 2){
            payRate = secondShift;
        }
        else if (shift == 3){
            payRate = thirdShift;
        }
        
        System.out.println("Hourly pay rate is " + payRate);
        regPay = hour * payRate;
        System.out.println("Regular pay is " + regPay);
        if (hour <= 40){
            overPay = 0;
        }
        else if (hour > 40){
            overPay = (hour -40) * payRate * 1.5;
        }
        System.out.println("Overtime pay is " + overPay);

        if (ret == 2){
            retPay = 0;
        }
        else if(ret == 1){
            retPay = 0.03 * (regPay + overPay);
        }
        System.out.println("Retirement deduction is " + retPay);

        netPay = (regPay + overPay) - retPay;
        System.out.println("Net pay is.............." + netPay);
    
}

}