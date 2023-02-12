package Domain;

public class Course {

    private int courseCode;
    private String courseDetail;

    public Course(int courseCode, String courseDetail) {
        this.courseCode = courseCode;
        this.courseDetail = courseDetail;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseDetail() {
        return courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }
}
