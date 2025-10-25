
public class Main {
    public static void main(String[] args) {
        int age = 18;
        System.out.println("Задача 1:");
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если возраст человека равен" + age + " ,то он достиг совершеннолетия");
        }

        int temperature = 10;
        System.out.println("Задача 2:");
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно без шапки");
        }

        int speed = 400;
        System.out.println("Задача 3:");
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }

        int age2 = 6;
        System.out.println("Задача 4:");
        if (age2 >=2 && age2 <=6) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        }
        else if (age2 >= 7 && age2 <=17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        }
        else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то его место в университете");
        }
        if  (age2 >24) {
            System.out.println("Если возраст человека равен " + age2 + " ,то ему пора ходить на работу");
        }
        int age3 = 14;
        boolean parent1 = true;
        boolean parent2 = false;
        System.out.println("Задача 5:");
        if (age3 < 5) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на атракционе");
        }
        else if (age3 >= 5 && age3 <=14 && parent1) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он может кататься, если только в сопровождении взрослого");
        }
        else if (age3 >= 5 && age3 <=14 && parent2) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он не может кататься, если нет сопровождения взрослого");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + ", то он может кататься без сопровождения взрослого");
        }

        int passengers = 60;
        int capacity = 102;
        int seating = 60;
        System.out.println("Задача 6:");
        if (passengers <= capacity && passengers > seating){
            System.out.println("Есть стоячие места");
        }
        else if (passengers <= seating) {
            System.out.println("Есть сидячие места");
        }
        else  {
            System.out.println("Мест нет");
        }

        int one = 5;
        int two = 3;
        int three = 2;
        System.out.println("Задача 7:");
        if (one > two && one > three) {
            System.out.println("Число " + one + " большее");
        }
        else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");
        }
        else {
            System.out.println("Число " + three + " большее");
        }
    }
}