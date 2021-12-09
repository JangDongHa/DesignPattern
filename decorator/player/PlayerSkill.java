package decorator.player;

public abstract class PlayerSkill extends Player{
    public PlayerSkill(Player player) {
        super(player.getNickname(), player.getId());
    }

    public String toString(){return "";}

    public String showSkills(){
        return ""; // 기본적인 스킬은 아무것도 없음
    }

}
