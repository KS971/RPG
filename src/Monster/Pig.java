package Monster;

public class Pig extends Monster {
    private int HP = 70;
    private int MONSTER_OFF = 12;

    @Override
    public String getMonName() {
        return "Pig";
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
