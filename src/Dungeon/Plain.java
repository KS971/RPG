package Dungeon;

import Job.Character;
import Monster.*;

import java.util.Scanner;

public class Plain extends Dungeon {
    public static void plain(Character character) throws Exception {
        // <--
        String MON_LIST[] = {"Rabbit", "Pig"};
        // <--
        Scanner scanner = new Scanner(System.in);
        Monster monster = SpawnMonster.spawn(MON_LIST[(int) Math.random() * 2]);
        int CH_HP = character.getCharHP(); // <--
        int MON_HP = monster.getMonHP();
        String MON_NAME = monster.getMonName();

        System.out.println("평야에 도착했습니다.\n(두리번 두리번..)\n");
//        Thread.sleep(((int)(Math.random() * 8) + 4) * 1000);
        System.out.printf("야생의 %s(이)가 나타났습니다!\n\n", MON_NAME);

        batteloop:
        do {
            System.out.println("어떻게 하시겠습니까?\n1. 공격 2. 방어");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    int CH_DAMAGE = character.attack();
                    MON_HP -= CH_DAMAGE;

                    if (MON_HP <= 0)
                        MON_HP = 0;
                    if (CH_DAMAGE > character.getCharOFF()) {
                        System.out.printf("크리티컬 히트! %d의 데미지를 주었습니다.\n", CH_DAMAGE);
                        System.out.printf("%s의 잔여 HP: %d\n\n", MON_NAME, MON_HP);
                    } else {
                        System.out.printf("%d의 데미지를 주었습니다.\n", CH_DAMAGE);
                        System.out.printf("%s의 잔여 HP: %d\n\n", MON_NAME, MON_HP);
                    }
                    if (MON_HP <= 0)
                        break batteloop;
                case 2:
                    int CH_DEF = character.getCharDEF();
                    break;
                default:
                    System.out.println("유효 하지 않은 숫자입니다.\n");
            }
            Thread.sleep(1000);
            System.out.printf("%s가 공격해옵니다!\n\n", MON_NAME);
            Thread.sleep(1000);

            int MON_DAMEGE = monster.getMonOFF();
            if(select == 2) {
                System.out.println("방어태세를 갖춥니다.\n");
                MON_DAMEGE -= character.getCharDEF();
                if(MON_DAMEGE <= 0) {
                    MON_DAMEGE = 0;
                }
                Thread.sleep(1000);
            }
            CH_HP -= MON_DAMEGE;

            if(CH_HP <= 0)
                CH_HP = 0;
            System.out.printf("%d의 데미지를 입었습니다.\n", MON_DAMEGE);
            System.out.printf("%s의 잔여 HP: %d\n\n", character.getCharName(), CH_HP);

            if (CH_HP <= 0)
                break;

        } while (MON_HP > 0 || CH_HP > 0);

        if (MON_HP <= 0)
            System.out.printf("%s을(를) 헤치웠습니다!\n", MON_NAME);

        if (CH_HP <= 0)
            System.out.printf("당신은 %s에 의해 사망했습니다.\n", MON_NAME);

    }
}
