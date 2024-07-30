package Json;

import org.json.JSONObject;

import java.util.Scanner;

/**
 * [추가]
 * user add <id> <name>
 * user add 0002 tiger
 * -> 사용자 tiger가 추가되었습니다.
 * -> tiger의 모델 :
 * -> tiger의 체력(0~10000) :
 * -> tiger의 공격력(0~100) :
 * -> tiger의 방어력(0~50) :
 * -> tiger의 이동속도(0~100) :
 * -> tiger의 공격속도(0~100) :
 *
 * [삭제]
 * user del <id>
 * user del 0002
 * -> 사용자 tiger가 삭제 되었습니다.
 *
 * [보기]
 * user list
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JSONObject j = new JSONObject();

    }
}
