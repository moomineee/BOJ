package Stage1;

/*
 * "abc"de"를 출력하려면? -> 제어문자(이스케이프 시퀀스)
 */

public class Q25083 {

    public static void main(String[] args) {

        String str = "         ,r'\"7\n" +    // \", \n 이 제어문자
            "r`-_   ,'  ,/\n" +        // \n 이 제어문자
            " \\. \". L_r'\n" +        // \\, \", \n 이 제어문자
            "   `~\\/\n" +            // \\, \n 이 제어문자
            "      |\n" +            // \n 이 제어문자
            "      |";

        System.out.print(str);
    }
}
