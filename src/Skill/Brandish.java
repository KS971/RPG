package Skill;

public class Brandish extends Skill {
    private String SKILL_NAME = "브랜디쉬";
    private int SKILL_OFF_EFFECT = 20;
    private int COSUME_MP = 60; //30

    @Override
    public void getSkillInfo() {
        System.out.printf("%s : 눈 앞의 적을 두번 연속 공격한다.\n\n", this.SKILL_NAME);
    }

    @Override
    public String getSkillName() {
        return this.SKILL_NAME;
    }

    @Override
    public int getSkillEffect() {
        return this.SKILL_OFF_EFFECT;
    }

    @Override
    public int getConsumeMP() {
        return this.COSUME_MP;
    }
}
