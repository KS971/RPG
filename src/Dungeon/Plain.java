package Dungeon;

import java.util.Scanner;

import Job.Character;
import Skill.Skill;
import Monster.*;

public class Plain extends Dungeon {
    public static void plain(Character character) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String MON_LIST[] = {"Rabbit", "Pig"};
        Monster monster = SpawnMonster.spawn(MON_LIST[(int) (Math.random() * 2)]);
        String MON_NAME = monster.getMonName();
        String CH_NAME = character.getCharName();
        int CH_HP = character.getCharHP();
        int CH_MP = character.getCharMP();
        int MON_HP = monster.getMonHP();
        Skill CH_SKILL[] = character.getSkill();

        System.out.println("평야에 도착했습니다.\n(두리번 두리번..)\n");
//        Thread.sleep(((int)(Math.random() * 8) + 4) * 1000);
        System.out.printf("야생의 %s(이)가 나타났습니다!\n\n", MON_NAME);

        battleloop:
        do {
            System.out.println("어떤 행동을 취하시겠습니까?\n1. 공격 2. 방어 3. 스킬");
            int SELECT = scanner.nextInt();
            switch (SELECT) {
                case 1: //공격
                    int CH_DAMAGE = character.attack();
                    MON_HP -= CH_DAMAGE;

                    if (MON_HP <= 0) // <--
                        MON_HP = 0;

                    if (CH_DAMAGE > character.getCharOFF()) {
                        System.out.printf("크리티컬 히트! %d의 데미지를 주었습니다.\n", CH_DAMAGE);
                        System.out.printf("%s의 잔여 HP: %d\n\n", MON_NAME, MON_HP);
                    } else {
                        System.out.printf("%d의 데미지를 주었습니다.\n", CH_DAMAGE);
                        System.out.printf("%s의 잔여 HP: %d\n\n", MON_NAME, MON_HP);
                    }

                    if (MON_HP <= 0) // <--
                        break battleloop;

                    break;
                case 2: //방어
                    int CH_DEF = character.getCharDEF();
                    break;

                case 3: //스킬
                    System.out.println("사용할 스킬을 선택해주세요.");
                    character.getSkillList();
                    int SKILL_SELECT = scanner.nextInt();
                    switch (SKILL_SELECT) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            if (CH_MP < CH_SKILL[SKILL_SELECT - 1].getConsumeMP()) {
                                System.out.println("MP가 부족합니다!");
                                continue battleloop;
                            }
                            int CH_SKILL_DAMAGE = CH_SKILL[SKILL_SELECT - 1].getSkillEffect();
                            MON_HP -= CH_SKILL_DAMAGE;
                            CH_MP -= CH_SKILL[SKILL_SELECT - 1].getConsumeMP();

                            System.out.printf("%s(을)를 시전합니다.\n", CH_SKILL[SKILL_SELECT - 1].getSkillName());
                            System.out.printf("%s의 잔여 MP: %d\n\n", CH_NAME, CH_MP);

                            if (CH_MP <= 0) // <--
                                CH_MP = 0;

                            Thread.sleep(1000);

                            System.out.printf("%d의 데미지를 주었습니다.\n", CH_SKILL_DAMAGE);
                            System.out.printf("%s의 잔여 HP: %d\n\n", MON_NAME, MON_HP);

                            if (MON_HP <= 0)
                                break battleloop;

                            break;
                        default:
                            System.out.println("유효 하지 않은 숫자입니다.\n");
                            continue battleloop;
                    }
                    break;
                default:
                    System.out.println("유효 하지 않은 숫자입니다.\n");
                    continue battleloop;
            }
            Thread.sleep(1000);
            System.out.printf("%s가 공격해옵니다!\n\n", MON_NAME);
            Thread.sleep(1000);

            int MON_DAMEGE = monster.getMonOFF();
            MON_DAMEGE = (int) ((Math.random() * MON_DAMEGE * 1.1) + MON_DAMEGE * 0.8);

            if (SELECT == 2) {
                System.out.println("방어 태세를 갖춥니다.\n");
                MON_DAMEGE -= character.getCharDEF();

                if (MON_DAMEGE <= 0)
                    MON_DAMEGE = 0;

                Thread.sleep(1000);
            }
            CH_HP -= MON_DAMEGE;

            if (CH_HP <= 0) // <--
                CH_HP = 0;

            System.out.printf("%d의 데미지를 입었습니다.\n", MON_DAMEGE);
            System.out.printf("%s의 잔여 HP: %d\n\n", CH_NAME, CH_HP);

            if (CH_HP <= 0) // <--
                break;

        } while (MON_HP > 0 || CH_HP > 0);

        if (MON_HP <= 0)
            System.out.printf("%s을(를) 헤치웠습니다!\n", MON_NAME);

        if (CH_HP <= 0)
            System.out.printf("%s에 의해 사망했습니다.\n", MON_NAME);

    }
}
