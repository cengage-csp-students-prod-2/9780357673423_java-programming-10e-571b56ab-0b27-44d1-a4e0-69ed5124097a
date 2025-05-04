import java.util.Scanner;

public class InputGrades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student();  // use default constructor

            System.out.print("For student #" + (i + 1) + ", enter the student ID >> ");
            int id = input.nextInt();
            students[i].setStuID(id);
            input.nextLine(); // consume newline


            for (int j = 0; j < 5; j++) {
                CollegeCourse course = new CollegeCourse();


                System.out.print("For student #" + (i + 1) + ", enter course #" + (j + 1) + " >> ");
                String courseID = input.nextLine();
                course.setCourseID(courseID);

                System.out.print("For student #" + (i + 1) + ", enter credits for course #" + (j + 1) + " >> ");
                int credits = input.nextInt();
                course.setCredits(credits);
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
                course.setGrade(grade);
                students[i].setCourse(course, j);
            }
        }

        System.out.println("\nAll data are intered");
        for (int i =0 ; i < 10 ; i++){
            System.out.println("Student ID: " + students[i].getStuID());
            for (int j = 0; j < 5; j ++){
                CollegeCourse course = students[i].getCourse(j);
                System.out.printf("Course #%d: %s, Credits: %d, Grade: %c\n",(j+1), course.getCourseID(), course.getCredits(),course.getGrade());

            }
            System.out.println("\n");
        }
        input.close();
    }
}
