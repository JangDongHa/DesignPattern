package decorator.player;
/***
 스킬명 : RushSkill
 스킬종류 : 액티브, Warrior 전용 스킬
 데미지 : 20
 ***/
public class RushSkill extends PlayerSkill implements ActiveSkill{
    public RushSkill(Warrior warrior) { // 전사 스킬
        super(warrior);
        setPlayerSkill(this);
    }

    public String showSkills(){
        return super.showSkills() + " " + "Rush";
    }

    @Override
    public double getDamage() {
        return 20;
    }

    @Override
    public String skillEffect() {
        return "Rush!";
    }
}
