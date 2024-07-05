package StarCraft;

public class Zealot extends Unit implements Attackable {
    public Zealot(int hp, int location, String name) {
        super(hp, location, name);
    }

    @Override
    public void attack(Unit subject) {
        System.out.println(this.name + "이" + subject.toString() + "를 칼로 찌른다.");
        subject.reducehp();
    }

    @Override
    public void move(int location) {
        System.out.println("걸어갑니다.");
        this.location = location;
    }
}
