public class Student {
    private int stuID;
    private CollegeCourse[] course = new CollegeCourse[5];

    // public Student(){
    //     for (int i = 0; i < 5 ; i++){
    //         course[i] = new CollegeCourse() ;
    //     }
    // }
    public void setStuID(int id) {
        this.stuID = id;
    }

    public int getStuID() {
        return stuID;
    }

    public CollegeCourse getCourse(int index) {
        if (index >=0 && index < 5){
            return course[index];
        }
        else{
            return null;
        }
    }

    public void setCourse(CollegeCourse course, int index) {
        this.course[index] = course;
    }
}
