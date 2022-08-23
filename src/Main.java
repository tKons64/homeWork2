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

// Задание №3
        short weghtBanana = 80;
        short volumeMilk = 200;
        short weghtIcecream = 100;
        short egg = 70;

        // переведем молоко в вес
        double weghtMilk = volumeMilk * 1.05;

        System.out.println(" ");
        System.out.println("Задание №3:");
        //считаем общий вес завтрака
        // пришлось приоброзовать резульат в тип short, иначе выдает ошибку и просит указать тип int.
        // Не понимаю почему(
        short weightBreakfastGrams = (short) ((weghtBanana * 5) + (short)weghtMilk + (weghtIcecream * 2) + (egg * 4));
        System.out.println("Общий вес завтрака в граммах - " + weightBreakfastGrams);

        float weightBreakfastKilograms = (float)weightBreakfastGrams / 1000;
        System.out.println("Общий вес завтрака в килограммах - " + weightBreakfastKilograms);

// Задание №4

        byte weightLostKg = 7; // вес в килограммах
        int weightLostGr = weightLostKg * 1000; // вес в граммах
        short gramsMin = 250;
        short gramsMax = 500;
        int gramsAverage = (gramsMax + gramsMin) / 2;

        int daysMax = weightLostGr / gramsMin;
        int daysMin = weightLostGr / gramsMax;
        int daysAverageFull = weightLostGr / gramsAverage;
        float hoursRemainder = ((weightLostGr / (float)gramsAverage) % daysAverageFull) * 24;

        System.out.println(" ");
        System.out.println("Задание №4:");

        System.out.println("Максимальное время похудения Боксера №1 (по 250 гр. в день) - " + daysMax + " дней");
        System.out.println("Минимальное время похудения Боксера №1 (по 500 гр. в день) - " + daysMin + " дней");
        System.out.println("Среднее время похудения Боксера №1 (по " + gramsAverage + " гр. в день) - " + (byte)daysAverageFull + " дней, " + (byte)(hoursRemainder + 0.5) + " часов");

// Задание №5

        // иницииализируем переменные для текущей месячной зарплаты сотрудников
        int pastSalaryMonthMaria = 67_760;
        int pastSalaryMonthDenis = 83_690;
        int pastSalaryMonthKristina = 76_230;

        // иницииализируем переменные и рассчитаем текущий годовой доход сотрудников
        int pastSalaryYearMaria = pastSalaryMonthMaria * 12;
        int pastSalaryYearDenis = pastSalaryMonthDenis * 12;
        int pastSalaryYearKristina = pastSalaryMonthKristina * 12;

        float indexPercent = 0.1f;

        // иницииализируем переменные и рассчитаем новый размер месячной зарплаты сотрудников
        float nowSalaryMonthMaria = pastSalaryMonthMaria * indexPercent + pastSalaryMonthMaria;
        float nowSalaryMonthDenis = pastSalaryMonthDenis * indexPercent + pastSalaryMonthDenis;
        float nowSalaryMonthKristina = pastSalaryMonthKristina * indexPercent + pastSalaryMonthKristina;

        // иницииализируем переменные и рассчитаем новый годовой доход сотрудников
        int nowSalaryYearMaria = (int)nowSalaryMonthMaria * 12;
        int nowSalaryYearDenis = (int)nowSalaryMonthDenis * 12;
        int nowSalaryYearKristina = (int)nowSalaryMonthKristina * 12;

        // иницииализируем переменные и расчитываем разницу в годовом доходе
        int distinctionSalaryYearMaria    = nowSalaryYearMaria - pastSalaryYearMaria;
        int distinctionSalaryYearDenis    = nowSalaryYearDenis - pastSalaryYearDenis;
        int distinctionSalaryYearKristina = nowSalaryYearKristina - pastSalaryYearKristina;

        System.out.println(" ");
        System.out.println("Задание №5:");

        System.out.println("Маша теперь получает - " + (int)nowSalaryMonthMaria + " рублей. Годовой доход вырос на - " + distinctionSalaryYearMaria + " рублей");
        System.out.println("Денис теперь получает - " + (int)nowSalaryMonthDenis + " рублей. Годовой доход вырос на - " + distinctionSalaryYearDenis + " рублей");
        System.out.println("Кристина теперь получает - " + (int)nowSalaryMonthKristina + " рублей. Годовой доход вырос на - " + distinctionSalaryYearKristina + " рублей");


    }
}