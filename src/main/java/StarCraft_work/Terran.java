package StarCraft_work;

public class Terran extends Unit{
    public Terran() {
    }

    public Terran(int damage, int hp, String fly_ground, String name) {
        this.damage = damage;
        this.hp = hp;
        this.fly_ground = fly_ground;
        this.name = name;
    }

}
