package StarCraft_work;

public class Unit {
    int damage;
    int hp;
    String fly_ground;
    String name;

    public Unit() {
    }

    public Unit(int damage, int hp, String fly_ground, String name) {
        this.damage = damage;
        this.hp = hp;
        this.fly_ground = fly_ground;
        this.name = name;
    }
}
