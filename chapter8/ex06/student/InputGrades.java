import java.util.Scanner;

public class InputGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students;
        students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student();  // use default constructor

            System.out.print("For student #" + (i + 1) + ", enter the student ID >> ");
            int id = input.nextInt();
            input.nextLine(); // consume newline

            students[i].setStuID(id);

            for (int j = 0; j < 5; j++) {
                System.out.print("For student #" + (i + 1) + ", enter course #" + (j + 1) + " >> ");
                String courseID = input.nextLine();

                System.out.print("For student #" + (i + 1) + ", enter credits for course #" + (j + 1) + " >> ");
                int credits = input.nextInt();
                input.nextLine(); // consume newline

                char grade;
                while (true) {
                    System.out.print("For student #" + (i + 1) + ", enter grade for course #" + (j + 1) + " >> ");
                    
                    grade = input.nextLine().toUpperCase().charAt(0);
                    if ("ABCDF".indexOf(grade) != -1) {
                        
                    break;
                    }
                    System.out.println("Invalid grade. Please enter A, B, C, D, or F.");
                }

                CollegeCourse course = new CollegeCourse(courseID, credits, grade );
                students[i].setCourse(course, j);
            }
        }

        input.close();
    }
}
