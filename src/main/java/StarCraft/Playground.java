package StarCraft;

public class Playground{
    public static void main(String[] args) {
        Unit m1 = new Marine(10, 1, "Marine 1");
        Unit m2 = new Marine(10, 2, "Marine 2");
        Unit z1 = new Zealot(20, 3, "Zealot 1");
        Unit ze1 = new Zergling(5, 4, "Zergling 1");
        Unit hydra = new Hydra(7, 6, "Hydra 1");
        Unit med1 = new Medic(10, 2, "Medic 1");

        // med1.attack(z1);
        // ((Attackable)m1).attack(m2);
        ((Attackable)z1).attack(m1); //질럿이 마린을 공격한다.
        System.out.println(m1.hp);
        // ze1.attack(m1);
        // hydra.attack(z1);
        /*
        Unit[] units = {m1, m2, z1, ze1, hydra, med1};

        for(Unit u : units){
            if(u instanceof Attackable){
                ((Attackable)u).attack(ze1);
            }
        }
         */
    }
}
