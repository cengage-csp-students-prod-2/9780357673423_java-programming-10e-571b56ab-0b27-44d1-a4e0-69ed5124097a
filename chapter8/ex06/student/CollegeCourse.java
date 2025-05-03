// Write your code here

public class CollegeCourse{

    String course;
    int credit;
    char grade;
    public CollegeCourse(String cr, int cd, char g){
        this.setCourse(cr);
        this.setCredit(cd);
        this.setGrade(g);

    }

    public String getCourse(){
        return course;
    }
    public int getCredit(){
        return credit;
    }
    public char getGrade(){
        return grade;
    }
    public void setCourse(String cr){
        this.course = cr;
    }
    public void setCredit(int cd){
        this.credit = cd;
    }
    public void setGrade(char g){
        this.grade = g;
    }
}