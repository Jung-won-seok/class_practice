package StarCraft;

public class Hydra extends Unit implements Attackable{
    public Hydra(int hp, int location, String name){
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subject){
        System.out.println(this.name+"이"+subject.toString()+"에게 등뼈를 뱉는다.");
        subject.reducehp();
    }

    @Override
    public void move(int location){
        System.out.println("걸어갑니다.");
        this.location = location;
    }
}

