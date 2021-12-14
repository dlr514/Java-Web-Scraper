import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class myscrapy {

  public static void main(String[] args) throws IOException {

    // TODO Auto-generated method stub    
    //fetching web page via HTTP
    Document page = Jsoup.connect("https://www.waterless-toilet.com/top-6-best-composting-toilets-to-choose/").get();

    //selecting all hyperlinks
    Elements pageElements = page.select("a[href]");

    ArrayList<String> hyperLinks = new ArrayList<String>();

    //iterating and extracting
    for (Element e:pageElements) {
      hyperLinks.add("Text: " + e.text());
      hyperLinks.add("Link: " + e.attr("href"));
    }

    for (String s : hyperLinks) {
      System.out.println(s);
    }
  }
}