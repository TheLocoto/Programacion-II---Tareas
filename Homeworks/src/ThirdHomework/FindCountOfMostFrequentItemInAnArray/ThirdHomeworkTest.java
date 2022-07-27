package ThirdHomework.FindCountOfMostFrequentItemInAnArray;

import org.junit.Assert;
import org.junit.Test;

import static ThirdHomework.FindCountOfMostFrequentItemInAnArray.ThirdHomework.findTheMostRepeatedNumber;

public class ThirdHomeworkTest {

    @Test
    public void findTheMostRepeatedNumberTest(){
        int array[] = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3};
        int[][] theMostRepeatedNumber = findTheMostRepeatedNumber(array);
        int[][] result = {{-1,5}};

        Assert.assertEquals( result , theMostRepeatedNumber);
    }

    @Test
    public void sameNumberOfRepetitions(){
        int array[] = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1};
        int[][] theMostRepeatedNumber = findTheMostRepeatedNumber(array);
        int[][] result = {{0,5}};

        Assert.assertEquals( result , theMostRepeatedNumber);
    }

    @Test
    public void emptyArray(){
        int array[] = {};
        int[][] theMostRepeatedNumber = findTheMostRepeatedNumber(array);
        int[][] result = {{}};

        Assert.assertEquals( result , theMostRepeatedNumber);
    }

}
