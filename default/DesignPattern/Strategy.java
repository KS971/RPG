package DesignPattern;

interface Weapon {
    void attack();
}
public class Strategy {
    public static void main(String[] args) {
        Character ch = new Character();
        ch.attack();

        ch.setWeapon(new Knife());
        ch.attack();

        ch.setWeapon(new Axe());
        ch.attack();
    }
}
class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("칼 공격");
    }
}
class Axe implements Weapon {
    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
class Character {
    private Weapon weapon;

    public void attack() {
        if(this.weapon == null) {
            System.out.println("맨손 공격");
        }
        else
            this.weapon.attack();
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}