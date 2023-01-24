import Domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int userInput;
        Collection<Student> students = new ArrayList<>();
        Scanner sc  = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        do{
            String a = "Insert - 1";
            String b = "Display - 2";
            String c = "Search - 3";
            String d = "Delete - 4";
            System.out.println("----------------------------------------------------------------------------------");
            System.out.format("%15s%16s%17s%18s\n", a, b, c, d);
            System.out.println("----------------------------------------------------------------------------------");

            System.out.print("Put your preference digit: ");
            userInput = sc.nextInt();

            switch (userInput) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.next();

                    System.out.print("Enter Id: ");
                    int id = scanner.nextInt();

                    System.out.print("Enter email: ");
                    String email = sc.next();

                    System.out.print("Enter contact: ");
                    int contact = scanner.nextInt();

                    Student student = new Student(name, id, email, contact);
                    students.add(student);
                break;

                case 2:
                    Iterator<Student> iterator = students.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int stuID = sc.nextInt();
                    iterator = students.iterator();

                    while (iterator.hasNext()) {
                        Student stu = iterator.next();

                        if(stu.getId() == stuID) {
                            System.out.println(stu);
                        }else {
                            System.out.println("Student not found");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to DELETE: ");
                    stuID = sc.nextInt();
                    iterator = students.iterator();

                    while (iterator.hasNext()) {
                        Student stu = iterator.next();

                        if(stu.getId() == stuID) {
                            iterator.remove();
                            System.out.println("Student has been deleted");
                        }else {
                            System.out.println("Student not found");
                        }
                    }
                    break;
            }
        }while (userInput != 0);
    }
}
