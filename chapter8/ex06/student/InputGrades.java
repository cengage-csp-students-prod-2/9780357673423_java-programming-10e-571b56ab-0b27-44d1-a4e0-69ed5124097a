// Write your code here
import java.util.Scanner;
public class InputGrades{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in );

        Student[] st = new Student[10];

        for (int i = 0; i < 10 ; i++ ){
            System.out.print("For student #" + (i+1) + ", enter the student ID >> " );
            int id = input.nextInt();
            for (int j = 0; j < 5; j ++){
                System.out.print("For student #" + (i+1) + ", enter course >> " + (j+1) );
                String course = input.nextLine();
                System.out.print("For student #" + (i+1) + ", enter credit for course >> " + (j+1)  );
                int cr = input.nextInt();
                System.out.print("For student #" + (i+1) + ", enter grade for course >> " + (j+1) );
                char g = input.nextLine().charAt(0);
                CollegeCourse cs = new CollegeCourse(course, cr, g);
                st[i] = new Student(i, j, course, cr, g );
        }
    }
    }
}