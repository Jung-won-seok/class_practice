package StarCraft_work;

public class HighTempler extends Protoss implements Attack{
    public HighTempler(){
        super(10, 2, "ground", "HighTempler");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
