package my.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Covid extends Exception {
    private static RegexMatches regexMatches;

    public static void main(String[] args) {
        final String url = "https://www.worldometers.info/coronavirus/";
        regexMatches = new RegexMatches();
        try {
            final Document document = Jsoup.connect(url).get();

            String title = document.title();
            System.out.println("Title : \n" + title);

            for (Element row : document.select("table#main_table_countries_today tr")) {

                if (row.select("td:nth-of-type(2)").text().equals("")) {
                    continue;
                } else {
                    String country = row.select("td:nth-of-type(2)").text();
                    System.out.println("[-- COUNTRY NAME : " + country + " --]");
                    final String totalCase = row.select("td:nth-of-type(3)").text();
                    System.out.println(" Total Case : " + totalCase);
                    final String newCase = row.select("td:nth-of-type(4)").text();
                    System.out.println(" New Case : " + newCase);
                    final String totalDeath = row.select("td:nth-of-type(5)").text();
                    System.out.println(" Total Death : " + totalDeath);
                    final String newDeath = row.select("td:nth-of-type(6)").text();
                    System.out.println(" New Death : " + newDeath);
                    final String totalRecovered = row.select("td:nth-of-type(7)").text();
                    System.out.println(" Total Recovered : " + totalRecovered);
                    final String activeCase = row.select("td:nth-of-type(8)").text();
                    System.out.println(" Active Cases : " + activeCase);
                    final String seriousCase = row.select("td:nth-of-type(9)").text();
                    System.out.println(" Serious/Critical : " + seriousCase);
                    final String totCase = row.select("td:nth-of-type(10)").text();
                    System.out.println(" Tot Case/1M Pop : " + totCase);
                    final String death = row.select("td:nth-of-type(11)").text();
                    System.out.println(" Death/1M Pop : " + death);
                    final String totalTest = row.select("td:nth-of-type(12)").text();
                    System.out.println(" Total Tests : " + totalTest);
                    final String test = row.select("td:nth-of-type(13)").text();
                    System.out.println(" tests/1M Pop : " + test);
                    final String population = row.select("td:nth-of-type(14)").text();
                    System.out.println(" Population : " + population);
                }
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}