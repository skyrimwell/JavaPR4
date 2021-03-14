import java.util.Random;

public class WordRandomizer implements Runnable {
    private final String[] words = {"мяч", "нога", "слово", "голова", "нос", "рамка", "окно", "стекло", "лампочка", "ручка", "банка", "экран", "ножницы", "кнопка", "выключатель", "паспорт", "вилка", "микрофон", "часы", "болт", "клавиатура", "геймпад", "чашка", "обои", "яйцо", "пакет", "бумага", "фантик", "лента", "карандаш", "телефон", "щипчики", "ластик", "точилка", "салфетка"};
    private final Random random = new Random();

    @Override
    public void run() {
        try {
            System.out.println(words[random.nextInt(words.length)]);
            Thread.sleep(random.nextInt(5001) + 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}