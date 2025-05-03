public class Student {
    private int stuID;
    private CollegeCourse[] courses = new CollegeCourse[5];

    public void setStuID(int id) {
        this.stuID = id;
    }

    public int getStuID() {
        return stuID;
    }

    public CollegeCourse getCourse(int index) {
        return courses[index];
    }

    public void setCourse(CollegeCourse course, int index) {
        courses[index] = course;
    }
}
