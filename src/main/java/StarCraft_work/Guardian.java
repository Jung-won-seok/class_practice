package StarCraft_work;

public class Guardian extends Zerg implements Attack{
    public Guardian(){
        super(3, 6, "fly", "Guardian");
    }

    @Override
    public void attack(Unit unit) {
        unit.hp = unit.hp - this.damage;
    }
}
