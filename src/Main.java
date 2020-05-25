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
        Brandish brandish = new Brandish();
        HareMeat hareMeat = new HareMeat();

        hareMeat.getItemInfo();
        Kang.consumeItem(hareMeat);
        Kang.consumeItem(hareMeat);

        Kang.getState();

//        plain(Kang);

    }
}
//인벤토리
//스킬 중복 확인(구현중)
//전리품(구현중)
//사냥터 입장후 HP를 유지하도록 변경(구현 완료)
//setCharHP, setCharMP, consumeItem 메소드 추가
//소비 아이템 클래스 추가, 토끼 고기 아이템 추가
