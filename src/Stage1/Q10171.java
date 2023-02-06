package Stage1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q10171 {

    public static void main(String[] args) throws IOException {

        /*
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");


        //BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine();	// 줄 구분자

        bw.write(" )  ( ')");
        bw.newLine();

        bw.write("(  /  )");
        bw.newLine();

        bw.write(" \\(__)|");

        bw.flush(); // stream 데이터 비우기
        bw.close(); // stream 종료


        //stringbuilder
        StringBuilder sb = new StringBuilder();
        sb.append("\\    /\\\n");
        sb.append(" )  ( ')\n");
        sb.append("(  /  )\n");
        sb.append(" \\(__)|\n");

        System.out.println(sb);


         */
        //stringbuffer
        StringBuffer sb = new StringBuffer();
        sb.append("\\    /\\\n");
        sb.append(" )  ( ')\n");
        sb.append("(  /  )\n");
        sb.append(" \\(__)|\n");

        System.out.println(sb);
    }
}
