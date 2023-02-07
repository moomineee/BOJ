/*
예제 출력 1
    |\_/|
    |q p|   /}
    ( 0 )"""\
|"^"`    |
||_/=\\__|
*/

package Stage1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q10172 {

    public static void main(String[] args) throws IOException {

        /*
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");

        //buffredWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|");
        bw.newLine();	// 줄 구분자

        bw.write("|q p|   /}");
        bw.newLine();

        bw.write("( 0 )\"\"\"\\");
        bw.newLine();

        bw.write("|\"^\"`    |");
        bw.newLine();

        bw.write("||_/=\\\\__|");

        bw.flush();
        bw.close();
         */

        //string builder
        StringBuilder sb = new StringBuilder();

        sb.append("|\\_/|\n");
        sb.append("|q p|   /}\n");
        sb.append("( 0 )\"\"\"\\\n");
        sb.append("|\"^\"`    |\n");
        sb.append("||_/=\\\\__|\n");

        System.out.println(sb);


    }
}
