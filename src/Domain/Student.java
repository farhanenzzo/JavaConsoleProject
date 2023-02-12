package Domain;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String semester;
    private int totalCredit;
    private List<String> myCourses;
    private int completeCredit;
    private int remainCredit;

    private int courseID;

    public Student() {
    }

    /**
     * Student constructor to create new student object
     * assuming every new student have total of = 136 credit(3 credit per course)
     * initially taken credit is = 0
     *
     * @param id unique field
     */

    public Student(int id, String name, String semester) {
        this.name = name;
        this.id = id;
        this.semester = semester;
        totalCredit = 136;
        completeCredit = 0;
        remainCredit = totalCredit;
        myCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getCourseId() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public List<String> getMyCourses() {
        return myCourses;
    }

    public int getMyId() {
        return id;
    }

    /**
     * keep adding credits to the takenCredit field
     */

    public void setMyCourse(String myCourse) {
        this.myCourses.add(myCourse);
        completeCredit += 3;
        remainCredit = totalCredit - completeCredit;
    }

    public void takeCourse(int courseID) {
        this.courseID = courseID;
    }
    @Override
    public String toString() {
        return "Id:(" + id + ") Name:(" + name + ") Semester:(" + semester
                + ") TotalCredit: (" + totalCredit + ")" + " Courses: ("+ courseID +")"
                + " completeCredit: (" + completeCredit + ")" + "remainCredit: (" + remainCredit + ")";
    }
}
