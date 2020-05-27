package Monster;

import ConsumptionItem.*;

public class Rabbit extends Monster {
    private String MONSTER_NAME = "토끼";
    private int HP = 50;
    private int MONSTER_OFF = 9;
    HareMeat haremeat = new HareMeat();
    ConsumptionItem SPOIL_ITEM[] = {haremeat};

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

    @Override
    public ConsumptionItem getSpoilItem() {
        return SPOIL_ITEM[(int)Math.random() * SPOIL_ITEM.length];
    }
}
