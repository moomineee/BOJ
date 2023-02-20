/**
 * 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
 * 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
 * 예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 *
 * 입력 - 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 * 출력 - 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
 *
 * 예제 입력 1 - 2000    예제 입력 2 - 1999
 * 예제 출력 1 -  1      예제 입력 2 - 0
 */

package Stage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int y = Integer.parseInt(br.readLine());

        if (y % 4 == 0) {
            if (y % 400 == 0) System.out.println("1");
            else if(y % 100 == 0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");

        // 삼항연산자 사용
        // int y = Integer.parseInt(br.readLine());
        // System.out.print((y%4==0)?((y%400==0)?"1":(y%100==0)?"0":"1"):"0");
    }
}
