package org.example.classes;

public class KeywordAnalyzer {


    private static final String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
            "synchronized", "boolean", "do", "if", "private", "this", "break",
            "double", "implements", "protected", "throw", "byte", "else", "import", "public",
            "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
            "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
            "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};

    public static boolean containsReservedKeyword(String string) {

        if (string == null) {
            return false;
        }

        for (String keyword : keywords) {
            // this would not make "breakdance" work as it would contain "break", but it´s okay
            // if (string.toLowerCase().contains(keyword))

            // Build a regex that matches the keyword as a whole word
            // the pattern .*\bkeyword\b.* allows matching the keyword anywhere in the input string as a whole word
            String regex = "\\b" + keyword + "\\b";
            if (string.toLowerCase().matches(".*" + regex + ".*")) {
                return true;
            }

        }
        return false;

    }
}