public class CowsAndBulls {
    private final String word;
    int counter = 0;
    public CowsAndBulls(String word){
        this.word = word.toLowerCase();
    }
    public CowsBulls CheckWord(String word){
        if (word.length() != GetSize()) return new CowsBulls(0, 0);
        int cows = 0, bulls = 0;
        word = word.toLowerCase();

        StringBuilder sbWord = new StringBuilder(word);
        StringBuilder sbtWord = new StringBuilder(this.word);
        for (int i = word.length() - 1; i >= 0; i--){
            if (sbWord.charAt(i) == sbtWord.charAt(i)){
                bulls++;
                sbWord.deleteCharAt(i);
                sbtWord.deleteCharAt(i);
            }
        }
        for (int i = 0; i < sbtWord.length(); i++){
            for (int j = sbWord.length() - 1; j >= 0; j--){
                if (sbtWord.charAt(i) == sbWord.charAt(j)){
                    cows++;
                    sbWord.deleteCharAt(j);
                    sbtWord.deleteCharAt(i);
                }
            }
        }

        counter++;
        return new CowsBulls(cows, bulls);
    }
    public int GetSize(){
        return word.length();
    }
    public int GetCounter(){
        return  counter;
    }
}
