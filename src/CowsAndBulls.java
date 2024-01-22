public class CowsAndBulls {
    private final String word;
    int counter = 0;
    CowsBulls result;
    public CowsAndBulls(String word, CowsBulls result){
        this.word = word.toLowerCase();
        this.result = result;
    }
    public void checkWord(String word){
        if (word.length() != getSize()) {
            result.setCows(0);
            result.setBulls(0);
            return;
        }
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
        result.setCows(cows);
        result.setBulls(bulls);
    }
    public int getSize(){
        return word.length();
    }
    public int getCounter(){
        return  counter;
    }
    public CowsBulls getResult(){
        return result;
    }
}
