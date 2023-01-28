/**
 * ICPC Bangkok Regional에 참가하기 위해 수완나품 국제공항에 막 도착한 팀 레드시프트 일행은 눈을 믿을 수 없었다. 공항의 대형 스크린에 올해가 2562년이라고 적혀 있던 것이었다.
 * 불교 국가인 태국은 불멸기원(佛滅紀元), 즉 석가모니가 열반한 해를 기준으로 연도를 세는 불기를 사용한다. 반면, 우리나라는 서기 연도를 사용하고 있다. 불기 연도가 주어질 때 이를 서기 연도로 바꿔 주는 프로그램을 작성하시오.
 * 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
 * 예제 입력 1 2541
 * 예제 출력 1 1998
 */

package Stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q18108 {

    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//
//        int year = scanner.nextInt();
//
//        System.out.println(year - 543);

        // bufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();	// 한 줄을 읽고 문자열로 반환함
        int year = Integer.parseInt(str);	// 반환 된 문자열을 정수로 바꿔줌

        System.out.println(year - 543);
    }
}