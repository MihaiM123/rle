package com.example.rle;

public class RunLengthEncoding {

    public String encode(String str) {

        StringBuilder result = new StringBuilder();
        if (str == null || str.isEmpty()) {
            return "";
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            result.append(currentChar);
            if (count > 1) {
                result.append(count);
            } else {
                result.append("1");
            }
        }
        return result.toString();
    }
}