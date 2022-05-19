package AdventureGame.Creature;

public abstract class Creature {
    private String name;
    private int ID;
    private int damage;
    private int health;
    private int money;

    public Creature(String name, int ID, int damage, int health,int money) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.health = health;
        this.money=money;
    }

    public Creature() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
