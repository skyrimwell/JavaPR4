
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecServ {
    private ExecutorService exec;
    private Random random = new Random();

    public ExecServ(int number) {
        exec = Executors.newFixedThreadPool(number);

        int threads = random.nextInt(15) + 1;
        System.out.println("Количество потоков = "+threads+" при введенных "+number+"\n");

        for(int i = 0; i < threads; i++) {
            System.out.println((i + 1)+" Поток");
            exec.execute(new WordRandomizer());
        }
        exec.shutdown();
        System.out.println("Окончание работы");
    }
}