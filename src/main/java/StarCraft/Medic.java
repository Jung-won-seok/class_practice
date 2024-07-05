package StarCraft;

public class Medic extends Unit{
    public Medic(int hp, int location, String name){
        super(hp, location, name);
    }

    @Override
    public void move(int location){
        System.out.println("걸어갑니다.");
        this.location = location;
    }

}

