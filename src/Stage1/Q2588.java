/**
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * https://www.acmicpc.net/problem/2588
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

package Stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q2588 {

    public static void main(String[] args) throws IOException {
        /**
         * 첫 번째 입력으로 들어오는 세 자리수 정수에 두 번째 입력으로 들어오는 정수를 분리하여 각 각 곱한 값을 출력(3~5) 한 뒤 마지막에는 원래 식의 연산 값을 출력해주어야 한다.
         *
         * 그럼 두 번째 입력값을 어떻게 분리해주어야 하냐의 문제인데 방법은 크게 3가지가 있다.
         *
         * 문자열로 입력받아 charAt() 으로 하나씩 꺼내 쓰는 방법
         * 나머지와 나눗셈 연산을 통해 각 자릿수를 구하여 쓰는 방법
         * 문자열을 character 배열로 한 자리씩 넣어주어 이용하는 방법
         * 여기서 1번과 3번의 방법은 문자열로 입력받기 때문에 가장 마지막 출력(6) 에서는 연산하기 위해서 int형으로 변환해주어야 한다.
         */

        /*
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        String B = scanner.next();

        scanner.close();

        System.out.println(A * (B.charAt(2) - '0'));
        System.out.println(A * (B.charAt(1) - '0'));
        System.out.println(A * (B.charAt(0) - '0'));
        System.out.println(A * Integer.parseInt(B));
        */

        /*
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        scanner.close();

        System.out.println(A*(B%10));
        System.out.println(A*(B%100/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
        */

        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();

		char[] b = B.toCharArray();


		System.out.println(A * (b[2]-'0'));
		System.out.println(A * (b[1]-'0'));
		System.out.println(A * (b[0]-'0'));
		System.out.println(A * Integer.parseInt(B));
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(A * (B%10));
        sb.append('\n');

        sb.append(A * ((B%100)/10));
        sb.append('\n');

        sb.append(A * (B/100));
        sb.append('\n');

        sb.append(A * B);

        System.out.print(sb);
    }
}
