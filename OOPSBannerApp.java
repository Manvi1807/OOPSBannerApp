public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        CharacterPattern[] patterns = { o, o, p, s };

        for (int i = 0; i < 5; i++) {
            for (CharacterPattern cp : patterns) {
                System.out.print(cp.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}