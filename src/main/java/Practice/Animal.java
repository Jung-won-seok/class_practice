package Practice;

public class Animal {
    int age;
    String sound;
    int count;

    public Animal(int age, String sound, int count){
        this.age = age;
        this.sound = sound;
        this.count = count;
    }

    public int sum_age(int age, int count){
        int result = age * count;
        return result;
    }

    public void bark(String sound) {
        System.out.println(sound+ "처럼 소리낸다.");
    }
}
