package Monster;

public class Rabbit extends Monster {
    private int HP = 50;
    private int MONSTER_OFF = 9;

    @Override
    public String getMonName() {
        return "Rabbit";
    }

    @Override
    public int getMonHP() {
        return this.HP;
    }

    @Override
    public int getMonOFF() {
        return MONSTER_OFF;
    }
}
