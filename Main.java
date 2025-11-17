class Emp {
    void work() {
        System.out.println("Employee is working");
    }
}

class man extends Emp {
    @Override
    void work() {
        super.work();     
        System.out.println("Manager is managing");
    }
}

public class Main {
    public static void main(String[] args) {
        man m = new man();
        m.work();
    }
}

