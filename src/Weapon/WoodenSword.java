package Weapon;

public class WoodenSword extends Weapon {
    private String WEAPON_NAME = "목검";
    private int WEAPON_OFF = 11;

    @Override
    public void getWeaponInfo() {
        System.out.println("평범한 목검이다.");
        System.out.printf("공격력 : %d\n\n", WEAPON_OFF);
    }

    @Override
    public String getWeaponName() {
        return WEAPON_NAME;
    }

    @Override
    public int getWeaponOFF() {
        return WEAPON_OFF;
    }
}
