package AdventureGame.Location;

import AdventureGame.Player;

public class SafeHouse extends Location {

    public SafeHouse(Player player){
        super("Güvenli Ev",player);
        reLife();
    }

    public void reLife(){
        player.setHealth(player.getReHealthy());
        System.out.println("Canýnýz yenilenmiþtir.");
        System.out.println();
    }
}
