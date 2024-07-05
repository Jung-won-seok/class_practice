public class Zealot extends Unit{
    public Zealot(int hp, int location, String name) {
        super(hp, location, name);
    }


    @Override
    public void attack(Unit subject){
        System.out.println(this.name+"이"+subject.toString()+"를 칼로 찌른다.");
        subject.reducehp();
    }
}