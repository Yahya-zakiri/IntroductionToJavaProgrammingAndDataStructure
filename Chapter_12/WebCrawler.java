import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String startingUrl = input.nextLine();
        crawl(startingUrl);
    }

    public static void crawl(String startingUrl) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingUrl);

        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() < 100) {
            String urlString = listOfPendingURLs.remove(0);

            if (!listOfTraversedURLs.contains(urlString)) {
                listOfTraversedURLs.add(urlString);
                System.out.println("Crawl: " + urlString);

                for (String s : getSubURLs(urlString)) {
                    if (!listOfTraversedURLs.contains(s) && !listOfPendingURLs.contains(s)) {
                        listOfPendingURLs.add(s);
                    }
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();
        try {
            URL url = new URL(urlString);
            InputStream inputStream = url.openStream();
            Scanner input = new Scanner(inputStream);
            StringBuilder sb = new StringBuilder();

            while (input.hasNextLine()) {
                sb.append(input.nextLine()).append("\n");
            }
            input.close();

            Pattern pattern = Pattern.pattern("http://[\\w\\d\\.#@:/\\-=\\?%&_]+");
            Matcher matcher = pattern.matcher(sb.toString());

            while (matcher.find()) {
                list.add(matcher.group());
            }
        } catch (Exception e) {
        }
        return list;
    }
}
