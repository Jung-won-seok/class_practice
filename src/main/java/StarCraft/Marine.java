package StarCraft;

public class Marine extends Unit implements Attackable{
    public Marine(int hp, int location, String name){
        super(hp, location, name);
    }

    public void move(int location){
        System.out.println("걸어다닙니다.");
        this.location = location;
    }

    @Override
    public void attack(Unit subject){ //subject를 공격하는 것이다.

        System.out.println(this.name+"이"+subject.toString()+"를 기관총으로 쏜다.");
        subject.reducehp();
    }
}
