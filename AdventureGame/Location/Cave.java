package AdventureGame.Location;

import AdventureGame.Player;
import AdventureGame.Creature.Zombie;

public class Cave extends BattleField {

    public Cave(Player player){
        super("Maðara",player,new Zombie());
    }
}
