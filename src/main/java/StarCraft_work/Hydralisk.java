package StarCraft_work;

public class Hydralisk extends Zerg implements Attack{
    public Hydralisk(){
        super(3, 7, "ground", "Hydralisk");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
