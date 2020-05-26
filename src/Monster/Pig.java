package Monster;

public class Pig extends Monster {
    private String MONSTER_NAME = "돼지";
    private int HP = 70;
    private int MONSTER_OFF = 12;

    @Override
    public String getMonName() {
        return MONSTER_NAME;
    }

    @Override
    public int getMonHP() {
        return HP;
    }

    @Override
    public int getMonOFF() {
        return MONSTER_OFF;
    }
}
