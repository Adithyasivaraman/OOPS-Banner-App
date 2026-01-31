/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by storing the banner lines in a String array
 * and printing them using a for-each loop. This enhances readability and avoids
 * repetitive print statements.
 *
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {

    // Main method – entry point of the application
    public static void main(String[] args) {

        // Define String array to hold the OOPS banner lines
        // Each element represents one row of the banner
        String[] lines = {
                "   ***     ***   *****   ***** ",
                " **   ** **   ** **  ** **     ",
                " **   ** **   ** **  ** **     ",
                " **   ** **   ** *****   ****  ",
                " **   ** **   ** **         ** ",
                " **   ** **   ** **         ** ",
                "   ***     ***   **     *****  "
        };

        // Print each line of the banner using a for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
