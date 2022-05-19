package AdventureGame;

public abstract class Inventory {
    private int ID;
    private int money;
    private String name;
    Player player;

    public Inventory(int ID, int money, String name) {
        this.ID = ID;
        this.money = money;
        this.name = name;
    }

    public Inventory(Player player) {
        this.player = player;
    }

    public abstract void list();

    public int getID() {
        return ID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
