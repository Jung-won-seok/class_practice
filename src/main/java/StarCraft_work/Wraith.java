package StarCraft_work;

public class Wraith extends Terran implements Attack{
    public Wraith(){
        super(3, 10, "fly", "Wraith");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
