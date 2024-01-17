import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dict {
    public List<String> words = new ArrayList<>();
    Random rand = new Random();
    public Dict(String FilePath){
        try(FileReader fr = new FileReader(FilePath)) {
            StringBuilder sb = new StringBuilder();
            int c;
            while((c=fr.read())!=-1){
                sb.append((char)c);
            }
            words.addAll(List.of(sb.toString().split("\n")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String GetRandomWord(){
        return words.get(rand.nextInt(words.size()));
    }
}
