package StarCraft_work;

public class Tank extends Terran implements Attack{
    public Tank(){
        super(7, 15, "ground");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
