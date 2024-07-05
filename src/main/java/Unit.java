public class Unit{
    protected int hp;
    protected int location;
    protected String name;

    public Unit(int hp, int location, String name){
        this.hp = hp;
        this.location = location;
        this.name = name;
    }

    public void reducehp(){
        this.hp--;
    }

    public void move(int location){
        this.location = location;
    }

    public void attack(Unit subject){
        System.out.println(this.name+"이"+subject.toString()+"를 기관총으로 쏜다.");
        subject.reducehp();
    }


    public String toString(){
        return this.hp + ", "+this.name;
    }
}