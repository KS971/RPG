import Job.Warrior;
import Weapon.WoodenSword;
import Armor.HumbleRobe;
import Skill.Brandish;
import ConsumptionItem.HareMeat;
import ConsumptionItem.PigMeat;

import static Dungeon.Plain.plain;

public class Main {
    public static void main(String[] args) throws Exception {
        Warrior Kang = new Warrior("강산");

        Kang.getState();

        WoodenSword woodenSword = new WoodenSword();
        HumbleRobe humbleRobe = new HumbleRobe();
        Brandish brandish = new Brandish();
        HareMeat hareMeat = new HareMeat();
        PigMeat pigmeat = new PigMeat();

        Kang.setInventory(woodenSword);
        Kang.setInventory(humbleRobe);
        Kang.setWeapon(woodenSword);
//        Kang.setSkill(brandish);

        plain(Kang);

        Kang.getInventory();
        Kang.getState();

        Kang.consumeItem(pigmeat);
        Kang.getState();

    }
}
//스킬 중복 확인(구현중)
//부활 기능(구현중)
//아이템 유무 확인 후 소비하도록 수정(구현중)
//캐릭터 사망후 HP 회복이 안되는 에러 발생(수정중)
//드랍된 아이템의 이름이 출력되도록 수정(구현 완료)