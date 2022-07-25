package FirstHomework.MysteryColors;

import java.util.ArrayList;
import java.util.List;

public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer {
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        ArrayList<Color> distinctColorsList = new ArrayList<>();
        int count = 0;
        for (Color mysteryColor : mysteryColors){
            for (Color color : distinctColorsList){
               if (color.equals(mysteryColor)){
                   count = count + 1;
               }
            }
            if (count == 0){
                distinctColorsList.add(mysteryColor);
            }
            count = 0;
        }
        return distinctColorsList.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int count = 0;
        for (Color mysteryColor : mysteryColors){
            if (mysteryColor == color){
                count = count + 1;
            }
        }
        return count;
    }
}
