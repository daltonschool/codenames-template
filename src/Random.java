import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Random extends java.util.Random {
    private final List<String> freq = new ArrayList<>();
//    private Random gen = new Random();

    public Random() {
        this("official.txt");
    }
    public Random(String file) {
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            //		File f = new File(classLoader.getResource("data/words.txt").getFile());
            InputStream is = (InputStream) classLoader.getResource("" + file).getContent();
            for (Scanner sc = new Scanner(is); sc.hasNext(); ) {
                freq.add(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
            freq.add("bad file");
        }
    }

    public String getWord() {
        return freq.get(this.nextInt(freq.size()));
    }

}
