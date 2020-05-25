package Armor;

public class HumbleRobe extends Armor {
    private String ARMOR_NAME = "Humble Robe";
    private int ARMOR_DEF = 5;

    @Override
    public void getArmorInfo() {
        System.out.println("허름한 로브이다.");
        System.out.printf("방어력 : %d\n\n", ARMOR_DEF);
    }

    @Override
    public String getArmorName() {
        return ARMOR_NAME;
    }

    @Override
    public int getArmorDEF() {
        return ARMOR_DEF;
    }
}
