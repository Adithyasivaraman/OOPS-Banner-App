import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp UC8 – Render OOPS as Banner using Map and Function
 *
 * This use case stores character banner patterns in a Map and
 * uses a reusable function to render any banner text.
 * This is the final, most modular version of the application.
 *
 * @author Adithya
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Build character pattern map
        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        // Render the banner for the word "OOPS"
        renderBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns a map of character patterns.
     */
    private static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
        });

        map.put('P', new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        });

        map.put('S', new String[]{
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
        });

        return map;
    }

    /**
     * Renders the banner for the given text using the provided pattern map.
     */
    private static void renderBanner(String text, Map<Character, String[]> patternMap) {

        int height = patternMap.get(text.charAt(0)).length;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                line.append(patternMap.get(ch)[i]).append(" ");
            }

            System.out.println(line.toString());
        }
    }
}
