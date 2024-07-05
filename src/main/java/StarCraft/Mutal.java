package StarCraft;

public class Mutal extends Unit implements Attackable{
    public Mutal(int hp, int location, String name){
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subject){
        System.out.println(this.name+"이"+subject+"공중에서 표창을 던진다.");
        subject.reducehp();
    }

    public void move(int location){
        System.out.println("날아갑니다.");
        this.location = location;
    }

}

