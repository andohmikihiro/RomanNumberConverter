package jp.leve_five.careerup.sample;

public class InArabicNumber {
    private StringBuilder romanStringBuilder = new StringBuilder("");

    public String inputOutput(int arabic) {
        String roman;
        if (arabic < 1 || arabic > 3999) {
            roman = "";
            return roman;
        }

        roman = changeRomanToArabic(arabic);

        return roman;
    }

    private String changeRomanToArabic(int arabic) {
        addArabicToRomanStringBuilder(makeArrayOfInt(arabic));
        String roman = romanStringBuilder.toString();

        return roman;
    }

    private int[] makeArrayOfInt(int arabic) {
        int element = 0;
        int maxPosition = 1;

        for (int x = 10; arabic >= x; x *= 10) {
            maxPosition++;
        }

        int[] arrayArabic = new int[maxPosition];

        for (maxPosition = 0; arrayArabic.length > maxPosition; maxPosition++) {
            element = arabic % 10;
            arabic -= element;
            arabic /= 10;
            arrayArabic[maxPosition] = element;
        }
        return arrayArabic;
    }

    private void addArabicToRomanStringBuilder(int[] arrayArabic) {
        for (int index = arrayArabic.length - 1; 0 <= index; index--) {
            stringBuilderAppendString(arrayArabic[index], index);
        }
    }

    private void stringBuilderAppendString(int element, int index) {
        switch (index) {
        case 0:
            if (element != 0) {
                romanStringBuilder.append(oneDigit(element));
            }
            break;
        case 1:
            if (element != 0) {
                romanStringBuilder.append(doubleDigit(element));
            }
            break;
        case 2:
            if (element != 0) {
                romanStringBuilder.append(threeDigit(element));
            }
            break;
        case 3:
            romanStringBuilder.append(fourDigit(element));
            break;
        }

    }

    private String fourDigit(int element) {
        switch (element) {
        case 1:
            return "M";
        case 2:
            return "MM";
        case 3:
            return "MMM";
        default:
            return "";
        }

    }

    private String threeDigit(int element) {
        switch (element) {
        case 1:
            return "C";
        case 2:
            return "CC";
        case 3:
            return "CCC";
        case 4:
            return "CD";
        case 5:
            return "D";
        case 6:
            return "DC";
        case 7:
            return "DCC";
        case 8:
            return "DCCC";
        case 9:
            return "CM";
        default:
            return "";
        }
    }

    private String doubleDigit(int element) {
        switch (element) {
        case 1:
            return "X";
        case 2:
            return "XX";
        case 3:
            return "XXX";
        case 4:
            return "XL";
        case 5:
            return "L";
        case 6:
            return "LX";
        case 7:
            return "LXX";
        case 8:
            return "LXXX";
        case 9:
            return "XC";
        default:
            return "";
        }
    }

    private String oneDigit(int element) {
        switch (element) {
        case 1:
            return "I";
        case 2:
            return "II";
        case 3:
            return "III";
        case 4:
            return "IV";
        case 5:
            return "V";
        case 6:
            return "VI";
        case 7:
            return "VII";
        case 8:
            return "VIII";
        case 9:
            return "IX";
        default:
            return "";
        }
    }

}