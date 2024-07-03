public class call_by_reference {
    static void m(int[] array){
        array[0] = 5;
        System.out.println(array[0]);
    }
    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(array[0]); // 1출력
        m(array); // 5출력
        System.out.println(array[0]); // 5출력 -> array는 call by reference로 전달되어 주소값이 전달되기 때문에 array의 값이 변한다.
    }
}
