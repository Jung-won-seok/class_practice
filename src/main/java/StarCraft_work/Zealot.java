package StarCraft_work;

public class Zealot extends Protoss implements Attack{
    public Zealot(){
        super(5, 20, "ground", "Zealot");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
