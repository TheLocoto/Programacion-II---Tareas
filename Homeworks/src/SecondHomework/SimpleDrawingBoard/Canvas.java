package SecondHomework.SimpleDrawingBoard;

import java.util.ArrayList;

class Canvas {

    private int width, height;
    private ArrayList<String> image;
    public String FILLING = "x";
    public String SPACE = " ";
    public String LINE_BREAK = "\n";
    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        image = new ArrayList<>();
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        int countX = 0;
        int countY = 0;
        while (countY<height){
            if (countY>=y1 && countY<=y2){
                while (countX<width){
                    if (countX>=x1 && countX<=x2){
                        image.add(FILLING);
                    }
                    if (countX<x1 || countX>x2){
                        image.add(SPACE);
                    }
                    countX = countX +1;
                }
            }
            image.add(LINE_BREAK);
            countY = countY + 1;
            countX = 0;
        }

        return this;
    }

    public Canvas fill(int x, int y, char ch) {
        return this;
    }

    public String drawCanvas() {
        String result = "";
        result += generateHorizontalBar();
        result += "\n";
        result += "|";
        for (int i = 0; i<image.size();i++){
            result += image.get(i);
            if (i == width+1){
                result += "|";
            }
            if (i == width){
                result += "|";
            }
        }
        return result;
    }

    public String generateHorizontalBar(){
        int count = 0;
        String horizontalBar = "";
        while (count<width+2){
            horizontalBar += "-";
            count = count+1;
        }
        return horizontalBar;
    }

    public static void main (String[ ] args){
        Canvas c = new Canvas(7, 7);
        c.draw(1, 1, 5, 4);
        System.out.println(c.drawCanvas());
    }
}
