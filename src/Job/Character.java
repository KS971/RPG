package Job;

public class Character {
    private String NAME, WEAPON_NAME, ARMOR_NAME;
    private int HP, MP, OFF, DEF, WEAPON_OFF, ARMOR_DEF;

    public Character(String name) {
        this.NAME = name;
        this.HP = 100;
        this.MP = 60; // <--
        this.OFF = 8;
        this.DEF = 5;
        this.WEAPON_OFF = 0;
        this.ARMOR_DEF = 0;
    }

    public void getState() {
        System.out.printf("%s의 스테이터스\n", this.NAME);
        System.out.printf("HP: %d\n", this.HP);
        System.out.printf("MP: %d\n", this.MP);
        System.out.printf("공격력: %d\n", this.OFF);
        System.out.printf("방어력: %d\n\n", this.DEF);
    }

    public String getCharName() {
        return this.NAME;
    }

    public int getCharHP() {
        return this.HP;
    }

    public int getCharOFF() {
        return this.OFF;
    }

    public int getCharDEF() {
        return this.DEF;
    }

    public void setWeapon() {
        this.OFF -= this.WEAPON_OFF;
        this.WEAPON_OFF = 0;
        System.out.println("무장을 해제했습니다.\n");
    }

    public void setWeapon(String name, int off) {
        this.WEAPON_NAME = name;
        this.WEAPON_OFF += off;
        this.OFF += this.WEAPON_OFF;
        System.out.printf("%s(을)를 착용했습니다.\n\n", this.WEAPON_NAME);
    }

    public void getWeapon() {
        if (this.WEAPON_OFF == 0) {
            System.out.println("어떠한 무기도 착용하지 않았습니다.\n");
        } else {
            System.out.printf("%s(을)를 착용중입니다.\n\n", this.WEAPON_NAME);
        }
    }

    public void setArmor() {
        this.DEF -= this.ARMOR_DEF;
        this.ARMOR_DEF = 0;
        System.out.println("무장을 해제했습니다.\n");
    }

    public void setArmor(String name, int off) {
        this.ARMOR_NAME = name;
        this.ARMOR_DEF += off;
        this.DEF += this.ARMOR_DEF;
        System.out.printf("%s(을)를 착용했습니다.\n\n", this.ARMOR_NAME);
    }

    public void getArmor() {
        if (this.ARMOR_DEF == 0)
            System.out.println("어떠한 방어구도 착용하지 않았습니다.\n");
        else
            System.out.printf("%s(을)를 착용중입니다.\n\n", this.ARMOR_NAME);
    }
    // <--
    public int attack() {
        return (int)(Math.random() * Math.round(this.OFF * 1.1)) + (int)Math.round(this.OFF * 0.8);
    }
    // <--
}
