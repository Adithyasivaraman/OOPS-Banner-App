/**
 * OOPSBannerApp UC7 – Render OOPS as Banner using Character Pattern Class
 *
 * This use case introduces a CharacterPattern inner static class
 * to encapsulate a character and its corresponding banner pattern.
 * This improves code organization, reusability, and follows OOPS principles.
 *
 * @author Adithya
 * @version 7.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create CharacterPattern objects
        CharacterPattern o = new CharacterPattern('O', new String[]{
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
        });

        // Print OOPS banner using CharacterPattern objects
        for (int i = 0; i < o.getPattern().length; i++) {
            System.out.println(
                    o.getPattern()[i] + " " +
                            o.getPattern()[i] + " " +
                            p.getPattern()[i] + " " +
                            s.getPattern()[i]
            );
        }
    }

    /**
     * Inner static class to represent a character and its banner pattern.
     */
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
