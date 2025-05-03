// Write your code here


public class Student{
    

 
    int stuID;
    CollegeCourse cc[] = new CollegeCourse[5];
    public  CollegeCourse getStuID(int i){
        return cc[i];
    }
    public void setStuID(int pos, CollegeCourse course){
        cc[pos] = course;
    }
}