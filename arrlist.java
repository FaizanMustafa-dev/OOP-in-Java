import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String city;

    Student(String n, String c) {
        name = n;
        city = c;
    }
}

public class arrlist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Faizan", "Sahiwal"));
        list.add(new Student("Mustafa", "Sahiwal"));
        list.add(new Student("Ahsan", "Okara"));
        list.add(new Student("Awias", "Okara"));

        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. View Students");
            System.out.println("2. Add Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewStudents(list);
                    break;
                case 2:
                    addStudent(scanner, list);
                    break;
                case 3:
                    updateStudent(scanner, list);
                    break;
                case 4:
                    deleteStudent(scanner, list);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);
    }

    private static void viewStudents(ArrayList<Student> list){
        System.out.println("\nStudents List:");
        for (Student student : list) {
            System.out.println("Name: " + student.name + ", City: " + student.city);
        }
    }

    private static void addStudent(Scanner scanner, ArrayList<Student> list){
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student city: ");
        String city = scanner.next();
        list.add(new Student(name, city));
        System.out.println("Student added successfully!");
    }

    private static void updateStudent(Scanner scanner, ArrayList<Student> list) {
        System.out.print("Enter student name to update: ");
        String nameToUpdate = scanner.next();
        for (Student student : list) {
            if (student.name.equals(nameToUpdate)) {
                System.out.print("Enter new city: ");
                String newCity = scanner.next();
                student.city = newCity;
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    private static void deleteStudent(Scanner scanner, ArrayList<Student> list) {
        System.out.print("Enter student name to delete: ");
        String nameToDelete = scanner.next();
        for (Student student : list) {
            if (student.name.equals(nameToDelete)) {
                list.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}