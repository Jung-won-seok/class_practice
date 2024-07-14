package StarCraft_work;

public class Zergling extends Zerg implements Attack{
    public Zergling(){
        super(2, 2, "ground", "Zergling");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
