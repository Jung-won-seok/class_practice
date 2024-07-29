package Json;

public class Character {
    String id;
    String model;
    int hp;
    int damage;
    int shield;
    int speed;
    int attack_speed;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(int attack_speed) {
        this.attack_speed = attack_speed;
    }

    public Character(String id, String model, int hp, int damage, int shield, int speed, int attack_speed) {
        this.id = id;
        this.model = model;
        this.hp = hp;
        this.damage = damage;
        this.shield = shield;
        this.speed = speed;
        this.attack_speed = attack_speed;
    }
}
