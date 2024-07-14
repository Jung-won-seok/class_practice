package StarCraft_work;

public class Ultralisk extends Zerg implements Attack{
    public Ultralisk(){
        super(5, 15, "ground");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
