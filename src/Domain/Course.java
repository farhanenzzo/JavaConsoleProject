package Domain;

public class Course {

    private String courseName;
    private String courseCode;
    private int credit;

    Course(String courseName, String courseCode, int credit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
