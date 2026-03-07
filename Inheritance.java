class Person {
    String name;
    int age;

    Person() {
        name = "Rahul";
        age = 20;
    }

    void showPerson() {
        System.out.println(name);
        System.out.println(age);
    }
}

class Student extends Person {
    int roll;

    Student() {
        super();
        roll = 101;
    }

    void showStudent() {
        System.out.println(roll);
    }
}

class Result extends Student {
    int marks;

    Result() {
        super();
        marks = 95;
    }

    void display() {
        showPerson();
        showStudent();
        System.out.println(marks);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Result obj = new Result();
        obj.display();
    }
}