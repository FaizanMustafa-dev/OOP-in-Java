import java.util.*;

class student {
    protected String name;
    protected int age;

    student() {
        name = "";
        age = 0;
    }

    void set_value() {
        System.out.println("Enter a name of the student");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.println("Enter age:");
        age = input.nextInt();
    }

    public void Display() {
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
    }
}

class ali extends student {
    String regNo;
    double cgpa;

    ali() {
        super();
        regNo = "";
        cgpa = 0.0;
    }

    void set_info() {
        super.set_value();
        System.out.println("Enter CGPA:");
        Scanner input = new Scanner(System.in);
        cgpa = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Registration no:");
        regNo = input.nextLine();
    }

    public void display() {
        super.Display();
        System.out.println("RegNo is " + this.regNo);
        System.out.println("CGPA is " + this.cgpa);
    }
}

class Abdullah {
    protected String name;
    protected int age;

    Abdullah() {
        name = "ali";
        age = 21;
    }

    Abdullah(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Abdullah(Abdullah old) {
        this.name = old.name;
        this.age = old.age;
    }

    public void display() {
        System.out.println("NAME IS " + this.name);
        System.out.println("AGE IS " + this.age);
    }

    public void setValue() {
        System.out.println("Enter name:");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();
        System.out.println("Enter age:");
        this.age = input.nextInt();
    }
}

class papa extends Abdullah {
    papa() {
        name = "ali";
        age = 21;
    }

    public void display() {
        super.display();
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Main_111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Abdullah a1 = new Abdullah();
        a1.display();

        Abdullah a2 = new Abdullah("aman", 22);
        a2.display();

        Abdullah a3 = new Abdullah();
        a3.setValue();
        a3.display();

        ali a4 = new ali();
        a4.set_info();
        a4.display();

        papa p1 = new papa();
        p1.display();

        input.close();
    }
}