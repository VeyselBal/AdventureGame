package AdventureGame.Location;

import AdventureGame.Creature.Bear;
import AdventureGame.Player;

public class River extends BattleField {

    public River(Player player) {
        super("Nehir",player,new Bear());
    }
}
