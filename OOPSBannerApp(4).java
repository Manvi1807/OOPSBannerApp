public class OOPSBannerApp {

    public static void main(String[] args) {

        // Store banner lines in array using String.join()

        String[] banner = {

            String.join("",
                    "  *****   ",
                    "*****   ",
                    "*****   ",
                    "***** "),

            String.join("",
                    " *     * ",
                    "*     * ",
                    "*     * ",
                    "*     *"),

            String.join("",
                    " *     * ",
                    "*     * ",
                    "*     * ",
                    "*     *"),

            String.join("",
                    " *     * ",
                    "*     * ",
                    "*     * ",
                    "*     *"),

            String.join("",
                    "  *****   ",
                    "*****   ",
                    "*****   ",
                    "***** ")

        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }

    }

}