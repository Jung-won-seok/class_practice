package Singleton;

public class Singleton{
    private int i=0;
    private static Singleton singleton;

    private Singleton(){

    }

    public int getI(){
        return this.i;
    }

    public void setI(int i){
        this.i = i;
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

class Test{
    public static void main(String[] args){
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        s1.setI(1);
        System.out.println(s1.getI());
        System.out.println(s2.getI());

        System.out.println(s1);
        System.out.println(s2);
    }
}
//싱글톤 하나가 두가지 일을 할 수 있다.
//싱글톤이 카드번호도 만들고 계좌번호도 만든다.
//static을 안쓰고 싱글톤을 하려면 어떻게?