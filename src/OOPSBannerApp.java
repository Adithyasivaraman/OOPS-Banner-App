/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This use case extends UC4 by defining and populating the String array
 * inline at the time of declaration using String.join(), improving
 * readability and reducing repetitive string concatenation.
 *
 * @author Adithya
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define and initialize banner lines inline using String.join()
        String[] lines = {
                String.join(" ", "  ***  ", "  ***  ", "***** ", " *****"),
                String.join(" ", "**   **", "**   **", "**  **", "**    "),
                String.join(" ", "**   **", "**   **", "**  **", "**    "),
                String.join(" ", "**   **", "**   **", "***** ", " **** "),
                String.join(" ", "**   **", "**   **", "**    ", "    **"),
                String.join(" ", "**   **", "**   **", "**    ", "    **"),
                String.join(" ", "  ***  ", "  ***  ", "**    ", "***** ")
        };

        // Print the banner line by line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
