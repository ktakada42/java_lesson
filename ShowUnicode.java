import java.io.*;

public class ShowUnicode {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("文字列を入力してください。");
            String line = reader.readLine();
            for (int i = 0; i < line.length(); i++) {
                char chr = line.charAt(i);
                System.out.println("'" + chr + "'の文字コードは" + (int)chr + "です。");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
