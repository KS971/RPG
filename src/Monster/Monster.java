package Monster;

import ConsumptionItem.ConsumptionItem;

public abstract class Monster {
    public abstract String getMonName();

    public abstract int getMonHP();

    public abstract int getMonOFF();

    public abstract ConsumptionItem getSpoilItem();
}
