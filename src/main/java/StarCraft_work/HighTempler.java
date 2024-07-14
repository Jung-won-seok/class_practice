package StarCraft_work;

public class HighTempler extends Protoss implements Attack{
    public HighTempler(){
        super(10, 2, "ground");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
