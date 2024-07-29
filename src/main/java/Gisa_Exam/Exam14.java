package Gisa_Exam;

public class Exam14 {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int sum = 0;

    public void check(boolean input){
        sum = 0;
        for(int i : arr){
            Cal cal = (o) -> {
                if((o && i % 2 != 0) || (!o && i % 2 == 0)) sum += i;
                return true;
            };
            cal.cals(input);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Exam14 ex = new Exam14();
        ex.check(true);
        ex.check(false);
    }
}

interface Cal {
    boolean cals(boolean o);
}