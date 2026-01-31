/**
 * OOPSBannerApp UC6 – Render OOPS as Banner using Functions
 *
 * This use case refactors the banner creation logic into
 * reusable static methods for each character pattern.
 * It follows the DRY principle and improves modularity.
 *
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Retrieve character patterns using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print the OOPS banner line by line
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + " " +
                            oPattern[i] + " " +
                            pPattern[i] + " " +
                            sPattern[i]
            );
        }
    }

    // Helper method to build pattern for character 'O'
    private static String[] getOPattern() {
        return new String[]{
                "  ***  ",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "**   **",
                "  ***  "
        };
    }

    // Helper method to build pattern for character 'P'
    private static String[] getPPattern() {
        return new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        };
    }

    // Helper method to build pattern for character 'S'
    private static String[] getSPattern() {
        return new String[]{
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
        };
    }
}
