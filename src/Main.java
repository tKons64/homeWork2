public class Main {
    public static void main(String[] args) {

// Задание №1
        byte a = 100;
        short b = 2000;
        int c = 3000;
        long d = 365L;

        float A = 1.5555555555f;
        double B = 1.5555555555;

        char C = '!';
        boolean YesNo = true;

        System.out.println("Задание №1:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(YesNo);

// Задание №2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;

        System.out.println(" ");
        System.out.println("Задание №2:");

        float totalWeightBoxer = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров " + totalWeightBoxer + " кг!");

        // мы можем не знать изначально чей вес больше,
        // поэтому для универсальности будем вычитать первый вес из второго
        // и потом результат приводить к модулю числа
        float differenceWeightBoxer = weightBoxer1 - weightBoxer2;
        System.out.println("Разница в весе боксеров " + Math.abs(differenceWeightBoxer) + " кг!");

    }
}