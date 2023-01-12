import java.io.*;

public class MakeHtml {
	public static void main(String[] args) {
		System.out.println("<!DOCTYPE html>\n<html>\n<head>\n<title>My Page</title>\n</head>\n<body>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			while ((line = reader.readLine()) != null) {
				if (line.indexOf("■") == 0) {
					System.out.println("<h1>" + line.substring(1) + "</h1>");
				} else if (line.indexOf("●") == 0) {
					System.out.println("<h2>" + line.substring(1) + "</h2>");
				} else {
					System.out.println("<p>" + line + "</p>");
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("</body>\n</html>");
	}
}	
