package Gisa_Exam;

public class Exam14 {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int sum = 0;

    public int check(boolean odd){
        sum = 0;
        for(int i : arr){
            Cal cal = (boolean o) -> {
                if((o && i % 2 != 0) || (!o && i % 2 == 0)) sum += i;
                return true;
            };
            cal.cals(odd);
        }
        return sum;
    }

    public static void main(String[] args) {
        Exam14 ex = new Exam14();
        System.out.println(ex.check(true));
        System.out.println(ex.check(false));
    }
}

interface Cal {
    boolean cals(boolean odd);
}
