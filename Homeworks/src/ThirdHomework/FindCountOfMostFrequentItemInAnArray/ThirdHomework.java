package ThirdHomework.FindCountOfMostFrequentItemInAnArray;

import java.util.HashSet;
import java.util.Set;

public class ThirdHomework {

    public static Set<Integer> separateNumbers(int[] numbersList){
        Set<Integer> listOfNumbers = new HashSet<>();
        for (int number : numbersList){
            listOfNumbers.add(number);
        }
        return listOfNumbers;
    }

    public static int[][] numbersInformation(int[] numbersList){
        Set<Integer> separateNumbers = separateNumbers(numbersList);
        int numbersInformation[][];
        numbersInformation = new int[separateNumbers.size()][2];
        int count = 0;
        int box = 0;
        int item = 0;
        for (int number : separateNumbers){
            for (int repeatedNumber : numbersList){
                if (number == repeatedNumber){
                    count += 1;
                }
            }
            numbersInformation[box][item] = number;
            numbersInformation[box][item+1] = count;
            box += 1;
            count = 0;
        }
        return numbersInformation;
    }

    public static int[][] findTheMostRepeatedNumber(int[] numberList){
        int numbersInformation [][] = numbersInformation(numberList);
        int theMostRepeatedNumber[][] = new int[1][2];
        int number = 0;
        int repeatedNumber = 0;
        if (numberList.length == 0){
            theMostRepeatedNumber = new int[][]{{}};
            return theMostRepeatedNumber;
        }
        for (int x=0; x < numbersInformation.length; x++) {
            for (int y=1; y < numbersInformation[x].length; y++) {
                if (numbersInformation[x][y] > repeatedNumber){
                    repeatedNumber = numbersInformation[x][y];
                    number = numbersInformation[x][y-1];
                }
            }
        }
        theMostRepeatedNumber[0][0] = number;
        theMostRepeatedNumber[0][1] = repeatedNumber;
        return theMostRepeatedNumber;
    }

}
