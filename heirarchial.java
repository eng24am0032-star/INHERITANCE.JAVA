public class heirarchial {
    public static void main(String[] args) {
        dog d = new dog();
        d.bark();
        d.eat();

        cat c = new cat();
        c.eat();
        c.meow();
    }
}
class animal{
    void eat(){
        System.out.println("animals can eat ");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog can bark");
    }
}
class cat extends animal{
    void meow(){
        System.out.println("cat can meow");
    }
}