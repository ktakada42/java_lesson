package chapter5;

import java.io.*;

public class Drink2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか?");
            System.out.println("a オレンジジュース");
            System.out.println("b コーヒー");
            System.out.println("c どちらでもない");
            String line;
            while (true) {
                System.out.println("a, b, cのどれかを選んでください。");
                line = reader.readLine();
                if (line.length() == 0) {
                } else {
                    break ;
                }
            }
            char c = line.charAt(0);
            switch (c) {
                case 'a':
                    System.out.println("オレンジジュースです。");
                    break ;

                case 'b':
                    System.out.println("コーヒーです。");
                    break ;

                default:
                    System.out.println("どちらでもありません。");
                    break ;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
