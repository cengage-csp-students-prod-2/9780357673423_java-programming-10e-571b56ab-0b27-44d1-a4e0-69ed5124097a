// Write your code here

public class CollegeCourse{

    String courseID;
    int credits;
    String grade;
    public CollegeCourse(String cr, int cd, String g){
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
    public String getGrade(){
        return grade;
    }
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
}