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
        armors[2] = new Armor(3, "A��r", 5, 40);
        System.out.println("---------------------------------------------");
        System.out.println("Evanterinizdeki alt�n: " + player.getMoney());
        for (Armor value : armors) {
            System.out.println("ID: " + value.getID() + "\t" +
                    "�sim: " + value.getName() + "\t\t" +
                    "Z�rh: " + value.getArmor() + "\t\t" +
                    "Para: " + value.getMoney());
        }
        System.out.print("Hangi z�rh� almak istersiniz: ");
        int n = Game.inp.nextInt();
        if (n <= armors.length && n > 0) {
            if (player.getMoney() >= armors[n - 1].getMoney()) buyArmor(armors[n - 1]);
            else {
                System.out.println("Paran�z yetmemektedir.");
                System.out.println();
            }
        }
    }

    private void buyArmor(Armor armor) {
        player.setArmor(armor.getArmor());
        player.setMoney(player.getMoney() - armor.getMoney());
        System.out.println("Z�rh sat�n al�nm��t�r.");
        System.out.println("ID: " + player.getID() + "\t" +
                "�sim: " + player.getName() + "\t\t" +
                "Hasar: " + player.getDamage() + "\t\t" +
                "Z�rh: " + player.getArmor() + "\t\t" +
                "Sa�l�k: " + player.getHealth() + "\t\t" +
                "Para: " + player.getMoney());
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public int getArmor() {
        return armor;
    }

}
