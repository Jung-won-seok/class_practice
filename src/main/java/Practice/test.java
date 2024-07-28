package Practice;

public class test {
    public static void main(String[] args) {
        Parent c = new Child();
        c.play();
    }
}
class Parent{
    void play(){
        this.show();
        System.out.println("A");
    }
    void show(){
        System.out.println("B");
    }
}
class Child extends Parent{
    void show(){
        super.show();
        System.out.println("C");
    }
}
