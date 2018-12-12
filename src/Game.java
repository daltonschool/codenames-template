/**
 * CodeNames game
 * @author
 */

import lattelib.ColorLatte;
import lattelib.WebLatte;
import org.dalton.Assignment;

@Assignment(assignment = "codenames")
public class Game {
    public static void main(String[] args) {
        //declarations:
        Random gen = new Random();
        WebLatte frame = new WebLatte();


        //draw board:
        int left = 200;
        int top = 30;
        int tile = 120;
        int boardsize = 4;
        int pad = 20;
        int textsize = 10;

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
