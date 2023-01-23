package Stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1008 {

    // point! double을 사용하여 소수점 이하 반환하도록 할 것.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        scanner.close();
        System.out.print(a / b);

    }

    public static void br (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        System.out.println(a/b);

    /*
    굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());

            System.out.println(a/b);
    */
    }
}
