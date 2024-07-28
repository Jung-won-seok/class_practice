package Practice;

public class Rational{
    public double son;
    public double parent;
    //더하기 빼기 곱하기 나누기
    public Rational(double son, double parent){
        this.son = son;
        this.parent=parent;
    }

    public Rational add(Rational a){
        double newParent = this.parent * a.parent;
        double newSon = (this.son * a.parent) + (this.parent * a.son);
        return new Rational(newSon, newParent);
    }

    public Rational substract(Rational a){
        double newParent = this.parent * a.parent;
        double newSon = (this.parent * a.son) - (this.son * a.parent);
        return new Rational(newSon, newParent);
    }

    public Rational multiply(Rational a){
        double newParent = this.parent * a.parent;
        double newSon = this.son * a.son;
        return new Rational(newSon, newParent);
    }

    public Rational devide(Rational a){
        double newParent = a.parent * this.son;
        double newSon = this.parent * a.son;
        return new Rational(newSon, newParent);
    }

}

class Test{
    public static void main(String[] args) {
        Rational r1 = new Rational(4, 5);
        Rational r2 = r1.devide(new Rational(2, 3)); // () - r1
        System.out.println(r2.son / r2.parent);
    }
}