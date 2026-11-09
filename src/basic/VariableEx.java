package basic;
import java.util.Scanner;

public class VariableEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 사용자에게 입력 받는 기능 구현 위해
        //1.기본 자료형
        System.out.print("골 수 :");
        int goals = sc.nextInt();
        System.out.print("경기 수 :");
        int games = sc.nextInt();
        System.out.print("슈팅 수 :");
        int shots = sc.nextInt();
        long fans = 3_000_000_000L;
        double rating = 7.8;
        boolean isHome = true;
        char position = 'F';


        //2.문자열
        String player = "Kim";

        //3. 타입 자동 추론
        var team = "Suwon Fc";

        //4. 상수
        final int MAX_PLAYERS = 11;

        //5. 형 변환
        double goalsPerGame = (double) goals / games;
        int roundedRating = (int) rating;
        double conversionRate = (double) goals / shots * 100;
        System.out.println(player + " / " + team + " / 포지션: " + position);
        System.out.println("골: " + goals + ", 경기당 : " + goalsPerGame);
        System.out.println("평점: " + rating + "-> 정수로: " + roundedRating);
        System.out.println("팬 수: " + fans + ", 홈 경기: " + isHome);
        System.out.println("최대 선수 수: " + MAX_PLAYERS);
        System.out.println(" 골 결정률 : " + conversionRate+ "%");


    }
}

// 직접 해보기

