package StarCraft_work;

public class Dragoon extends Protoss implements Attack{
    public Dragoon(){
        super(3, 15, "ground", "Dragoon");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
