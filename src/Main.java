import java.io.PrintStream;

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




         }
    }
