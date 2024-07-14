package StarCraft_work;

public class Mutalisk extends Zerg implements Attack{
    public Mutalisk(){
        super(2, 15, "fly");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
