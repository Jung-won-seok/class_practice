package StarCraft_work;

public class Valkyrie extends Terran implements Attack{
    public Valkyrie(){
        super(4, 12, "fly");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
