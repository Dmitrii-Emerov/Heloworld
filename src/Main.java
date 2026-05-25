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
        var result1 = (a/2) * b;
        System.out.println(((a/2) * b)+ result1);


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
        System.out.println("теперь вес продуктов "+ productsWeight);

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



        byte xl = 67;
        System.out.println("Значение переменой xl с типом byte равно " + xl);
        int xa = 27897;
        System.out.println("Значение с переменой xa с типом int равно " + xa);
        short xb =569;
        System.out.println("Значение с переменой xb с типом short равно " + xb);
        long xc = 987678965;
        System.out.println("Значение с переменой xc с типом long равно " + xc);
        float xv = 27.12f;
        System.out.println("Значение с переменой xv с типос float равно " + xv);
        double xz =2.786;
        System.out.println("Значение с переменой xz с типом double равно " + xz);


        byte LP = 23;
        System.out.println("У Людмилы Павловны учаться " + LP + " ученика!");
        byte AS = 27;
        System.out.println("У Анны Сергеевны учаться " + AS + " учеников!");
        byte EA = 30;
        System.out.println("У Екатерины Андреевны учаться " + EA + " учеников!");
        int vseList = 480;
        byte vseUcheniki = (byte) (LP + AS + EA);
        System.out.println(vseUcheniki + " учеников учаться в трех классах");
        int listKajdomu =  (vseList / vseUcheniki);
        System.out.println("На каждого ученика рассчитано " + listKajdomu + " листов бумаги");


        byte twoMin = 16;
        byte sa = 2;
        byte sq= 1;
        byte oneMin = (byte) (twoMin / sa);
        System.out.println("За "+ sq + " минуту производит "+ oneMin + " штук бутылок!" );
        System.out.println("за "+ sa + " минуты произвела " + twoMin + " штук бутылок!");
        byte sv = 20;
        int sd = sv / sa;
        int se = twoMin * sd;
        System.out.println("За "+ sv + " минут произвела " + se + " штук бутылок!" );
        byte sx = 24;
        int minSx = sx * 60;
        int sr = minSx * oneMin;
        System.out.println("в 1х сутках " + sx + " часа!");
        System.out.println("В одних сутках " + minSx + " минут!");
        System.out.println("За "+ minSx + " минут произвела " + sr + " штук бутылок!");
        byte su = 3 * 24;
        int  sf = su * 60;
        int st = sf * oneMin;
        System.out.println("В трех сутках " + su + " часа");
        System.out.println("В трех сутках "+ sf + " минут");
        System.out.println("За "+ sf + " минут произвела "+ st + " штук бутылок!" );
        byte so = 30;
        int sh = so * 24;
        int sk = sh * 60;
        int sl = sk * oneMin;
        System.out.println("В одном месяце "+ sh + " часов");
        System.out.println("В одном месяце "+ sk + " минут");
        System.out.println("За "+ sk + " минут произвела "+ sl + " штук бутылок!");


         byte banok = 120;
         byte oneBanka = 2;
         byte twoBanka = 4;
         byte vseBanka = (byte) (oneBanka + twoBanka);
         byte vseClass = (byte) (banok / vseBanka);
         byte korKras = (byte) (twoBanka * vseClass);
         byte belKras= (byte) (oneBanka * vseClass);
        System.out.println("Нужно для одного класса " + vseBanka + " банок краски разного цвета");
         System.out.println("Всего "+ vseClass + " классов в школе!");
        System.out.println("В школе, где "+ vseClass + " классов, нужно "+ belKras + " банок белой краски и " + korKras + " банок коричневой краски! ");


        var banan = 5;
        byte bana = 80;
        var milk = 200;
        byte milc = 105;
        var ml = milk / 100;
        System.out.println(ml + "  пачrb молока по 100мл в нашей корзине");
        System.out.println("В 100 мл молока "+ milc + " граммов" );
        var iceCrem = 2;
        byte cremIce = 100;
        var egg = 4;
        byte eg = 70;
        int Banan = banan * bana;
        System.out.println("Всего " + Banan + " граммов банана");
        int Milk = ml * milc;
        System.out.println("Всего " + Milk + " граммов молока");
        int ice = iceCrem * cremIce;
        System.out.println("Всего " + ice + " граммов мороженного");
        int Egg = egg * eg;
        System.out.println("Всего "+ Egg + " граммов яиц");
        int vseProdukt = Banan + Milk + ice + Egg;
        var grm = 1000;
        var kg = 1;
        System.out.println("В "+ kg + " килограмме "+ grm + " граммов");
        float vseKillo = (float) vseProdukt / grm;
        System.out.println("Вес завтрака состовляет " + vseProdukt + " граммов!");
        System.out.println("Вес завтрака состовляет " + vseKillo + " килограммов!");


        var ves = 7;
        var vesUbrat = ves * 1000;
        var pohudenieOne = 250;
        var pohudenieTwo = 500;
        var skolDay = vesUbrat / pohudenieOne;
        var skolkoDay = vesUbrat / pohudenieTwo;
        System.out.println( vesUbrat + " граммов. Столько надо сбросить спорцмену до соревнований!");
        System.out.println(skolDay + " дней понядобиться на сгон веса, если сгонять по 250 грамм ");
        System.out.println(skolkoDay + " дней понадобиться на сгон веса, если сгонять по 500 грамм ");



        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        float procentZpMasha = (float) masha/ 100 ;
        float zpMashaProcent = (float) procentZpMasha * 10;
        System.out.println("На "+ zpMashaProcent + " рублей повыситься зарплата у Маши ");

        float procentZpDenis = (float) denis/ 100 ;
        float zpDenisProcent = (float) procentZpDenis * 10;
        System.out.println("На "+ zpDenisProcent + " рублей повыситься зарплата у Дениса ");

        float procentZpKristina = (float) kristina/ 100 ;
        float zpKristinaProcent = (float) procentZpKristina * 10;
        System.out.println("На "+ zpKristinaProcent + " рублей повыситься зарплата у Кристины ");

        int zpMasha = (int) (masha + zpMashaProcent);
        int zpDenis = (int) (denis + zpDenisProcent);
        int zpKristina = (int) (kristina + zpKristinaProcent);
        System.out.println("Зарплата Маши с прибавление составляет "+ zpMasha);
        System.out.println("Зарплата Дениса с прибавление составляет "+ zpDenis);
        System.out.println("Зарплата Кристины с прибавление составляет "+ zpKristina);

        int ninZpMasha = masha * 12;
        int ninZpDenis = denis * 12;
        int ninZpKristina = kristina * 12;
        System.out.println("Нынешняя зарплата составляет Маши "+ ninZpMasha + " рублей в год!");
        System.out.println("Нынешняя зарплата составляет Дениса "+ ninZpDenis + " рублей в год!");
        System.out.println("Нынешняя зарплата составляет Кристины "+ ninZpKristina + " рублей в год!");

        int seyZpMasha = zpMasha * 12;
        int seyZpDenis = zpDenis * 12;
        int seyZpKristina = zpKristina * 12;
        System.out.println("Зарплата Маши с прибавлением процентов составляет "+ seyZpMasha+ " рублей в год!");
        System.out.println("Зарплата Дениса с прибавлением процентов составляет "+ seyZpDenis+ " рублей в год");
        System.out.println("Зарплата Кристины с прибавлением процентов составляет "+ seyZpKristina+ " рублей в год");

        int razZpMasha = seyZpMasha - ninZpMasha;
        int razZpDenis = seyZpDenis - ninZpDenis;
        int razZpKristina = seyZpKristina - ninZpKristina;
        System.out.println("Машина разница между нынешней зп и с прибавкой составляет "+ razZpMasha+ " рублей за год!");
        System.out.println("Дениса разница между нынешней зп и с прибавкой составляет "+ razZpDenis+ " рублей за год!");
        System.out.println("Кристинина разница между нынешней зп и с прибавкой составляет "+ razZpKristina+ " рублей за год!");

        System.out.println("Маша теперь получает "+ seyZpMasha + " рублей. Годовой доход вырос на " + razZpMasha + " рублей");
        System.out.println("Денис теперь получает "+ seyZpDenis + " рублей. Годовой доход вырос на " + razZpDenis + " рублей");
        System.out.println("Кристина теперь получает "+ seyZpKristina + " рублей. Годовой доход вырос на " + razZpKristina + " рублей");



         }
    }
