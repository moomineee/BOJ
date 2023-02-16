/**
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 예제 입력 1 - 100
 * 예제 출력 1 -  A
 */

package Stage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q9498 {

    public static void main(String[] args) throws IOException {

        /* //삼항연산자 사용
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        in.close();

        System.out.print((A>=90)?"A": (A>=80)? "B": (A>=70)? "C": (A>=60)? "D": "F");
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        if(A >= 90) System.out.println("A");
        else if(A >= 80) System.out.println("B");
        else if(A >= 70) System.out.println("C");
        else if(A >= 60) System.out.println("D");
        else System.out.println("F");

        // 삼항연산자 사용 - 이게 제일 빠르다.
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        String result = (score >= 90) ? "A" : (score >= 80) ? "B": (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        System.out.println(result);
         */
    }
}
