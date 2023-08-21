import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NLPArray obj = new NLPArray();

        String saveData = "";
        try {

            File myObj = new File("sample.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                saveData += data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println();

        // spaces in String
        String array[] = obj.save(saveData);
        System.out.println("Arraaaaay Saved ");
        for (int y = 0; y <= obj.indexOfArray; y++) {

            System.out.print(array[y] + " ");
        }

    }

}

class NLPArray {
    static int indexOfArray;

    // methid will count number of spaces.
    static int checkSpace(String readLine, int size) {
        int count = 0;

        for (int i = 0; i < size; i++) {
            if (readLine.charAt(i) == 32) {
                count++;
            }

        }

        return count;

    }

    // used to reomve Special characters from code.
    static String removeSPChar(String str) {

        String processed = "";
        // processing
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 122) {
                if (c <= 96 && c >= 91) {
                    continue;
                } else {
                    processed += c;
                }
            }
            // System.out.print(c);
        }
        // System.out.println(processed);
        return processed;
    }

    // convert String into String Array.
    static String[] save(String saveData) {

        int sizeOfArray = checkSpace(saveData, saveData.length());

        String array[] = new String[sizeOfArray + 1];
        int arrayIndexNo = 0;
        String temp = "";
        for (int k = 0; k < saveData.length(); k++) {

            if (saveData.charAt(k) == 32) {
                String proceessSave = removeSPChar(temp);
                array[arrayIndexNo] = proceessSave;
                arrayIndexNo++;
                temp = "";

            } else {

                temp += saveData.charAt(k);
            }
        }
        array[arrayIndexNo] = removeSPChar(temp);
        indexOfArray = arrayIndexNo;

        return array;
    }

}