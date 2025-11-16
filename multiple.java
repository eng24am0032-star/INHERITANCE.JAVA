public class multiple {
    public static void main(String[] args) {
        dog d = new dog();

        d.eat();
        d.play();
        d.bark();
    }
}
interface animal {
    void eat();
}
interface pet{
    void play();
}
class dog implements animal,pet{
    public void eat(){
        System.out.println("dog can eat");
    }

    public void play(){
        System.out.println("dog loves to play");
    }

    void bark(){
        System.out.println("dog can bark");
    }
}