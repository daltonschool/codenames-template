import lattelib.ColorLatte;
import lattelib.WebLatte;

public class Game {
    public static void main(String[] args) {
        //declarations:
        Random gen = new Random();
        WebLatte frame = new WebLatte();

        //draw board:
        int left = 200;
        int top = 30;
        int tile = 70;
        int boardsize = 5;
        int pad = 10;
        int textsize = 20;

        for (int i = 0; i < boardsize; i++) {
            for(int j = 0; j< boardsize; j++) {
                String word = gen.getWord();  //THIS IS A RANDOM WORD!!!
                frame.drawRectangle(
                        left+j*(pad+tile),
                        top+i*(pad+tile),
                        tile,
                        tile,
                        0,
                        ColorLatte.AliceBlue);
                frame.drawText(
                        word,
                        left+j*(pad+tile)+(tile/2)-textsize*word.length()/4 , //left+other tiles+half tile-text width
                        top+i*(pad+tile)+tile/2,
                        textsize,
                        0,
                        ColorLatte.BLACK );
            }
        }
        frame.paint();

        //say hello:
        frame.println("hello world");

    }
}
