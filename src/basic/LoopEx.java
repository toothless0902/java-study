package basic;

import java.util.Scanner;

public class LoopEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int games;

        while (true) {
            System.out.print("경기 수: ");
            games = sc.nextInt();

            if (games >= 1) {
                break;
            }
            System.out.println("1 경기 이상 입력해주세요");
        }

        System.out.println(games + "경기 입력 완료");

        int totalGoals = 0;

        int maxGoals = -1;
        int maxGame = 0;


        for (int i = 1; i <= games; i++) {

            int g;

            while (true) {
                System.out.print(i + "경기 골 수 :");
                g = sc.nextInt();
                if(g>=0) {
                    break;
                }
                System.out.println("0 이상 입력해주세요.");
            }
            totalGoals += g;



            if (g >= maxGoals) {
                maxGame = i;
                maxGoals = g;

            }
        }

        System.out.println("총 골: "+totalGoals);

        //[기능 1] 평균
        double avg = (double) totalGoals / games;
        System.out.printf("평균 골: %.2f%n", avg);

        //[기능2] 최다 득점 출력
        System.out.println("최다 득점:" + maxGame + "경기째, " + maxGoals + "골");

        sc.close();
    }




}


