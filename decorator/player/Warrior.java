package decorator.player;

/***
 직업명 : 전사
 추가효과 : HP 2배 증가
 ***/
public class Warrior extends Player{
    public Warrior(String nickname, String id) {
        super(nickname, id);
        super.setJob("Warrior");
        super.setHp(getHp() * 2); // 전사는 HP 2배 증가
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
