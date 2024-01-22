import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Dict nouns = new Dict("src\\russian_nouns.txt");
        CowsBulls result = new CowsBulls(0, 0);
        CowsAndBulls game = new CowsAndBulls(nouns.getRandomWord(), result);
        Scanner in = new Scanner(System.in);
        System.out.println("Загадано слово из "+ game.getSize() + " букв");
        do {
            System.out.print("Введите слово: ");
            String word = in.nextLine();
            if (word.length() != game.getSize()){
                System.out.println("Слово должно состоять из " + game.getSize() + " букв");
                continue;
            }
            game.checkWord(word);
            System.out.printf("Коров: %d, Быков: %d\n", result.getCows(), result.getBulls());
        } while (result.getBulls() != game.getSize());
        System.out.println("Вы победили. Попыток: "+ game.getCounter());

    }
}