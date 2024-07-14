package StarCraft_work;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameStart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("플레이어1의 종족을 고르시오: (Z/T/P)");
        String play_1 = sc.nextLine();
        System.out.println("플레이어2의 종족을 고르시오: (Z/T/P)");
        String play_2 = sc.nextLine();

        ArrayList<Unit> player1Units = new ArrayList<>();
        ArrayList<Unit> player2Units = new ArrayList<>();

        //플레이어 1의 종족에 따른 유닛 생성
        createUnits(play_1, player1Units);
        //플레이어 2의 종족에 따른 유닛 생성
        createUnits(play_2, player2Units);

        printUnits("플레이어 1", play_1, player1Units);
        System.out.println();
        printUnits("플레이어 2", play_2, player2Units);

        for (int i = 0; i < 100; i++) {
            int cnt_1 = 0;
            int cnt_2 = 0;

            System.out.println("플레이어1이 공격할 유닛, 플레이어2의 공격받을 유닛 ");
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            ((Attack)player1Units.get(p1)).attack(player2Units.get(p2));

            printUnits("플레이어 1", play_1, player1Units);
            System.out.println();
            printUnits("플레이어 2", play_2, player2Units);

            System.out.println("플레이어2가 공격할 유닛, 플레이어1의 공격받을 유닛 ");
            int q2 = sc.nextInt();
            int q1 = sc.nextInt();
            ((Attack)player2Units.get(q2)).attack(player1Units.get(q1));

            printUnits("플레이어 1", play_1, player1Units);
            System.out.println();
            printUnits("플레이어 2", play_2, player2Units);

            for (int j = 0; j < player1Units.size(); j++) {
                if (player1Units.get(j).hp == 0 || player1Units.get(j).hp < 0) {
                    cnt_1++;
                }
            }
            for (int k = 0; k < player1Units.size(); k++) {
                if (player1Units.get(k).hp == 0 || player1Units.get(k).hp < 0) {
                    cnt_2++;
                }
            }
            if (cnt_1 == player1Units.size()) {
                System.out.println("플레이어1의 승리입니다!");
                System.exit(0);
            } else if (cnt_2 == player2Units.size()) {
                System.out.println("플레이어2의 승리입니다!");
                System.exit(0);
            }

        }
    }

    public static void createUnits(String race, ArrayList<Unit> units) {
        Random random = new Random();
        int unitCount = 0;
        switch (race) {
            case "Z":
                unitCount = 8;
                for (int i = 0; i < unitCount; i++) {
                    int rand = random.nextInt(5) + 1;
                    switch (rand) {
                        case 1:
                            units.add(new Zergling());
                            break;
                        case 2:
                            units.add(new Hydralisk());
                            break;
                        case 3:
                            units.add(new Ultralisk());
                            break;
                        case 4:
                            units.add(new Mutalisk());
                            break;
                        case 5:
                            units.add(new Guardian());
                            break;
                    }
                }
                break;

            case "T":
                unitCount = 5;
                for (int i = 0; i < unitCount; i++) {
                    int rand = random.nextInt(5) + 1;
                    switch (rand) {
                        case 1:
                            units.add(new Marine());
                            break;
                        case 2:
                            units.add(new Tank());
                            break;
                        case 3:
                            units.add(new Goliath());
                            break;
                        case 4:
                            units.add(new Wraith());
                            break;
                        case 5:
                            units.add(new Valkyrie());
                            break;
                    }
                }
                break;

            case "P":
                unitCount = 4;
                for (int i = 0; i < unitCount; i++) {
                    int rand = random.nextInt(5) + 1;
                    switch (rand) {
                        case 1:
                            units.add(new Zealot());
                            break;
                        case 2:
                            units.add(new Dragoon());
                            break;
                        case 3:
                            units.add(new HighTempler());
                            break;
                        case 4:
                            units.add(new Scout());
                            break;
                        case 5:
                            units.add(new Corsair());
                            break;
                    }
                }
                break;
        }
    }

    public static void printUnits(String player, String race, ArrayList<Unit> units) {
        System.out.println(player + "의 종족: " + (race.equals("Z") ? "Zerg" : race.equals("T") ? "Terran" : "Protoss"));
        for (int i = 0; i < units.size(); i++) {
            System.out.println(i + " "+units.get(i).name + "(현재 방어력: "+ units.get(i).hp+" "+"현재 공격력: "+units.get(i).damage+")");
        }
    }
}
