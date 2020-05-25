package Job;

import Armor.Armor;
import Skill.Skill;
import Weapon.Weapon;

import java.util.Scanner;

public class Character {
    private String NAME, WEAPON_NAME, ARMOR_NAME;
    private int HP, MP, OFF, DEF, SKILL_INDEX, WEAPON_OFF, ARMOR_DEF;
    private String SKILL_LIST[] = new String[4];
    private Skill SKILL[] = new Skill[4];

    public Character(String name) {
        NAME = name;
        HP = 100;
        MP = 60;
        OFF = 8;
        DEF = 5;
        SKILL_INDEX = 0;
        WEAPON_OFF = 0;
        ARMOR_DEF = 0;
    }

    public void getState() {
        System.out.printf("%s의 스테이터스\n", NAME);
        System.out.printf("HP: %d\n", HP);
        System.out.printf("MP: %d\n", MP);
        System.out.printf("공격력: %d\n", OFF);
        System.out.printf("방어력: %d\n\n", DEF);
    }

    public String getCharName() {
        return NAME;
    }

    public int getCharHP() {
        return HP;
    }

    public int getCharMP() {
        return MP;
    }

    public int getCharOFF() {
        return OFF;
    }

    public int getCharDEF() {
        return DEF;
    }

    public void setSkill(Skill skill) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한번 배운 스킬은 되돌릴 수 없습니다.");
        System.out.printf("%s 스킬을 배우시겠습니까?\n", skill.getSkillName());
        System.out.println("1. 배운다 2. 배우지 않는다.");

        if (scanner.nextInt() == 1) {
            SKILL[SKILL_INDEX] = skill;
            SKILL_LIST[SKILL_INDEX] = skill.getSkillName();
            SKILL_INDEX++;
            System.out.printf("%s(을)를 습득했습니다.\n\n", skill.getSkillName());
        } else {
            System.out.println("스킬 습득을 취소했습니다.\n");
        }
    }

    public Skill[] getSkill() {
        return this.SKILL;
    }

    public void getSkillList() {
        int index = 0;
        while (index <= SKILL_LIST.length) {
            if (SKILL_LIST[index] == null)
                break;
            else {
                System.out.printf("%d. %s ", index + 1, SKILL_LIST[index]);
                index++;
            }
        }
        System.out.println();
    }

    public void setWeapon() {
        OFF -= WEAPON_OFF;
        WEAPON_OFF = 0;
        System.out.println("무장을 해제했습니다.\n");
    }

    public void setWeapon(Weapon weapon) {
        WEAPON_NAME = weapon.getWeaponName();
        WEAPON_OFF += weapon.getWeaponOFF();
        OFF += WEAPON_OFF;
        System.out.printf("%s(을)를 착용했습니다.\n\n", WEAPON_NAME);
    }

    public void getWeapon() {
        if (WEAPON_OFF == 0) {
            System.out.println("어떠한 무기도 착용하지 않았습니다.\n");
        } else {
            System.out.printf("%s(을)를 착용중입니다.\n\n", WEAPON_NAME);
        }
    }

    public void setArmor() {
        DEF -= ARMOR_DEF;
        ARMOR_DEF = 0;
        System.out.println("무장을 해제했습니다.\n");
    }

    public void setArmor(Armor armor) {
        ARMOR_NAME = armor.getArmorName();
        ARMOR_DEF += armor.getArmorDEF();
        DEF += ARMOR_DEF;
        System.out.printf("%s(을)를 착용했습니다.\n\n", ARMOR_NAME);
    }

    public void getArmor() {
        if (ARMOR_DEF == 0)
            System.out.println("어떠한 방어구도 착용하지 않았습니다.\n");
        else
            System.out.printf("%s(을)를 착용중입니다.\n\n", ARMOR_NAME);
    }

    public int attack() {
        int maxAttack = (int) Math.round(OFF * 0.3);
        int minAttack = (int) Math.round(OFF * 0.8);
        return (int) (Math.random() * maxAttack) + minAttack;
    }
}
