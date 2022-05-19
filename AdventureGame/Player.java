package AdventureGame;

import AdventureGame.Creature.Champion;
import AdventureGame.Creature.Creature;

public class Player extends Creature {

    private int punch;
    private int reHealthy;
    private int armor = 0;
    private boolean life = false;
    private final int[] award=new int[3];

    public void championSelection() {
        Champion samurai = new Champion("Samurai", 1, 5, 21, 15);
        Champion archer = new Champion("Archer", 2, 7, 18, 20);
        Champion knight = new Champion("Knight", 3, 8, 24, 5);
        Champion[] champions = new Champion[3];
        champions[0] = samurai;
        champions[1] = archer;
        champions[2] = knight;

        for (Champion value : champions) {
            System.out.println("ID: " + value.getID() + "\t" +
                    "Ýsim: " + value.getName() + "\t\t" +
                    "Hasar: " + value.getDamage() + "\t\t" +
                    "Saðlýk: " + value.getHealth() + "\t\t" +
                    "Para: " + value.getMoney());
        }
        System.out.println();
        System.out.print("Karakter seçimi ID: ");
        int number = Game.inp.nextInt();
        switch (number) {
            case 1 -> initPlayer(champions[0]);
            case 2 -> initPlayer(champions[1]);
            case 3 -> initPlayer(champions[2]);
            default -> initPlayer(samurai);
        }
    }

    public void initPlayer(Champion champion) {
        this.setName(champion.getName());
        this.setID(champion.getID());
        this.punch = champion.getDamage();
        this.setDamage(champion.getDamage());
        this.setHealth(champion.getHealth());
        this.setMoney(champion.getMoney());
        this.reHealthy = champion.getHealth();
        System.out.println("karakteriniz: " + this.getName() + "\t" +
                "Hasar: " + this.getDamage() + "\t" +
                "Zýrh: " + this.getArmor() + "\t\t" +
                "Saðlýk: " + this.getHealth() + "\t\t" +
                "Para: " + this.getMoney());
    }


    public int getPunch() {
        return punch;
    }

    public void setPunch(int punch) {
        this.punch = punch;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public int getReHealthy() {
        return reHealthy;
    }

    public void setReHealthy(int reHealthy) {
        this.reHealthy = reHealthy;
    }

    public int[] getAward() {
        return award;
    }

    public void setAward(int number,int n) {
        this.award[number-1]=n;
    }
}
