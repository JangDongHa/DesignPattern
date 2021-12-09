package decorator.player;

/***
 직업명 : 마법사
 추가효과 : MP 2배 증가
 ***/
public class Wizard extends Player{
    public Wizard(String nickname, String id) {
        super(nickname, id);
        super.setJob("Wizard");
        super.setMp(getMp() * 2);
    }

    public String toString(){
        return super.toString() + super.getJob();
    }

    public String showSkills(){
        if (super.getPlayerSkill() == null) // 스킬이 없다면 표시하지 않음
            return super.showSkills();
        return super.showSkills() + super.getPlayerSkill();
    }

}
