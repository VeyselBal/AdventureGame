package AdventureGame;

public class Weapon extends Inventory {

    private int damage;

    public Weapon(int ID, int money, String name, int damage) {
        super(ID, money, name);
        this.damage = damage;
    }

    public Weapon(Player player) {
        super(player);
        list();
    }

    @Override
    public void list() {
        Weapon[] weapons = new Weapon[3];
        weapons[0] = new Weapon(1, 25, "tabanca", 2);
        weapons[1] = new Weapon(2, 35, "K�l��", 3);
        weapons[2] = new Weapon(3, 45, "T�fek", 7);
        System.out.println("---------------------------------------------");
        System.out.println("Evanterinizdeki alt�n: " + player.getMoney());
        for (Weapon value : weapons) {
            System.out.println("ID: " + value.getID() + "\t" +
                    "Silah: " + value.getName() + "\t\t" +
                    "Hasar: " + value.getDamage() + "\t\t" +
                    "Para: " + value.getMoney());
        }
        System.out.print("Hangi silah� almak istersiniz: ");
        int n = Game.inp.nextInt();
        if (n <= weapons.length && n > 0) {
            if (player.getMoney() >= weapons[n - 1].getMoney()) buyWeapon(weapons[n - 1]);
            else System.out.println("Paran�z yetmemektedir.");
        }
    }

    private void buyWeapon(Weapon weapon) {
        player.setDamage(player.getPunch() + weapon.damage);
        player.setMoney(player.getMoney() - weapon.getMoney());
        System.out.println("Silah sat�n al�nm��t�r.");
        System.out.println("ID: " + player.getID() + "\t" +
                "�sim: " + player.getName() + "\t\t" +
                "Hasar: " + player.getDamage() + "\t\t" +
                "Z�rh: " + player.getArmor() + "\t\t" +
                "Sa�l�k: " + player.getHealth() + "\t\t" +
                "Para: " + player.getMoney());
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public int getDamage() {
        return damage;
    }
}
