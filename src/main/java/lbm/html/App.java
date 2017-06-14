package lbm.html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String html = "<!doctype html><html lang=\"en\"><head><meta charset=\"utf-8\"></head>";
    	Document doc = Jsoup.parse(html);
    	Element body = doc.body();
    	Element ee = doc.createElement("title");
    	ee.append("宝马");
    	doc.head().appendChild(ee);
    	System.out.println(doc.html());
    	
    	
    }
}
