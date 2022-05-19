package AdventureGame;

import AdventureGame.Location.Cave;
import AdventureGame.Location.Forest;
import AdventureGame.Location.River;
import AdventureGame.Location.SafeHouse;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static Scanner inp = new Scanner(System.in);
    public static Random rnd = new Random();

    public void run() {
        System.out.println("Gemin dalgalara daha fazla dayanamdý ve parçalandý adada mahsur kaldýn. Çýkmak için ödülleri topla ve kaç.");
        System.out.println("O kadar da vicdansýz deðiliz. Þampiyonunu seç ve yaratýklarla savaþ ödüllerini al.");
        System.out.println("Hangi þampiyonu seçmek istersin ( ID ile seçeceksiniz )");
        Player player = new Player();
        player.championSelection();
        System.out.println();
        System.out.println("Oyunu bitirmek için 3 ödül toplamanýz lazým. Maðaradan food, Ormandan firewood, Nehirden water.");
        System.out.println();
        while (player.getHealth() != 0 && !(player.getAward()[0] == 1 && player.getAward()[1] == 1 && player.getAward()[2] == 1)) {
            System.out.println("1-) Güvenli ev => canýnýzý yeniler." + "\n" +
                    "2-) Maðaza => zýrh ve silah alabilirsiniz." + "\n" +
                    "3-) Maðara => food ödülü ve sayýsýný bilmediðiniz zombiler." + "\n" +
                    "4-) Orman  => firewood ödülü ve sayýsýný bilmediðiniz vampireler." + "\n" +
                    "5-) Nehir  => water ödülü ve sayýsýný bilmediðiniz ayýlar." + "\n" +
                    "6-) karakter detaylarý ve envanterin.");

            System.out.print("Nereye gitmek istersiniz: ");
            int number = Game.inp.nextInt();
            switch (number) {
                case 1:
                    new SafeHouse(player);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Ne almak istersiniz zýrh ID: 1 veya silah ID: 2. : ");
                    number = Game.inp.nextInt();
                    if (number == 1)
                        new Armor(player);
                    else if (number == 2)
                        new Weapon(player);
                    else System.out.println("yanlýþ deðerler girdiniz");
                    break;
                case 3:
                    new Cave(player);
                    break;
                case 4:
                    new Forest(player);
                    break;
                case 5:
                    new River(player);
                    break;
                case 6:
                    System.out.println(player.getName() + "\t" +
                            "Hasar: " + player.getDamage() + "\t" +
                            "Zýrh: " + player.getArmor() + "\t\t" +
                            "Saðlýk: " + player.getHealth() + "\t\t" +
                            "Para: " + player.getMoney()+ "\t\t" +
                            "Food: "+player.getAward()[0]+ "\t\t" +
                            "Firewood: "+ player.getAward()[1]+ "\t\t" +
                            "Water: "+ player.getAward()[2]);
                    System.out.println();
                default:
                    break;
            }
        }
        if (player.getHealth()!=0)
            System.out.println("Bütün ödülleri topladýnýz tebrikler adadan kurtuldunuz. ");
    }
}
