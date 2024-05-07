package br.inatel.almeidafelpo.pokeplace.colored;

import java.util.logging.Logger;

public class Colored {

    // Text colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Text background colors
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // Print the colored text w/o background
    public void colorPrint(String textColor, String text) {
        System.out.println(textColor + text + ANSI_RESET);
    }

    // Print the colored text with colored background
    public void colorPrint(String textColor, String bgColor, String text) {
        String finalTextColor = resolveColor(textColor);
        String finalBgColor = resolveBgColor(bgColor);

        System.out.println(finalTextColor + finalBgColor + text + ANSI_RESET);
    }

    // Verifies the text colors
    private String resolveColor(String color) {
        switch (color.toUpperCase()) {
            case "BLACK":
                return ANSI_BLACK;
            case "RED":
                return ANSI_RED;
            case "GREEN":
                return ANSI_GREEN;
            case "YELLOW":
                return ANSI_YELLOW;
            case "BLUE":
                return ANSI_BLUE;
            case "PURPLE":
                return ANSI_PURPLE;
            case "CYAN":
                return ANSI_CYAN;
            case "WHITE":
                return ANSI_WHITE;
            default:
                return ANSI_RESET;
        }
    }

    // Verifies the background colors
    private String resolveBgColor(String bgColor) {
        switch (bgColor.toUpperCase()) {
            case "BLACK":
                return ANSI_BLACK_BACKGROUND;
            case "RED":
                return ANSI_RED_BACKGROUND;
            case "GREEN":
                return ANSI_GREEN_BACKGROUND;
            case "YELLOW":
                return ANSI_YELLOW_BACKGROUND;
            case "BLUE":
                return ANSI_BLUE_BACKGROUND;
            case "PURPLE":
                return ANSI_PURPLE_BACKGROUND;
            case "CYAN":
                return ANSI_CYAN_BACKGROUND;
            case "WHITE":
                return ANSI_WHITE_BACKGROUND;
            default:
                return "";
        }
    }
}
