package md.tekwill.topic3;

public class Operations {
    static void printAritmeticOperations() {
        int a = 50;
        int b = 60;

        System.out.println("Rezultatul adunarii este: " + (a + b));
        System.out.println("Rezultatul scaderii este: " + (a - b));
        System.out.println("Rezultatul inmultirii este: " + (a * b));
        System.out.println("Rezultatul impartirii este: " + (a / b));
        System.out.println("Restul impartirii este: " + (b % a));
        System.out.println("Rezultatul operatiei increment este: " + (++a));
        System.out.println("Rezultatul operatiei decrement este: " + (--b));
    }

    static void printRelationalOperations(int c, int d) {
        System.out.println("Verifica egalitatea: " + (c == d));
        System.out.println("Verifica inegalitatea: " + (c != d));
        System.out.println("Verifica daca c >d:" + (c > d));
        System.out.println("Verifica daca c < d: " + (c < d));
        System.out.println("Verifica daca c>=d: " + (c >= d));
        System.out.println("Verifica daca c<=d: " + (c <= d));
    }

    static void printLogicOperations() {
        boolean a = false;
        boolean b = true;

        System.out.println("Verificam operatia AND " + (a && b));
        System.out.println("Verificam operatia ||: " + (a || b));
        System.out.println("Verificam operatia de negatie " + (!b));
    }

    static void useForAndWhile() {
        int level = 1;
        int maxLevel = 10;

        while (level < maxLevel) {
            System.out.println("The game is not over. The current level is:" + level);
            ++level;
        }


        for (int gameLevel = 1; gameLevel <= maxLevel; gameLevel = gameLevel + 1) {
            System.out.println("The current level game is:" + gameLevel);
        }
        System.out.println("The game is over");
    }
}






