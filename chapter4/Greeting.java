package chapter4;

import java.io.*;
import java.nio.Buffer;

public class Greeting {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("時刻を入力してください。");
            String line = reader.readLine();
            int time = Integer.parseInt(line);
            if (0 <= time && time <= 11) {
                System.out.println("おはようございます。");
            } else if (time == 12) {
                System.out.println("お昼です。");
            } else if (13 <= time && time <= 18) {
                System.out.println("こんにちは。");
            } else if (19 <= time && time <= 23) {
                System.out.println("こんばんは。");
            } else {
                System.out.println("時刻の範囲を超えています。");
            }
        } catch (IOException e) {
           System.out.println(e);
        } catch (NumberFormatException e) {

            System.out.println("数字の形式が正しくありません。");
        }
    }
}
