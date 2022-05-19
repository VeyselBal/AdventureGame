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
        weapons[1] = new Weapon(2, 35, "Kýlýç", 3);
        weapons[2] = new Weapon(3, 45, "Tüfek", 7);
        System.out.println("---------------------------------------------");
        System.out.println("Evanterinizdeki altýn: " + player.getMoney());
        for (Weapon value : weapons) {
            System.out.println("ID: " + value.getID() + "\t" +
                    "Silah: " + value.getName() + "\t\t" +
                    "Hasar: " + value.getDamage() + "\t\t" +
                    "Para: " + value.getMoney());
        }
        System.out.print("Hangi silahý almak istersiniz: ");
        int n = Game.inp.nextInt();
        if (n <= weapons.length && n > 0) {
            if (player.getMoney() >= weapons[n - 1].getMoney()) buyWeapon(weapons[n - 1]);
            else System.out.println("Paranýz yetmemektedir.");
        }
    }

    private void buyWeapon(Weapon weapon) {
        player.setDamage(player.getPunch() + weapon.damage);
        player.setMoney(player.getMoney() - weapon.getMoney());
        System.out.println("Silah satýn alýnmýþtýr.");
        System.out.println("ID: " + player.getID() + "\t" +
                "Ýsim: " + player.getName() + "\t\t" +
                "Hasar: " + player.getDamage() + "\t\t" +
                "Zýrh: " + player.getArmor() + "\t\t" +
                "Saðlýk: " + player.getHealth() + "\t\t" +
                "Para: " + player.getMoney());
        System.out.println("---------------------------------------------");
        System.out.println();
    }

    public int getDamage() {
        return damage;
    }
}
