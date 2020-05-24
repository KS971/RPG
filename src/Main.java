import Job.Warrior;
import Weapon.WoodenSword;
import Armor.HumbleRobe;
import Skill.Brandish;

import static Dungeon.Plain.plain;

public class Main {
    public static void main(String[] args) throws Exception {
        Warrior Kang = new Warrior("강산");
        Kang.getState();

        WoodenSword woodenSword = new WoodenSword();
        HumbleRobe humbleRobe = new HumbleRobe();

        woodenSword.getWeaponInfo();
        humbleRobe.getArmorInfo();

        Kang.setWeapon(woodenSword);
        Kang.setArmor(humbleRobe);

        Brandish brandish = new Brandish();
        Kang.setSkill(brandish);

        Kang.getState();

        plain(Kang);


    }
}
// 몬스터 데미지 조정
// 유효 하지 않은 스킬 번호 선택시 오류 발생
// 스킬이 존재 하지 않는 경우(null)
// 스킬 중복 확인(구현중)
