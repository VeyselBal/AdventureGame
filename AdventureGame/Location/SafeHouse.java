package AdventureGame.Location;

import AdventureGame.Player;

public class SafeHouse extends Location {

    public SafeHouse(Player player){
        super("G�venli Ev",player);
        reLife();
    }

    public void reLife(){
        player.setHealth(player.getReHealthy());
        System.out.println("Can�n�z yenilenmi�tir.");
        System.out.println();
    }
}
