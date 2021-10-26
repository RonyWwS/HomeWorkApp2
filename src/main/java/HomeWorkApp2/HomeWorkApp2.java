package HomeWorkApp2;

public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(summaVPredelakh(5,12));
        PlusOrMinus(-8);
        System.out.println(trueOrFalse(0));
        String a = new String();
        printSomething("Проверка печати", 5);
        System.out.println(leapYear(100));
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

    public static boolean leapYear (int a) {
        var b = a % 100;
        if(a % 400 == 0) {
            return true;
        } else if (a % 100 == 0){
            return false;
        } else if (a % 4 == 0) {
            return  true;
        }
        return false;
    }
}
