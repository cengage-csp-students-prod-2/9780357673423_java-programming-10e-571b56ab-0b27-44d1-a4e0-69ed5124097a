// Write your code here


public class Student{
    

 
    int stuID;
    CollegeCourse cc[] = new CollegeCourse[5];
    public  Student(int sid, int cid, String course, int credit, char g ){
        cc[cid] = new CollegeCourse(course, credit, g);
        setStuID(cid, cc[cid] );
        // cc[cid].setCourse(course);
        // cc[cid].setCredit(credit);
        // cc[cid].setGrade(g);
    }
    public  CollegeCourse getStuID(int i){
        return cc[i];
    }
    public void setStuID(int pos, CollegeCourse course){
        cc[pos] = course;
    }
}