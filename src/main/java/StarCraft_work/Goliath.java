package StarCraft_work;

public class Goliath extends Terran implements Attack{
    public Goliath(){
        super(7, 15, "ground", "Goliath");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
