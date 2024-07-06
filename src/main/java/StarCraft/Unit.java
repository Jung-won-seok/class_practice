package StarCraft;

public abstract class Unit{
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

    abstract void move(int location);



    public String toString(){
        return this.hp + ", "+this.name;
    }
}