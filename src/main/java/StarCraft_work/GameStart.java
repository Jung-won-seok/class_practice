package StarCraft_work;

public class GameStart {
    public static void main(String[] args) {

        Terran marine1 = new Marine(); //damage:3   hp:10
        Protoss zealot = new Zealot(); //damage:5   hp:20

        System.out.println("적군");
        ((Attack)marine1).attack(zealot); //마린이 질럿을 공격한다.
        System.out.println(zealot.hp); // 17
    }
}
