package StarCraft;

public class Zergling extends Unit implements Attackable{
    public Zergling(int hp, int location, String name){
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subject){
        System.out.println(this.name+"이"+subject+"를 발톱으로 할퀸다.");
        subject.reducehp();
    }

    @Override
    public void move(int location){
        System.out.println("걸어갑니다.");
        this.location = location;
    }
}