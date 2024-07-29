package Json;

import org.json.JSONObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JSONObject j = new JSONObject();
//        User user_1 = new User("0002", "tiger");
//        User user_2 = new User("0001", "dog");

        Character man = new Character("0001", "gun", 8000, 80, 5, 50, 40);
        System.out.println(j);
        //user spec 0001
        //id : 0001 , model : gun, hp : 8000, damage : 80, shield : 5, speed : 50, attack_speed : 40
        String input = sc.nextLine(); // user add 0002 tiger, user del 0002, user list, user spac 0002, user record 0002
        String[] arr = input.split(" ");
        if (arr[1].equals("spec")) {
            j.get(arr[2]);
        }
        if (arr[1].equals("add")) {
            j.put(arr[2], arr[3]);
        }
        j.put(user_1.id, new JSONObject(man));
        System.out.println(j.get(user_1.id));
    }
}
