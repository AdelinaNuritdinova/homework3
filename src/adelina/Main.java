package adelina;

public class Main {

    public static void main(String[] args) {
        String names[] = {"Mirana", "Lina", "Luna"};
        switch (names.length) {
            case 0:
                System.out.println("Доброе утро");
                break;
            case 1:
                System.out.println("Добрый день");
                break;
            case 2:
                System.out.println("Добрый вечер");
                break;

        }

    }
}
