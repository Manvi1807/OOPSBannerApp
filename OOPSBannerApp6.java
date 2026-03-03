public class OOPSBannerApp {

    public static void main(String[] args) {

        // Build banner using helper methods
        String[] banner = buildBanner();

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Builds full OOPS banner
    public static String[] buildBanner() {

        String[] banner = new String[5];

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        for (int i = 0; i < 5; i++) {
            banner[i] = String.join("  ",
                    o[i],
                    o[i],
                    p[i],
                    s[i]);
        }

        return banner;
    }

    // Pattern for O
    public static String[] getOPattern() {

        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Pattern for P
    public static String[] getPPattern() {

        return new String[] {
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };
    }

    // Pattern for S
    public static String[] getSPattern() {

        return new String[] {
                " *****",
                "*     ",
                " *****",
                "     *",
                "***** "
        };
    }

}