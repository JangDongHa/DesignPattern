package decorator.player;


public abstract class Player {
    private String nickname;
    private String id;
    private String job;
    private double hp, mp;
    private int level;
    private PlayerSkill playerSkill;

    public Player(String nickname, String id){ // 처음 플레이어 생성 시
        this.nickname = nickname;
        this.id = id;
        hp = 100; mp = 100; level = 1; // 1레벨 기본 정보
    }

    public String toString(){
        return "Player Info : ";
    }

    public String showSkills(){
        try{
            return "Player Skill : " + playerSkill.showSkills();
        }
        catch (NullPointerException e){
            return "Player Skill : none";
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PlayerSkill getPlayerSkill() {
        return playerSkill;
    }

    public void setPlayerSkill(PlayerSkill playerSkill) {
        this.playerSkill = playerSkill;
    }
}

