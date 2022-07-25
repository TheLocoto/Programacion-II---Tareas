package FirstHomework.MysteryColors.Test;

import FirstHomework.MysteryColors.Color;
import FirstHomework.MysteryColors.MysteryColorAnalyzerImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MysteryColorAnalyzerTest {

    @Test
    public void numberOfDistinctColorsTest(){
        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();

        ArrayList<Color> colorsList = new ArrayList<>();
        colorsList.add(Color.RED);
        colorsList.add(Color.RED);
        colorsList.add(Color.BLUE);
        colorsList.add(Color.BLUE);

        Assert.assertEquals(2, mysteryColorAnalyzer.numberOfDistinctColors(colorsList));
    }

    @Test
    public void colorOccurrenceTest(){
        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();

        ArrayList<Color> colorsList = new ArrayList<>();
        colorsList.add(Color.GREEN);
        colorsList.add(Color.GREEN);
        colorsList.add(Color.BLUE);

        Assert.assertEquals(2, mysteryColorAnalyzer.colorOccurrence(colorsList,Color.GREEN));
        Assert.assertEquals(1, mysteryColorAnalyzer.colorOccurrence(colorsList,Color.BLUE));
        Assert.assertEquals(0, mysteryColorAnalyzer.colorOccurrence(colorsList,Color.RED));
    }



}
