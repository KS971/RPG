import Job.Warrior;
import Skill.Brandish;
import Weapon.WoodenSword;
import Armor.HumbleRobe;
import ConsumptionItem.HareMeat;

import static Dungeon.Plain.plain;

public class Main {
    public static void main(String[] args) throws Exception {
        Warrior Kang = new Warrior("강산");

        Kang.getState();

        WoodenSword woodenSword = new WoodenSword();
        HumbleRobe humbleRobe = new HumbleRobe();
        HareMeat hareMeat = new HareMeat();

        Kang.setInventory(hareMeat);
        Kang.setInventory(hareMeat);
        Kang.setInventory(woodenSword);
        Kang.setInventory(humbleRobe);
        Kang.getInventory();

        plain(Kang);

    }
}
//스킬 중복 확인(구현중)
//전리품(구현중)
//인벤토리(구현 완료)
//setInventory 메소드 추가
//monster와 item 이름 한글화