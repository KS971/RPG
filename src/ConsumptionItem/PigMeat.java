package ConsumptionItem;

public class PigMeat extends ConsumptionItem {
    private String ITEM_NAME = "돼지 고기";
    private String ITEM_SORT = "HP";
    private int ITEM_EFFECT = 15;

    @Override
    public void getItemInfo() {
        System.out.println("돼지 고기이다.");
        System.out.println("HP를 15 회복할 수 있다.\n");
    }

    @Override
    public String getItemName() {
        return ITEM_NAME;
    }

    @Override
    public int getItemEffect() {
        return ITEM_EFFECT;
    }

    @Override
    public String getItemSort() {
        return ITEM_SORT;
    }
}
