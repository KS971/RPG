package DesignPattern;

public class Archer extends abstPerson {
    @Override
    void prepareWeapon() {
        System.out.println("활을 손질합니다.");
    }
    @Override
    void prepareArmor() {
        System.out.println("갑옷을 입습니다.");
    }
    @Override
    boolean isUsingPrepareOther() {
        return true;
    }
    @Override
    void prepareother() {
        System.out.println("화살을 준비합니다.");
    }
}
