public class Main {

    public static void main(String[] args) {

        Micro leMicro = new Micro();
        Miagiste Anis = new Miagiste("Anis", leMicro);
        Miagiste Yasser = new Miagiste("Yasser", leMicro);
        Thread Djamila = new Thread(new Miagiste("Djamila", leMicro));
        Thread Brahim = new Thread(new Miagiste("Brahim", leMicro));
        Thread Ines = new Thread(new Miagiste("Ines", leMicro));

        Anis.run();
        Yasser.run();
        Djamila.start();
        Brahim.start();
        Ines.start();

    }


}