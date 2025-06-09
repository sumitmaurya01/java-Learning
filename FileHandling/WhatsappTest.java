package FileHandling;

import java.io.IOException;
import java.net.URLEncoder;

public class WhatsappTest {
    public static void main(String[] args) throws IOException {
        String number = "9565547374"; // With country code
        String message = "Hello from Java!";
        String url = "https://wa.me/" + number + "?text=" + URLEncoder.encode(message, "UTF-8");

// Open in browser
        Runtime.getRuntime().exec("open " + url); // For Mac

    }
}
