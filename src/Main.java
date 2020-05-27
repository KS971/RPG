import Job.Warrior;
import Weapon.WoodenSword;
import Armor.HumbleRobe;
import Skill.Brandish;
import ConsumptionItem.HareMeat;

import static Dungeon.Plain.plain;

public class Main {
    public static void main(String[] args) throws Exception {
        Warrior Kang = new Warrior("강산");

        Kang.getState();

        WoodenSword woodenSword = new WoodenSword();
        HumbleRobe humbleRobe = new HumbleRobe();
        HareMeat hareMeat = new HareMeat();
        Brandish brandish = new Brandish();

        Kang.setInventory(woodenSword);
        Kang.setInventory(humbleRobe);
        Kang.setInventory(hareMeat);
        Kang.setSkill(brandish);

        plain(Kang);

        Kang.getInventory();

    }
}
//스킬 중복 확인(구현중)
//전리품(구현 완료)
//Add spoil system
//Add PigMeat class to ConsumptionItem package
//Add getSpoilItem method to each monsters' class