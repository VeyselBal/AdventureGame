package AdventureGame.Creature;

public class Monster extends Creature {

    private final int award;


    public Monster(String name,int id,int damage,int health,int money,int award){
        super(name,id,damage,health,money);
        this.award=award;
    }

    public int getAward() {
        return award;
    }

}
