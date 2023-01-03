import java.io.*;

public class HowOldAreYou2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("1人目の名前を入力してください。");
            String line = reader.readLine();
            System.out.println(line + "さん、こんにちは。");
            System.out.println("年齢を入力してください。");
            line = reader.readLine();
            double age1 = Integer.parseInt(line);
            System.out.println("2人目の名前を入力してください。");
            line = reader.readLine();
            System.out.println(line + "さん、こんにちは。");
            System.out.println("年齢を入力してください。");
            line = reader.readLine();
            double age2 = Integer.parseInt(line);
            System.out.println("2人の平均年齢は" + (age1 + age2) / 2 + "歳です。");
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("年齢が正しくありません。");
        }
    }
}
