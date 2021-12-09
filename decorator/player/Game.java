package decorator.player;

import java.io.*;

public class Game {
    public static PlayerSkill getSkill(Player loginPlayer){
        /***
         플레이어가 스킬을 배우면 플레이어가 확장된 것이므로
         new Skill(new Player)로 구상함. 또한 Skill은 특정 직업만 가질 수 있으므로 형 변환으로 구상함.
         ***/
        if (loginPlayer.getLevel() == 40){ // 40레벨 달성 시
            // 전사는 Rush 스킬 획득, 마법사는 Fireball 스킬 획득
            if (loginPlayer.getJob().equals("Warrior"))
                return new RushSkill((Warrior) loginPlayer);
            else if (loginPlayer.getJob().equals("Wizard"))
                return new FireballSkill((Wizard) loginPlayer);
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        Player warrior = new Warrior("IamTanker", "jsh3340"); // 신규 전사 계정 생성
        Player wizard = new Wizard("IamWizard", "jdh3340");

        // 이런식으로도 작성(은) 가능
        PlayerSkill war = new RushSkill(new Warrior("IamTank", "jsh3340"));

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        Player loginPlayer = warrior; // 전사 계정으로 접속

        /***
         경험치 획득 중..
         ***/
        loginPlayer.setLevel(40); // 40레벨 설정
        loginPlayer.setPlayerSkill(getSkill(loginPlayer)); // 스킬 적용
        bufferedWriter.write("NickName : " + loginPlayer.getNickname() + "\n");
        bufferedWriter.write(loginPlayer + "\n");
        bufferedWriter.write(loginPlayer.showSkills() + "\n");
        bufferedWriter.flush();

        /***
         경험치 획득 중..
         ***/
        loginPlayer = wizard; // 법사 계정으로 접속
        loginPlayer.setLevel(40); // 40레벨 설정
        //loginPlayer.setPlayerSkill(getSkill(loginPlayer)); // 스킬 적용
        bufferedWriter.write("NickName : " + loginPlayer.getNickname() + "\n");
        bufferedWriter.write(loginPlayer+ "\n");
        bufferedWriter.write(loginPlayer.showSkills() + "\n"); // 스킬이 없으면 none으로 표시
        bufferedWriter.flush();
    }
}
