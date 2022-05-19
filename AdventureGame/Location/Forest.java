package AdventureGame.Location;

import AdventureGame.Player;
import AdventureGame.Creature.Vampyr;

public class Forest extends BattleField {

    public Forest(Player player) {
        super("Orman",player,new Vampyr());
    }
}
