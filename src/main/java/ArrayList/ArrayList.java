package ArrayList;

import java.util.ListIterator;

public class ArrayList {
    private Integer[] elementData = new Integer[100];
    int last = 0;

    /**
     * 요소 추가
     * @param i 추가 할 요소
     */
    public void add(int i) {
        elementData[last] = i;
        last++;
    }

    public void add(int index, int i){
        // 10 20 30, 10과 20 사이에 50 넣고싶다. index = 1
        for (int j = last - 1; j >= index; j--) {
            elementData[last + 1] = elementData[last];
        }
        elementData[index] = i;
        last++;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < last; i++) {
            str += elementData[i];
            if (i < last - 1) {
                str+=",";
            }
        }
        return str + "]";
    }

    /**
     * 요소 접근
     * @param i 찾으려는 인덱스
     */
    public int get(int i) {
        return elementData[i];
    }

    /**
     * 요소 수정
     * @param index 수정하려는 인덱스
     * @param i1 수정하려는 값
     */
    public void set(int index, int i1) {
        elementData[index] = i1;
    }

    /**
     * 요소 제거
     * @param index 제거하려는 인덱스
     */
    public void remove(int index) {
        for (int i = index; i <= last - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        last--;
    }

    /**
     * 크기 확인
     */
    public int size() {
        return last;
    }
}