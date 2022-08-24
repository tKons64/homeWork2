public class Main {
    public static void main(String[] args) {
// Первый вариант домашнего задания по ссылке - https://skyengpublic.notion.site/1-2-fa644f7f20be4093911382030d47bcb4
// Задание №1.1
        byte a = 100;
        short b = 2000;
        int c = 3000;
        long d = 365L;

        float A = 1.5555555555f;
        double B = 1.5555555555;

        char C = '!';
        boolean YesNo = true;

        System.out.println("Задание №1.1:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(YesNo);

// Задание №1.2
        float weightBoxer1 = 78.2f;
        float weightBoxer2 = 82.7f;

        System.out.println(" ");
        System.out.println("Задание №1.2:");

        float totalWeightBoxer = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров " + totalWeightBoxer + " кг!");

        // мы можем не знать изначально чей вес больше,
        // поэтому для универсальности будем вычитать первый вес из второго
        // и потом результат приводить к модулю числа
        float differenceWeightBoxer = weightBoxer1 - weightBoxer2;
        System.out.println("Разница в весе боксеров " + Math.abs(differenceWeightBoxer) + " кг!");

// Задание №1.3
        short weghtBanana = 80;
        short volumeMilk = 200;
        short weghtIcecream = 100;
        short egg = 70;

        // переведем молоко в вес
        double weghtMilk = volumeMilk * 1.05;

        System.out.println(" ");
        System.out.println("Задание №1.3:");
        //считаем общий вес завтрака
        // пришлось приоброзовать резульат в тип short, иначе выдает ошибку и просит указать тип int.
        // Не понимаю почему(
        short weightBreakfastGrams = (short) ((weghtBanana * 5) + (short)weghtMilk + (weghtIcecream * 2) + (egg * 4));
        System.out.println("Общий вес завтрака в граммах - " + weightBreakfastGrams);

        float weightBreakfastKilograms = (float)weightBreakfastGrams / 1000;
        System.out.println("Общий вес завтрака в килограммах - " + weightBreakfastKilograms);

// Задание №1.4

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
        System.out.println("Задание №1.4:");

        System.out.println("Максимальное время похудения Боксера №1 (по 250 гр. в день) - " + daysMax + " дней");
        System.out.println("Минимальное время похудения Боксера №1 (по 500 гр. в день) - " + daysMin + " дней");
        System.out.println("Среднее время похудения Боксера №1 (по " + gramsAverage + " гр. в день) - " + (byte)daysAverageFull + " дней, " + (byte)(hoursRemainder + 0.5) + " часов");

// Задание №1.5

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
        System.out.println("Задание №1.5:");

        System.out.println("Маша теперь получает - " + (int)nowSalaryMonthMaria + " рублей. Годовой доход вырос на - " + distinctionSalaryYearMaria + " рублей");
        System.out.println("Денис теперь получает - " + (int)nowSalaryMonthDenis + " рублей. Годовой доход вырос на - " + distinctionSalaryYearDenis + " рублей");
        System.out.println("Кристина теперь получает - " + (int)nowSalaryMonthKristina + " рублей. Годовой доход вырос на - " + distinctionSalaryYearKristina + " рублей");

// 2-й вариант домашнего задания по ссылке - https://skyengpublic.notion.site/1-73749ae77bf04274b387711fdcae558d
// Задание №2.1
        System.out.println(" ");
        System.out.println("Задание №2.1:");

        var dog = 8;
        var cat = 3.6;
        var paper = 763_789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

// Задание №2.2
        System.out.println(" ");
        System.out.println("Задание №2.2:");

        dog = dog + 4;
        cat += 4; // попробуем другой способ)
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

// Задание №2.3
        System.out.println(" ");
        System.out.println("Задание №2.3:");

        var dogTypeDouble = dog - 3.5;
        cat -= 1.6; // попробуем другой способ)
        paper -= 7_639;

        System.out.println(dogTypeDouble);
        System.out.println(cat);
        System.out.println(paper);

// Задание №2.4
        System.out.println(" ");
        System.out.println("Задание №2.4:");

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /=7;
        System.out.println(friend);

// Задание №2.5
        System.out.println(" ");
        System.out.println("Задание №2.5:");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

// Задание №2.6
        System.out.println(" ");
        System.out.println("Задание №2.6:");

        var weightBoxer21 = 78.2;
        var weightBoxer22 = 82.7;

        var totalWeightBoxer2 = weightBoxer21 + weightBoxer22;
        System.out.println("Общий вес боксеров " + totalWeightBoxer2 + " кг!");

        // мы можем не знать изначально чей вес больше,
        // поэтому для универсальности будем вычитать первый вес из второго
        // и потом результат приводить к модулю числа
        var differenceWeightBoxer2 = weightBoxer21 - weightBoxer22;
        System.out.println("Разница в весе боксеров " + Math.abs(differenceWeightBoxer2) + " кг!");

// Задание №2.7
        System.out.println(" ");
        System.out.println("Задание №2.7:");

        // прочто вычитаем из большего веса, меньший и обновление зачение переменной totalWeightBoxer2
        differenceWeightBoxer2 = weightBoxer22 - weightBoxer21;
        System.out.println("Способ 1. Разница в весе боксеров " + Math.abs(differenceWeightBoxer2) + " кг!");

        // используем спосб через остаток от деления %
        differenceWeightBoxer2 = weightBoxer22 % weightBoxer21;
        System.out.println("Способ 2. Разница в весе боксеров " + Math.abs(differenceWeightBoxer2) + " кг!");

// Задание №2.8
        System.out.println(" ");
        System.out.println("Задание №2.8:");

        var totalWorkTime = 640;
        var workTimeInDay = 8;
        var totalEmployees = totalWorkTime / workTimeInDay;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек.");

        //Посчитайте сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше.
        var newNumberEmployees = totalEmployees + 94;
        var newTotalWorkTime = newNumberEmployees * workTimeInDay;
        System.out.println("Если в компании работает - " + newNumberEmployees + " человек, то всего - " + newTotalWorkTime + " часов работы может быть поделено между сотрудниками");
    }
}