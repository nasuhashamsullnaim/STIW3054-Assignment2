package my.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
        public boolean isMatch(String pattern, String link) {

            Pattern p = Pattern.compile(pattern);   // the pattern to search for
            Matcher m = p.matcher(link);

            if (m.find())
                return true;
            else
                return false;
        }

    public static void main(String[] args) {
        String myString = "COVID19";
        String myLink = "https://www.worldometers.info/coronavirus/";
        Boolean result = new RegexMatches().isMatch(myString, myLink);
        System.out.println(result);
    }
}

