import Job.Warrior;
import Weapon.WoodenSword;
import Armor.HumbleRobe;
import static Dungeon.Plain.plain;

public class Main {
    public static void main(String[] args) throws Exception {
        Warrior Kang = new Warrior("강산");

        Kang.getState();

        WoodenSword woodenSword = new WoodenSword();
        HumbleRobe humbleRobe = new HumbleRobe();

        Kang.setWeapon(woodenSword.getWeaponName(), woodenSword.getWeaponOFF());
        Kang.setArmor(humbleRobe.getArmorName(), humbleRobe.getArmorDEF());

        plain(Kang);




    }
}
// 몬스터 데미지 조정