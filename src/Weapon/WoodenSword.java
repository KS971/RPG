package Weapon;

public class WoodenSword extends Weapon {
    private String WEAPON_NAME = "Wooden Sword";
    private int WEAPON_OFF = 11;

    @Override
    public void getWeaponInfo() {
        System.out.println("평범한 나무 목검이다.");
        System.out.printf("공격력 : %d\n\n", WEAPON_OFF);
    }

    @Override
    public String getWeaponName() {
        return this.WEAPON_NAME;
    }

    @Override
    public int getWeaponOFF() {
        return this.WEAPON_OFF;
    }
}
