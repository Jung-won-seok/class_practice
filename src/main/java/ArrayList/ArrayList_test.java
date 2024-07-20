package ArrayList;



public class ArrayList_test {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();

        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);

        arraylist.get(2); //index[2], 요소접근

        arraylist.set(1, 55); //2를 55로 바꾼다.

        arraylist.remove(2); //index(2)를 삭제

        arraylist.size(); //크기 확인

    }
}
