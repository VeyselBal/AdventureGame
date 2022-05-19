package AdventureGame.Location;

import AdventureGame.Creature.Monster;
import AdventureGame.Game;
import AdventureGame.Player;

public class BattleField extends Location {

    Monster monster;
    int monsterCount;
    int startWho;
    int monsterReHealth;

    public BattleField(String locationName, Player player, Monster monster) {
        super(locationName, player);
        this.monster = monster;
        monsterReHealth = monster.getHealth();
        monsterCount = Game.rnd.nextInt(1, 4);
        startWho = Game.rnd.nextInt(1, 5);
        goBattle();
    }

    private void goBattle() {
        System.out.println(getLocationName() + " girdin ilerliyorsun kar��na " + monsterCount + " tane " + monster.getName() + " ��kt�");
        while (true) {
            System.out.println("sava�mak i�in F ye bas. ka�mak i�in R ye bas.");
            String letter = Game.inp.next().toUpperCase();
            if (letter.equals("F")) {
                if (startWho > 2) {
                    warPlayer();
                    if (isWhoWin()) break;
                    warMonster();
                } else {
                    warMonster();
                    if (isWhoWin()) break;
                    warPlayer();
                }
                if (isWhoWin()) break;
                System.out.println();

            } else {
                System.out.println("Sava�tan ka�t�n. korkaks�n!!!");
                System.out.println();
                break;
            }
        }
        if (player.isLife()) {
            System.out.println("Malesef �ampiyonunuz �ld�. oyunu kaybettiniz. Adada mahsur kald�n�z... ");
        } else if (monster.getHealth() == 0) {
            System.out.println("Tebrikler sava�� kazand�n�z. Bravo!!!");
            System.out.println("Hazineniz => " + player.getMoney() + " �d�l�n�z envantere eklenmi�tir. ");
            player.setAward(monster.getID(), monster.getAward());
            System.out.println();
        }
    }

    private void warPlayer() {
        monster.setHealth(monster.getHealth() - player.getDamage());
        if (monster.getHealth() <= 0) {
            monster.setHealth(0);
            monsterCount--;
            player.setMoney(player.getMoney() + monster.getMoney());
        }
        System.out.println(player.getDamage() + " hasar vurdun. " + monster.getName() + " " + monster.getHealth() + " can� kald�");
        if (monsterCount > 0 && monster.getHealth() == 0)
            monster.setHealth(monsterReHealth);
    }

    private void warMonster() {
        player.setHealth(player.getHealth() - (monsterCount * monster.getDamage() - player.getArmor()));
        if (player.getHealth() < 0) player.setHealth(0);
        System.out.println(monsterCount + " " + monster.getName() + " " + (monster.getDamage() * monsterCount-player.getArmor()) + " hasar vurdu. " + player.getName() + " " + player.getHealth() + " can� kald�.");
    }

    private boolean isWhoWin() {
        if (monster.getHealth() == 0 && monsterCount == 0) {
            return true;
        } else if (player.getHealth() == 0) {
            player.setLife(true);
            return true;
        }
        return false;
    }
}
