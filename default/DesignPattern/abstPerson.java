package DesignPattern;

public abstract class abstPerson {
    void readyToBattle() {
        startBodyTraining();
        prepareWeapon();
        prepareArmor();
        if(isUsingPrepareOther()) {
            prepareother();
        }
        System.out.println();
    }
    final void startBodyTraining() {
        System.out.println("체력을 단련합니다.");
    }
    abstract void prepareWeapon();

    abstract void prepareArmor();

    boolean isUsingPrepareOther() {
        return false;
    }
    void prepareother(){};
}


