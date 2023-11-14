import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static String askWord() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter word");

        return myScanner.nextLine();
    }

    public static void main(String[] args) {


        final int quantityOfWords = 5;

        ArrayList<String> listA = new ArrayList<>();
        for (int i = 0; i < quantityOfWords; i++) {
            listA.add(askWord());
        }
        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();
        for (int i = 0; i < quantityOfWords; i++) {
            listB.add(askWord());
        }
        System.out.println(listB);

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < quantityOfWords; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(quantityOfWords-1-i));
        }

        System.out.println(listC);
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        listC.sort(lengthComparator);

        System.out.println(listC);
    }
}