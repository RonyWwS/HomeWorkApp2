package HomeWorkApp2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(summaVPredelakh(5,12));
        PlusOrMinus(-8);
        System.out.println(trueOrFalse(0));
        String a = new String();
        printSomething("Проверка печати", 5);
    }

    public static boolean summaVPredelakh (int a, int b) {
        var c = a + b;
        if(10 <= c && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void PlusOrMinus (int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else {
            System.out.println("Передано отрицательное число");
        }
    }

    public static boolean trueOrFalse (int a) {
        if(a < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printSomething (String a, int b) {
        int c = 1;
        while (c <= b) {
            System.out.println(a);
            c++;
        }
    }
}
