package AdventureGame;

public class Armor extends Inventory {
    private int armor;

    public Armor(int ID, String name, int armor, int money) {
        super(ID, money, name);
        this.armor = armor;
    }

    public Armor(Player player) {
        super(player);
        list();
    }

    public void list() {
        Armor[] armors = new Armor[3];
        armors[0] = new Armor(1, "Hafif", 1, 15);
        armors[1] = new Armor(2, "Orta", 3, 25);
        armors[2] = new Armor(3, "Aðýr", 5, 40);
        System.out.println("---------------------------------------------");
        System.out.println("Evanterinizdeki altýn: " + player.getMoney());
        for (Armor value : armors) {
            System.out.println("ID: " + value.getID() + "\t" +
                    "Ýsim: " + value.getName() + "\t\t" +
                    "Zýrh: " + value.getArmor() + "\t\t" +
                    "Para: " + value.getMoney());
        }
        System.out.print("Hangi zýrhý almak istersiniz: ");
        int n = Game.inp.nextInt();
        if (n <= armors.length && n > 0) {
            if (player.getMoney() >= armors[n - 1].getMoney()) buyArmor(armors[n - 1]);
            else {
                System.out.println("Paranýz yetmemektedir.");
                System.out.println();
            }
        }
    }

    private void buyArmor(Armor armor) {
        player.setArmor(armor.getArmor());
        player.setMoney(player.getMoney() - armor.getMoney());
        System.out.println("Zýrh satýn alýnmýþtýr.");
        System.out.println("ID: " + player.getID() + "\t" +
                "Ýsim: " + player.getName() + "\t\t" +
                "Hasar: " + player.getDamage() + "\t\t" +
                "Zýrh: " + player.getArmor() + "\t\t" +
                "Saðlýk: " + player.getHealth() + "\t\t" +
                "Para: " + player.getMoney());
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public int getArmor() {
        return armor;
    }

}
