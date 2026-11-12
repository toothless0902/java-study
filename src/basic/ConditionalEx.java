package basic;

import java.util.Scanner;

public class ConditionalEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("경기 수 :"); // 경기 수 입력
        int games = sc.nextInt();


        if (games == 0) { // 입력한 경기 수가 0이하이면 경기당 골 개수 계산 불가
            System.out.println("경기 수가 0이라 경기당 골을 계산할 수 없어요.");
            sc.close();
            return;
        } else { //입력한 경기 수가 0울 넘으면 경기 당 골수를 계산 가능
            System.out.print("골 수: ");
            int goals = sc.nextInt();
            double goalsPerGame = (double) goals / games;
            System.out.printf("경기당 골:%.2f 입니다%n",goalsPerGame);

            System.out.print("슈팅 수 :"); // 슈팅 수 입력
            int shooting = sc.nextInt();

            if (shooting <= 0) {
                System.out.println("슈팅 수가 0개이면 골 결정률을 계산할 수 없어요");
                sc.close();
                return;
            } else {
                double shootingRate = (double) goals / shooting * 100;
                System.out.printf("골 결정률은 %.1f%% 입니다%n", shootingRate); // %%를 사용한 이유는 %를 사용하기 위해 한 것

                if (shootingRate >= 30) {
                    System.out.println("당신은 월드클래스 격수입니다!");
                } else if (shootingRate >=15) {
                    System.out.println("평범한 선수야 너");
                } else {
                    System.out.println("쓰레기 새끼");
                }

            }


        }


    }



}

