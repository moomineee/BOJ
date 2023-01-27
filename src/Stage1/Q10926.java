/*
예제 입력 1 joonas
예제 출력 1 joonas??!
예제 입력 2 baekjoon
예제 출력 2 baekjoon??!
*/
package Stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10926 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lastString = "??!";

        String str = br.readLine();
        System.out.println(str + lastString);
    }

    /**
     * Scanner scanner = new Scanner(System.in);
     *
     * 		String lastString = "??!";
     * 		String str = scanner.next();
     * 		System.out.println(str + lastString);
     */
}