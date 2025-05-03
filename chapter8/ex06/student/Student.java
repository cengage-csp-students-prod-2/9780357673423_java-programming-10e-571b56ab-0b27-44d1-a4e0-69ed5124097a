public class Student {
    private int stuID;
    private CollegeCourse[] course = new CollegeCourse[5];

    public void setStuID(int id) {
        this.stuID = id;
    }

    public int getStuID() {
        return stuID;
    }

    public CollegeCourse getCourse(int index) {
        return course[index];
    }

    public void setCourse(CollegeCourse course, int index) {
        this.course[index] = course;
    }
}
