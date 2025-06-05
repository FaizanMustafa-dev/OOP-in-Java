import java.util.*;

class Course{
    public String corsename;
    public Course(String coursename){
        this.corsename=coursename;
    }

public String getcourse(){
    return this.corsename;
}
}
interface CourseModerator {

    public void addCourse(Course c);
   public  void dropCourse(Course c);
}
class Registration implements CourseModerator{
    public int studentid;
    public static int size=10;
    public int count;
    public Course[]array;
    public Registration(int id){
        this.studentid=id;
        this.array = new Course[size];
        this.count=0;
    }

public void addCourse(Course c){
if(count<size){
    array[count]=c;
    count++;
    System.out.println("Course added");
}
else{
    System.out.println("array is full");
}
}
   public  void dropCourse(Course c){
    boolean istrue=false;
    for (int i=0;i<size;i++){
        if(array[i] != null && c.corsename.equals(array[i].getcourse())){
            array[i]=null;
            istrue=true;
            System.out.println("Course droped");
            break;
        }
    }
    if(!istrue){
        System.out.println("Course not found");
    }

   }
   public void showcourses(){
    for (Course course : array){
        if(course!=null){
        System.out.println("Courses : "+course.corsename);
        }
    }
   }
}


interface StaffMember {
    double calculateSalary();
    String getDetails();
}

class Teacher implements StaffMember {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
      
        return salary;
    }

    @Override
    public String getDetails() {
        return "Teacher: Name - " + name + ", Subject - " + subject;
    }
}

class AdminStaff implements StaffMember {
    private String name;
    private String department;
    private double salary;

    public AdminStaff(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
       
        return salary;
    }

    @Override
    public String getDetails() {
        return "AdminStaff: Name - " + name + ", Department - " + department;
    }
}

class School {
    private StaffMember[] staffMembers;
    private int count;

    public School(int capacity) {
        staffMembers = new StaffMember[capacity];
        count = 0;
    }

    public void addStaff(StaffMember staff) {
        if (count < staffMembers.length) {
            staffMembers[count++] = staff;
        } else {
            System.out.println("School is full. Cannot add more staff.");
        }
    }

    public void displayAllStaffDetails() {
        System.out.println("Staff Details:");
        for (StaffMember staff : staffMembers) {
            if (staff != null) {
                System.out.println(staff.getDetails() + ", Salary: " + staff.calculateSalary());
            }
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (StaffMember staff : staffMembers) {
            if (staff != null) {
                totalSalary += staff.calculateSalary();
            }
        }
        return totalSalary;
    }
}

class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}


public class Test {
    public static void main(String[] args) {
        String b="123";
        int a=Integer.parseInt(b);
        System.out.println(a);

       
}
}
