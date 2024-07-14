package StarCraft_work;

public class Scout extends Protoss implements Attack{
    public Scout(){
        super(5, 10, "fly");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
