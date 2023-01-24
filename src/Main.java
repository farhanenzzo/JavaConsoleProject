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
            System.out.println("-------------------------------------------------------------");
            System.out.format("%32s%16s\n", a, b);
            System.out.println("--------------------------------------------------------------");

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
                        Student data = iterator.next();
                        System.out.println(data);
                    }
                break;
            }
        }while (userInput != 0);
    }
}
