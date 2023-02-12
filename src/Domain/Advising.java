package Domain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Advising {
    private List<Student> studentList;
    private List<Course> courseList;

    public Advising() {
        studentList = new ArrayList<>();
        courseList = new ArrayList<>();

        courseList.add(new Course(110, "cse"));
        courseList.add(new Course(111, "cse"));
        courseList.add(new Course(220, "cse"));

        int userInput;
        Scanner sc  = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        do{
            String a = "Insert INfo - 1";
            String b = "Display - 2";
            String c = "Search - 3";
            String d = "Delete - 4";
            String e = "Update info - 5";
            String f = "Add course - 6";
            String g = "show course - 7";
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
            System.out.format("%15s%16s%17s%18s%19s%20s%21s\n", a, b, c, d, e,f, g);
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

            System.out.print("Put your preference digit: ");
            Scanner input = new Scanner(System.in);
            userInput = input.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter current semester: ");
                    String semester = sc.next();

                    Student student = new Student(id, name, semester);
                    studentList.add(student);
                    break;

                case 2:
                    for(Student i : studentList) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to SEARCH: ");
                    int searchID = sc.nextInt();

                    for(Student i : studentList) {
                        if (i.getMyId() == searchID) {
                            System.out.println(i);
                        }else {
                            System.out.println(" *** Id not found! ***");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to DELETE: ");
                    int deleteID = sc.nextInt();
                    studentList.removeIf(myData -> myData.getMyId() ==  deleteID);
                    break;

                case 5:
                    System.out.print("Enter Student ID to Update: ");
                    int updateID = sc.nextInt();

                    for(Student s : studentList) {
                        if(s.getMyId() == updateID) {
                            System.out.print("Enter Name: ");
                            String updateName = sc.next();

                            System.out.print("Enter current semester: ");
                            String updateSemester = sc.next();

                            s.setName(updateName);
                            s.setSemester(updateSemester);

                        }else {
                            System.out.println(" *** Id not found! ***");
                        }
                    }
                    break;

                case 6:

                    System.out.println("Total available course: "+ courseList.size());
                    for(Course i: courseList) {
                        System.out.println(i.getCourseCode());
                    }

                    System.out.print("Enter Student ID to ADD COURSE: ");
                    int studentId = sc.nextInt();

                    boolean exist = false;

                    for(Student s : studentList) {
                        if(s.getMyId() == studentId) {
                            exist = true;
                            System.out.print("Add Course: ");
                            int addCourse = sc.nextInt();
                            for(Course course : courseList) {
                                if(course.getCourseCode() == addCourse) {
                                    s.takeCourse(addCourse);
                                    System.out.println(" *** Course has been added ***");
                                    break;
                                }else {
                                    System.out.println(" *** Course in not available ***");
                                }
                            }
                            break;


                        }else {
                            exist = false;
                        }
                    }
                    if(!exist) {
                        System.out.println(" *** Id not found! ***");
                    }

                    break;

                case 7:
                    System.out.println("Total available course: "+ courseList.size());
                    for(Course i: courseList) {
                        System.out.println(i.getCourseCode());
                    }

                    System.out.print("Checkout courseCode: ");
                    int courseCode = sc.nextInt();

                    List<Student> cseStudent = getStudentByCourseId(courseCode);
                    System.out.println("Students enrolled in CSE"+courseCode);
                    for (Student s : cseStudent) {
                        System.out.println("ID: " + s.getMyId() + ", Name: " + s.getName());
                    }
                    break;
            }
        }while (userInput != 0);
    }

    public List<Student> getStudentByCourseId(int courseId) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentList) {
            if (s.getCourseId() == courseId) {
                result.add(s);
            }
        }
        return result;
    }
}
