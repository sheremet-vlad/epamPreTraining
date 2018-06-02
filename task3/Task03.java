package mainPackage;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        //task01
        int x1 = 1;
        int x2 = 7;
        int x3 = 7;
        int y1 = 1;
        int y2 = 1;
        int y3 = 9;
        boolean check = Triangle.isExistTriangle(x1,y1,x2,y2,x3,y3);
        System.out.println("\ntask01");
        System.out.print(check ? "exist " : "not exist ");
        if (check){
            System.out.println(Triangle.isRightTiangle(x1,y1,x2,y2,x3,y3) ?
                                "right" : "not right");
        }

        //task2
        int age = 300;
        int heeadsCount = Dragon.defineCountHeads(age);
        System.out.println("\ntask02");
        System.out.println(heeadsCount + " " +
                            Dragon.defineCountEyes(heeadsCount));

        //task3
        char letter = 'a';
        System.out.println("\ntask03");
        System.out.println(Vowel.isVowelByChar(letter));
        System.out.println(Vowel.isVowelByChar2(letter));
        System.out.println(Vowel.isVowelByCode((int)letter));
        System.out.println(Vowel.isVowelByCode2((int)letter));
        System.out.println(Vowel.isVowelByString(letter));
        System.out.println(Vowel.isVowelByString2(letter));

        //task4
        int moodCount = 3;
        System.out.println("\ntask04");
        switch (RandomValue.randomMood(moodCount)) {
            case 1: System.out.println("=)"); break;
            case 2: System.out.println("=("); break;
            case 3: System.out.println("=|"); break;
            default: System.out.println("Incorrect value"); break;
        }

        //task5
        System.out.println("\ntask05");
        int mm = 2;
        int dd = 28;
        int yyyy = 2016;
        System.out.println(GregorianCalendar.defineNextDate(dd,mm,yyyy));
    }
}
