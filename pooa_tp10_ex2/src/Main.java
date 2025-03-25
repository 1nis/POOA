import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Logger logs1 = Logger.getInstance();
        Logger logs2 = Logger.getInstance();
        logs1.log("test1");
        logs2.log("test3");

        System.out.println(logs2.readLogs());

    }
}