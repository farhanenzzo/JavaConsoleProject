import Domain.Student;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        int userInput;
        Scanner sc  = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

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
                    students.add(student);
                break;

                case 2:
                    for(Student i : students) {
                        System.out.println(i);
                    }
                break;

                case 3:
                    System.out.print("Enter Student ID to SEARCH: ");
                    int searchID = sc.nextInt();

                    for(Student i : students) {
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
                    students.removeIf(myData -> myData.getMyId() ==  deleteID);

                    break;

                case 5:
                    System.out.print("Enter Student ID to Update: ");
                    int updateID = sc.nextInt();

                    for(Student s : students) {
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
                    System.out.print("Enter Student ID to ADD COURSE: ");
                    int studentId = sc.nextInt();

                    boolean exist = false;

                    for(Student s : students) {
                        if(s.getMyId() == studentId) {
                            exist = true;
                            System.out.print("Add Course: ");
                            String addCourse = sc.next();
                            s.setMyCourse(addCourse);
                            System.out.println(s.getMyId() + " Course has been added");

                        }else{
                            exist = false;
                        }
                    }
                    if(!exist) {
                        System.out.println(" *** Id not found! ***");
                    }

                    break;

                case 7:
//                    System.out.println("Total available course: "+ courseList.size());
//                    for(Course i: courseList) {
//                        System.out.println(i.getCourseCode());
//                    }
                    break;
            }
        }while (userInput != 0);
    }

    /**
     *     private static void addStudent() {
     *
     *     }
     *     private static void displayInfo() {
     *
     *     }
     *
     *     private static void searchId() {
     *
     *     }
     *
     *     private static void deleteStudent() {
     *
     *     }
     *
     *     private static void updateInfo() {
     *
     *     }
     *     private static void addCourse() {
     *
     *     }
     */
}
