//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);
        var x = 1;
        var y = 2;
        var result = x + y;
        System.out.println("x + y =" + result);
        var a = 6;
        var b = 3;
        var result1 = (a / 2) * b;
        System.out.println(((a / 2) * b) + result1);


        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println(" еще можно положить " + capacityLeft + " кг вещей ");


        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println(" Общий вес фруктов " + fruitWeight);

        var meetWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var ogurtsovWeight = 2;
        var pepersWeight = 2;
        var baklajanWeight = 3;
        var vegetablesWeight = tomatoesWeight + ogurtsovWeight + pepersWeight + baklajanWeight;
        var productsWeight = fruitWeight + meetWeight + waterWeight + vegetablesWeight;
        System.out.println(" Общий вес продуктов " + productsWeight + " кг! ");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Место осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь мета осталось " + leftWeight + " кг!");

        var overLoad = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("перегруз на " + overLoad + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar);


        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerOne = 78.2;
        System.out.println(boxerOne);
        var boxerTwo = 82.7;
        System.out.println(boxerTwo);
        var totalWeight = boxerOne + boxerTwo;
        System.out.println("Общая масса 2х бойцов " + totalWeight + " кг! ");
        var differenceWeight = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов составляет " + differenceWeight + " кг!");

        var remainsWeight = boxerTwo % boxerOne;
        System.out.println("остаток от деления " + remainsWeight + " Кг!");

        var totalNumber = 640;
        var devotesTime = 8;
        var employees = totalNumber / devotesTime;
        System.out.println("Всего работников в компании " + employees + " человек ");

        var moreWorkers = employees + 94;
        System.out.println(moreWorkers + " человека работает в компании");
        var reducingHours = totalNumber / moreWorkers;
        System.out.println("Если в компании работает " + moreWorkers + " человек, то всего " + reducingHours + " часа работы может быть поделено между сотрудниками");


        byte bananas = 100;
        System.out.println("bananov " + bananas + " Kg!");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " kg!");

        byte z = 1;
        short ab = 1;
        int ac = 1;
        int d = z + ab + ac;
        System.out.println(d);

        float g = z + 1f;
        System.out.println(g);

        System.out.println("Задание 1-2");
        byte variableOne = 67;
        int variableTwo = 27897;
        short variableThree = 569;
        long variableFour = 987678965L;
        float variableFive = 27.12f;
        double variableSix = 2.786;
        System.out.println("Значение с переменой variableSix с типом double равно " + variableSix);
        System.out.println("Значение переменой variableOne с типом byte равно " + variableOne);
        System.out.println("Значение с переменой variableTwo с типом int равно " + variableTwo);
        System.out.println("Значение с переменой VariableThree с типом short равно " + variableThree);
        System.out.println("Значение с переменой variableFour с типом long равно " + variableFour);
        System.out.println("Значение с переменой variableFive с типом float равно " + variableFive);
        System.out.println("Задание 3");
        byte ludmilaPavlovna = 23;
        System.out.println("У Людмилы Павловны учаться " + ludmilaPavlovna + " ученика!");
        byte annaSergeevna = 27;
        System.out.println("У Анны Сергеевны учаться " + annaSergeevna + " учеников!");
        byte ekaterinaAndreevna = 30;
        System.out.println("У Екатерины Андреевны учаться " + ekaterinaAndreevna + " учеников!");
        int allSheets = 480;
        byte allStudents = (byte) (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println(allStudents + " учеников учаться в трех классах");
        int sheetsEveryone = (allSheets / allStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsEveryone + " листов бумаги");
        System.out.println("задание 4");
        byte bottlesOne = 16;
        byte min = 2;
        byte minOne = 1;
        byte minTwo = (byte) (bottlesOne / min);
        System.out.println("За " + minOne + " минуту производит " + minTwo + " штук бутылок!");
        System.out.println("за " + min + " минуты произвела " + bottlesOne + " штук бутылок!");
        byte bottlesTwo = 20;
        int minThree = bottlesTwo / min;
        int minFour = bottlesOne * minThree;
        System.out.println("За " + bottlesTwo + " минут произвела " + minFour + " штук бутылок!");
        byte bottlesThree = 24;
        int minFive = bottlesThree * 60;
        int minSix = minFive * minTwo;
        System.out.println("в 1х сутках " + bottlesThree + " часа!");
        System.out.println("В одних сутках " + minFive + " минут!");
        System.out.println("За " + minFive + " минут произвела " + minSix + " штук бутылок!");
        byte bottlesFour = 3 * 24;
        int minSeven = bottlesFour * 60;
        int minEight = minSeven * minTwo;
        System.out.println("В трех сутках " + bottlesFour + " часа");
        System.out.println("В трех сутках " + minSeven + " минут");
        System.out.println("За " + minSeven + " минут произвела " + minEight + " штук бутылок!");
        byte bottlesFive = 30;
        int minNine = bottlesFive * 24;
        int minTen = minNine * 60;
        int minEleven = minTen * minTwo;
        System.out.println("В одном месяце " + minNine + " часов");
        System.out.println("В одном месяце " + minTen + " минут");
        System.out.println("За " + minTen + " минут произвела " + minEleven + " штук бутылок!");
        System.out.println("Задание 5");
        byte cans = 120;
        byte oneCans = 2;
        byte twoCans = 4;
        byte allCans = (byte) (oneCans + twoCans);
        byte allClasses = (byte) (cans / allCans);
        byte brownPaint = (byte) (twoCans * allClasses);
        byte whitePaint = (byte) (oneCans * allClasses);
        System.out.println("Нужно для одного класса " + allCans + " банок краски разного цвета");
        System.out.println("Всего " + allClasses + " классов в школе!");
        System.out.println("В школе, где " + allClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски! ");
        System.out.println("Задание 6");
        byte banana = 5;
        byte bananaGramm = 80;
        int milk = 200;
        byte milkGramm = 105;
        byte milkAll = (byte) (milk / 100);
        System.out.println(milkAll + "  пачrb молока по 100мл в нашей корзине");
        System.out.println("В 100 мл молока " + milkGramm + " граммов");
        byte iceCrem = 2;
        byte iceCremgramm = 100;
        byte egg = 4;
        byte eggGramm = 70;
        int Banan = banana * bananaGramm;
        System.out.println("Всего " + Banan + " граммов банана");
        int Milk = milkAll * milkGramm;
        System.out.println("Всего " + Milk + " граммов молока");
        int ice = iceCrem * iceCremgramm;
        System.out.println("Всего " + ice + " граммов мороженного");
        int Egg = egg * eggGramm;
        System.out.println("Всего " + Egg + " граммов яиц");
        int vseProdukt = Banan + Milk + ice + Egg;
        int grm = 1000;
        byte kg = 1;
        System.out.println("В " + kg + " килограмме " + grm + " граммов");
        float allKillo = (float) vseProdukt / grm;
        System.out.println("Вес завтрака состовляет " + vseProdukt + " граммов!");
        System.out.println("Вес завтрака состовляет " + allKillo + " килограммов!");
        System.out.println("Задание 7");
        byte weight = 7;
        short removeWeight = (short) (weight * 1000);
        short weighLoss = 250;
        short loseWeight = 500;
        short skipDays = (short) (removeWeight / weighLoss);
        short skipDay = (short) (removeWeight / loseWeight);
        System.out.println(removeWeight + " граммов. Столько надо сбросить спорцмену до соревнований!");
        System.out.println(skipDays + " дней понядобиться на сгон веса, если сгонять по 250 грамм ");
        System.out.println(skipDay + " дней понадобиться на сгон веса, если сгонять по 500 грамм ");
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float percentMasha = (float) masha / 100;
        float mashaPercent = (float) percentMasha * 10;
        System.out.println("На " + mashaPercent + " рублей повыситься зарплата у Маши ");
        float percentDenis = (float) denis / 100;
        float denisPercent = (float) percentDenis * 10;
        System.out.println("На " + denisPercent + " рублей повыситься зарплата у Дениса ");
        float percentKristina = (float) kristina / 100;
        float kristinaPercent = (float) percentKristina * 10;
        System.out.println("На " + kristinaPercent + " рублей повыситься зарплата у Кристины ");
        int mashaSalary = (int) (masha + mashaPercent);
        int denisSalary = (int) (denis + denisPercent);
        int kristinaSalary = (int) (kristina + kristinaPercent);
        System.out.println("Зарплата Маши с прибавление составляет " + mashaSalary);
        System.out.println("Зарплата Дениса с прибавление составляет " + denisSalary);
        System.out.println("Зарплата Кристины с прибавление составляет " + kristinaSalary);
        int currentSalarymasha = masha * 12;
        int currentSalarydenis = denis * 12;
        int currentSalarykristina = kristina * 12;
        System.out.println("Нынешняя зарплата составляет Маши " + currentSalarymasha + " рублей в год!");
        System.out.println("Нынешняя зарплата составляет Дениса " + currentSalarydenis + " рублей в год!");
        System.out.println("Нынешняя зарплата составляет Кристины " + currentSalarykristina + " рублей в год!");
        int salaryMasha = mashaSalary * 12;
        int salaryDenis = denisSalary * 12;
        int salaryKristina = kristinaSalary * 12;
        System.out.println("Зарплата Маши с прибавлением процентов составляет " + salaryMasha + " рублей в год!");
        System.out.println("Зарплата Дениса с прибавлением процентов составляет " + salaryDenis + " рублей в год");
        System.out.println("Зарплата Кристины с прибавлением процентов составляет " + salaryKristina + " рублей в год");
        int differenceMasha = salaryMasha - currentSalarymasha;
        int differenceDenis = salaryDenis - currentSalarydenis;
        int differenceKristina = salaryKristina - currentSalarykristina;
        System.out.println("Машина разница между нынешней зп и с прибавкой составляет " + differenceMasha + " рублей за год!");
        System.out.println("Дениса разница между нынешней зп и с прибавкой составляет " + differenceDenis + " рублей за год!");
        System.out.println("Кристинина разница между нынешней зп и с прибавкой составляет " + differenceKristina + " рублей за год!");
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");


    }
}
