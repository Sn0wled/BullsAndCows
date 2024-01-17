import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Dict d = new Dict("src\\russian_nouns.txt");
        CowsAndBulls a = new CowsAndBulls(d.GetRandomWord());
        CowsBulls result = new CowsBulls(0, 0);
        Scanner in = new Scanner(System.in);
        System.out.println("Загадано слово из "+ a.GetSize() + " букв");
        do {
            System.out.print("Введите слово: ");
            String word = in.nextLine();
            if (word.length() != a.GetSize()){
                System.out.println("Слово должно состоять из 5 букв");
                continue;
            }
            result = a.CheckWord(word);
            System.out.printf("Коров: %d, Быков: %d\n", result.GetCows(), result.GetBulls());
        } while (result.GetBulls() != a.GetSize());
        System.out.println("Вы победили. Попыток: "+ a.GetCounter());

    }
}