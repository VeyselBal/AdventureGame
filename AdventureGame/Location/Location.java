package AdventureGame.Location;

import AdventureGame.Player;

public abstract class Location {
    private final String locationName;
    protected Player player;

    public Location(String locationName, Player player) {
        this.locationName = locationName;
        this.player = player;
    }

    public String getLocationName() {
        return locationName;
    }
}
