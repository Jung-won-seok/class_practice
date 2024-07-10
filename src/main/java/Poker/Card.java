package Poker;

public class Card implements Comparable<Card>{
    int num;
    String shape;

    public Card() {
    }

    public Card(int num, String shape) {
        this.num = num;
        this.shape = shape;
    }

    @Override
    public int compareTo(Card card) {
        return this.num - card.num;
    }
}
// S, D, H, C
