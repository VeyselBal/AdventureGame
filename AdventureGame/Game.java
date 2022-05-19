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
        System.out.println("Gemin dalgalara daha fazla dayanamd� ve par�aland� adada mahsur kald�n. ��kmak i�in �d�lleri topla ve ka�.");
        System.out.println("O kadar da vicdans�z de�iliz. �ampiyonunu se� ve yarat�klarla sava� �d�llerini al.");
        System.out.println("Hangi �ampiyonu se�mek istersin ( ID ile se�eceksiniz )");
        Player player = new Player();
        player.championSelection();
        System.out.println();
        System.out.println("Oyunu bitirmek i�in 3 �d�l toplaman�z laz�m. Ma�aradan food, Ormandan firewood, Nehirden water.");
        System.out.println();
        while (player.getHealth() != 0 && !(player.getAward()[0] == 1 && player.getAward()[1] == 1 && player.getAward()[2] == 1)) {
            System.out.println("1-) G�venli ev => can�n�z� yeniler." + "\n" +
                    "2-) Ma�aza => z�rh ve silah alabilirsiniz." + "\n" +
                    "3-) Ma�ara => food �d�l� ve say�s�n� bilmedi�iniz zombiler." + "\n" +
                    "4-) Orman  => firewood �d�l� ve say�s�n� bilmedi�iniz vampireler." + "\n" +
                    "5-) Nehir  => water �d�l� ve say�s�n� bilmedi�iniz ay�lar." + "\n" +
                    "6-) karakter detaylar� ve envanterin.");

            System.out.print("Nereye gitmek istersiniz: ");
            int number = Game.inp.nextInt();
            switch (number) {
                case 1:
                    new SafeHouse(player);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Ne almak istersiniz z�rh ID: 1 veya silah ID: 2. : ");
                    number = Game.inp.nextInt();
                    if (number == 1)
                        new Armor(player);
                    else if (number == 2)
                        new Weapon(player);
                    else System.out.println("yanl�� de�erler girdiniz");
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
                            "Z�rh: " + player.getArmor() + "\t\t" +
                            "Sa�l�k: " + player.getHealth() + "\t\t" +
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
            System.out.println("B�t�n �d�lleri toplad�n�z tebrikler adadan kurtuldunuz. ");
    }
}
