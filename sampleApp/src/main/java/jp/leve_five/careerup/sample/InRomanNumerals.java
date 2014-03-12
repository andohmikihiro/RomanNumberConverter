package jp.leve_five.careerup.sample;

public class InRomanNumerals {

    public int inputOutput(String roman) {
        int Arabic = 0;

        Arabic = changeArabicToRoman(Arabic, roman);
        if (Arabic < 1 || Arabic > 3999) {
            Arabic = 0;
            System.out.println("正しいローマ数字の記法ではありません");
        }
        return Arabic;
    }

    private int changeArabicToRoman(int arabic, String roman) {
        char[] arrayRomanLowerCase = roman.toLowerCase().toCharArray();
        char previousElement = ' ';

        for (int i = arrayRomanLowerCase.length - 1; i >= 0; i--) {
            arabic = checkCharAndCalc(arabic, arrayRomanLowerCase[i], previousElement);
            previousElement = arrayRomanLowerCase[i];
        }
        return arabic;
    }

    private int checkCharAndCalc(int arabic, char element, char previousElement) {
        switch (element) {
        case 'i':
            arabic = iCalc(arabic, previousElement);
            break;
        case 'v':
            arabic = vCalc(arabic);
            break;
        case 'x':
            arabic = xCalc(arabic, previousElement);
            break;
        case 'l':
            arabic = lCalc(arabic);
            break;
        case 'c':
            arabic = cCclc(arabic, previousElement);
            break;
        case 'd':
            arabic = dCalc(arabic);
            break;
        case 'm':
            arabic = mCalc(arabic);
            break;
        default:
            arabic = -4000;
        }
        return arabic;
    }

    private int iCalc(int arabic, char previousElement) {
        if (arabic <= 2) {
            arabic += 1;
        } else if ((arabic == 5 && 'v' == previousElement) || (arabic == 10 && 'x' == previousElement)) {
            arabic -= 1;
        } else {
            arabic = -4000;
        }
        return arabic;
    }

    private int vCalc(int arabic) {
        if (arabic <= 3) {
            arabic += 5;
        } else {
            arabic = -4000;
        }
        return arabic;
    }

    private int xCalc(int arabic, char previousElement) {
        if (arabic <= 29) {
            arabic += 10;
        } else if ((arabic <= 59 && 'l' == previousElement) || (arabic <= 109  && 'c' == previousElement)) {
            arabic -= 10;
        } else {
            arabic = -4000;
        }
        return arabic;
    }

    private int lCalc(int arabic) {
        if (arabic <= 39) {
            arabic += 50;
        } else {
            arabic = -4000;
        }
        return arabic;
    }

    private int cCclc(int arabic, char previousElement) {
        if (arabic <= 299) {
            arabic += 100;
        } else if ((arabic <= 699 &&'d' == previousElement) || (arabic <= 1099 && 'm' == previousElement)) {
            arabic -= 100;
        } else {
            arabic = -4000;
        }
        return arabic;
    }

    private int dCalc(int arabic) {
        if (arabic <= 399) {
            arabic += 500;
        } else {
            arabic = -4000;
        }
        return arabic;
    }

    private int mCalc(int arabic) {
        if (arabic <= 2999) {
            arabic += 1000;
        } else {
            arabic = -4000;
        }
        return arabic;
    }
}