package StarCraft_work;

public class Corsair extends Protoss implements Attack{
    public Corsair(){
        super(4, 12, "fly", "Corsair");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
