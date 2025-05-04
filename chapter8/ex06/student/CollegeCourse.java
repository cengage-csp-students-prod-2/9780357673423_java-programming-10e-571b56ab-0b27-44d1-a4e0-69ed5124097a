// Write your code here

public class CollegeCourse{

    private String courseID;
    private int credits;
    private char grade;


    public String getCourseID(){
        return courseID;
    }
    public int getCredits(){
        return credits;
    }
    public char getGrade(){
        return grade;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
}