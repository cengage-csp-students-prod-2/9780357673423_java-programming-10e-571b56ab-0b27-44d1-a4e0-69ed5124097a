// Write your code here

public class CollegeCourse{

    String courseID;
    int credits;
    char grade;
    public CollegeCourse(String cr, int cd, char g){
        this.setCourseID(cr);
        this.setCredits(cd);
        this.setGrade(g);

    }

    public String getCourseID(){
        return courseID;
    }
    public int getCredits(){
        return credits;
    }
    public char getGrade(){
        return grade;
    }
    public void setCourseID(String cr){
        this.courseID = cr;
    }
    public void setCredits(int cd){
        this.credits = cd;
    }
    public void setGrade(char g){
        this.grade = g;
    }
}