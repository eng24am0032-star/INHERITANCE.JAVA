public class single {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
class animal{
    void eat(){
        System.out.println("animals can eat");
    }
}
class Dog extends animal{
    void bark(){
        System.out.println("dog can bark");
    }
}