import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        printBanner("OOPS", patternMap);
    }

    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }
}