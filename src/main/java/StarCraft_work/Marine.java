package StarCraft_work;

public class Marine extends Terran implements Attack{

    public Marine() {
        super(3, 10, "ground");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
