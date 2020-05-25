package ConsumptionItem;

public class HareMeat extends ConsumptionItem {
    private String ITEM_NAME = "토끼 고기";
    private String ITEM_SORT = "HP";
    private int ITEM_EFFECT = 10;
    
    @Override
    public void getItemInfo() {
        System.out.println("토끼 고기이다.");
        System.out.println("HP를 10 회복할 수 있다.\n");
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
