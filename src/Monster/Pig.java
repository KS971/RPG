package Monster;

import ConsumptionItem.*;

public class Pig extends Monster {
    private String MONSTER_NAME = "돼지";
    private int HP = 70;
    private int MONSTER_OFF = 12;
    PigMeat pigmeat = new PigMeat();
    ConsumptionItem SPOIL_ITEM[] = {pigmeat};

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
        return SPOIL_ITEM[(int) Math.random() * SPOIL_ITEM.length];
    }
}
