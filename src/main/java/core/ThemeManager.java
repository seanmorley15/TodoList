package core;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class ThemeManager {
    private static String theme = "macos";

    public static FlatLaf getTheme() {
        if (theme.equals("dark")) {
            return new FlatDarkLaf();
        }
        if (theme.equals("light")) {
            return new FlatLightLaf();
        }
        if (theme.equals("intellij")) {
            return new FlatIntelliJLaf();
        }
        if (theme.equals("macos")) {
            return new FlatMacDarkLaf();
        }
        return null;
    }
}
