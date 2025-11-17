class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    String nickname;

    Student(String name, int age, String nickname) {
        super(name, age);
        this.nickname = nickname;
    }

    void showNames() {
        System.out.println("Full Name: " + super.name);
        System.out.println("Nickname: " + nickname);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Student s = new Student("Gowri Priya", 19, "GP");
        s.showNames();
    }
}
