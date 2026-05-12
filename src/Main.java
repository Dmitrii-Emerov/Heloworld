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
        System.out.printf(" еще можно положить " + capacityLeft + " кг вещей ");


        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.printf(" Общий вес фруктов " + fruitWeight);

        var meetWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var ogurtsovWeight = 2;
        var pepersWeight = 2;
        var baklajanWeight = 3;
        var vegetablesWeight = tomatoesWeight + ogurtsovWeight + pepersWeight + baklajanWeight;
        var productsWeight = fruitWeight + meetWeight + waterWeight + vegetablesWeight;
        System.out.printf(" Общий вес продуктов " + productsWeight + " кг! ");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.printf("Место осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.printf("теперь вес продуктов "+ productsWeight);

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.printf("Теперь мета осталось " + leftWeight + " кг!");

        var overLoad = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.printf("перегруз на " + overLoad + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.printf("Продуктов в одной машине теперь " + productsInOneCar);







         }
    }
