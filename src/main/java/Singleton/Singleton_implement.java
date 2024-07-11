package Singleton;

public class Singleton_implement {
    public static void main(String[] args) {
        Student s1 = new Student(5);
        Student s2 = new Student(5);

        if(s1.num == s2.num){
            System.out.println("같다.");
        }else{
            System.out.println("다르다.");
        }
    }
}
//객체를 한번만 만들어서 비교?
