import java.util.*;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        hw1();
        hw2();
        hw3();
        hw4();
        hw5();
        hw6();
        hw7();
    }

    public static void hw1() {
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Банан");
        Fruits.add("Персик");
        Fruits.add("Яблоко");
        Fruits.add("Дыня");
        Fruits.add("Арбуз");
        Fruits.add("Абрикос");
        System.out.println(Fruits);
        Fruits.add(0, "Огурец");
        Fruits.add(2, "Свекла");
        Fruits.add(8, "Лук");
        System.out.println(Fruits);
    }

    public static void hw2() {
        ArrayList<String> DeleteFruits = new ArrayList<>();
        DeleteFruits.add("Банан");
        DeleteFruits.add("Персик");
        DeleteFruits.add("Яблоко");
        DeleteFruits.add("Дыня");
        DeleteFruits.add("Арбуз");
        DeleteFruits.add("Абрикос");
        DeleteFruits.add("Огурец");
        DeleteFruits.add("Свекла");
        DeleteFruits.add("Лук");
        System.out.println(DeleteFruits);
        DeleteFruits.remove(0);
        DeleteFruits.remove(3);
        DeleteFruits.remove(6);
        System.out.println(DeleteFruits);
    }

    public static void hw3() {
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Красный");
        colour.add("Синий");
        colour.add("Желтый");
        colour.add("Зеленый");
        System.out.println(colour.indexOf("Желтый"));
    }

    public static void hw4() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 9, 4, 11, 26, 14, 78));
        System.out.println(numbers);
        System.out.println("min " + Collections.min(numbers));
        System.out.println("max " + Collections.max(numbers));
        Collections.sort(numbers);
        System.out.println("sort " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("reverse sort " + numbers);
        Collections.shuffle(numbers);
        System.out.println("mix " + numbers);
    }

    public static void hw5() {
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Редиска");
        vegetables.add("Картошка");
        vegetables.add("Тыква");
        vegetables.add("Огурец");
        vegetables.add("Помидор");
        System.out.println(vegetables);
        vegetables.set(1, "Помидор");
        vegetables.set(4, "Картошка");
        System.out.println(vegetables);
    }

    public static void hw6() {
        ArrayList<String> lists1 = new ArrayList<>();
        lists1.add("Редиска");
        lists1.add("Перец");
        lists1.add("Тыква");
        lists1.add("Помидор");
        lists1.add("Огурец");

        ArrayList<String> lists2 = new ArrayList<>();
        lists2.add("Перец");
        lists2.add("Картошка");
        lists2.add("Укроп");
        lists2.add("Лук");
        lists2.add("Помидор");
        System.out.println(lists1);
        System.out.println(lists2);

        ArrayList<String> lists3 = new ArrayList<>(lists2);
        lists3.retainAll(lists1);
        System.out.println(lists3);
    }

    public static void hw7() {
        Collection<String> lists1 = Arrays.asList("Персик", "Яблоко", "Дыня", "Арбуз", "Абрикос");
        Collection<String> lists2 = Arrays.asList("Персик", "Помидор", "Абрикос", "Свекла", "Лук");

        Collection<String> similar = new HashSet<>(lists1);
        Collection<String> different = new HashSet<>();
        different.addAll(lists1);
        different.addAll(lists2);

        similar.retainAll(lists2);
        different.removeAll(similar);
        System.out.println(similar);
        System.out.println(different);

    }
}
