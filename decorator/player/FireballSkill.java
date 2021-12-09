package decorator.player;

/***
 스킬명 : Fireball
 스킬종류 : 액티브, Wizard 전용 스킬
 데미지 : 40
 ***/
public class FireballSkill extends PlayerSkill implements ActiveSkill{
    private double damage = 40;
    public FireballSkill(Wizard wizard) {
        super(wizard);
        setPlayerSkill(this);
    }

    public String showSkills(){
        return super.showSkills() + " " + "Fireball";
    }

    public double getDamage(){
        return 40;
    }

    public String skillEffect(){
        return "Fireball!";
    }
}
