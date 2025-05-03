// Write your code here

public class CollegeCourse{

    String courseID;
    int credits;
    char grade;
    public CollegeCourse(String cr, int cd, char g){
        this.setCourse(cr);
        this.setCredit(cd);
        this.setGrade(g);

    }

    public String getCourse(){
        return courseID;
    }
    public int getCredit(){
        return credits;
    }
    public char getGrade(){
        return grade;
    }
    public void setCourse(String cr){
        this.courseID = cr;
    }
    public void setCredit(int cd){
        this.credits = cd;
    }
    public void setGrade(char g){
        this.grade = g;
    }
}