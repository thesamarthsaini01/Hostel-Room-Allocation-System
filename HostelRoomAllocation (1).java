import java.util.ArrayList;
import java.util.Scanner;

public class HostelRoomAllocation {

    static class Student {
        int id;
        String name;
        int room;

        Student(int id, String name, int room) {
            this.id = id;
            this.name = name;
            this.room = room;
        }

        void display() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Room Number: " + room);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== Hostel Room Allocation System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Room Number: ");
                int room = sc.nextInt();

                students.add(new Student(id, name, room));
                System.out.println("Student added successfully!");

            } 
            else if (choice == 2) {

                if (students.isEmpty()) {
                    System.out.println("No student records found.");
                } else {
                    for (Student s : students) {
                        s.display();
                    }
                }

            } 
            else if (choice == 3) {
                System.out.println("Program exited.");
            } 
            else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
