package me.phuongtm.number2letter;

import java.math.BigInteger;
import java.text.DecimalFormat;

public class NumberToLetter {

    private static final DecimalFormat df = new DecimalFormat();
    private static final String ONE = " một";
    private static final String TWO = " hai";
    private static final String THREE = " ba";
    private static final String FOUR = " bốn";
    private static final String FIVE = " năm";
    private static final String SIX = " sáu";
    private static final String SEVEN = " bảy";
    private static final String EIGHT = " tám";
    private static final String NINE = " chín";
    private static final String THOUSAND = " nghìn";
    private static final String BILLION = " tỷ";
    private static final String MILLION = " triệu";
    private static final String HUNDRED = " trăm";
    private static final String N_TY = " mươi";
    private static final String EMPTY_STRING = "";
    private static final String SPECIAL_ONE = " mốt";
    private static final String SPECIAL_FOUR = " tư";
    private static final String SPECIAL_FIVE = " lăm";

    public static String from(String input) {
        BigInteger bigInteger = new BigInteger(input);
        String[] splitter = df.format(bigInteger).split(",");
        StringBuilder sb = new StringBuilder();
        int len = splitter.length;
        for (int i = 0; i < len; i++) {
            String word = threeNumbersToWord(splitter[i]);
            sb.append(word);
            // in case 100, 1000... ignore if the right before word is empty,
            // it means the last word is "triệu", "tỷ"...
            if (!EMPTY_STRING.equals(word)) {
                sb.append(getSeparateWord((byte) (len - i)));
            }
        }
        return sb.toString().trim();
    }


    private static String threeNumbersToWord(String number) {
        int len = number.length();
        // One digit group
        if (len == 1) {
            return numberToWord(number.charAt(0));
        }
        // Two digit group
        if (len == 2) {
            char firstChar = number.charAt(0);
            char secondChar = number.charAt(1);
            String secondString = getSpecialLastNumber(secondChar, firstChar);
            if (firstChar == '1') {
                return "mười" + secondString;
            }
            return numberToWord(firstChar) + posToPrefix(1) + secondString;
        }
        // Three digit group
        if (len == 3) {
            char firstChar = number.charAt(0);
            char secondChar = number.charAt(1);
            char thirdChar = number.charAt(2);
            String firstString = numberToWord(firstChar);
            String secondString = numberToWord(secondChar);
            String thirdString = getSpecialLastNumber(thirdChar, secondChar);
            if (firstChar == '0') {
                firstString = " không";
            }
            if (secondChar == '0' && thirdChar != '0') {
                return firstString + " trăm linh" + thirdString;
            }
            if (secondChar == '1') {
                return firstString + " trăm mười" + thirdString;
            }
            if (firstChar == '0' && secondChar == '0' && thirdChar == '0') {
                return "";
            }
            if (secondChar == '0' && thirdChar == '0') {
                return firstString + posToPrefix(0);
            }
            return firstString + posToPrefix(0) + secondString + posToPrefix(1) + thirdString;
        }
        return "";
    }

    private static String getSpecialLastNumber(char number, char leftNumber) {
        if (number == '1' && Character.getNumericValue(leftNumber) > 1) {
            return SPECIAL_ONE;
        }
        if (number == '4' && Character.getNumericValue(leftNumber) > 1) {
            return SPECIAL_FOUR;
        }
        if (number == '5' && Character.getNumericValue(leftNumber) > 0) {
            return SPECIAL_FIVE;
        }
        return numberToWord(number);
    }

    private static String numberToWord(char number) {
        if (number == '1') {
            return ONE;
        }
        if (number == '2') {
            return TWO;
        }
        if (number == '3') {
            return THREE;
        }
        if (number == '4') {
            return FOUR;
        }
        if (number == '5') {
            return FIVE;
        }
        if (number == '6') {
            return SIX;
        }
        if (number == '7') {
            return SEVEN;
        }
        if (number == '8') {
            return EIGHT;
        }
        if (number == '9') {
            return NINE;
        }
        return "";
    }

    private static String posToPrefix(int pos) {
        if (pos == 0) {
            return HUNDRED;
        }
        if (pos == 1) {
            return N_TY;
        }
        return EMPTY_STRING;
    }

    private static String getSeparateWord(int remainingLen) {
        if (remainingLen == 5) {
            return THOUSAND;
        }
        if (remainingLen == 4) {
            return BILLION;
        }
        if (remainingLen == 3) {
            return MILLION;
        }
        if (remainingLen == 2) {
            return THOUSAND;
        }
        return "";
    }

}
