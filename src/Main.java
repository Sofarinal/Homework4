import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            //Задание 1
            int age = 19;
            if (age >= 18) {
                System.out.println("Если возраст человека равен " + age + " то он достиг совершеннолетия");
            }
            if (age < 18) {
                System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
            }

            // Задание 2
        int weather = 8;
            if (weather >= 5) {
                System.out.println("На улиуце " + weather + " можно идти без шапки");
            }
            if (weather < 5) {
                System.out.println("На улице " + weather + " нужно надеть шапку");
            }

            // Задание 3
        int speed = 90;
            if (speed >= 60) {
                System.out.println("Если скорость " + speed + " придется заплатить штраф");
            }
            if (speed < 60) {
                System.out.println("Если скорость " + speed + " можно ездить спокойно");
            }

            // Задание 4
        int year = 30;
            if (year >= 2 && year <= 6) {
                System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в детский сад");
            }
            if (year >= 7 && year <= 17) {
                System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в школу");
        }
            if (year >= 18 && year <= 24) {
                System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в университет");
            }
            if (year >= 24)
                System.out.println("Если возраст человека равен " + year + " то ему нужно ходить на работу");

            // Задача 5
        int children = 17;
        if (children < 5) {
            System.out.println("Если возраст человека равен " + children + " то ему нельзя кататься");
        } else  if (children <= 14) {
            System.out.println("Если возраст человека равен " + children + " то ему можно кататься в сопровождении");
        } else {
            System.out.println("Если возраст человека равен " + children + " то ему можно кататься без сопровождения");
        }

            // Задание 6
        int allPlaces = 102;
        int seatingPositions = 60;
        int passenger = 184;
        if (passenger >= allPlaces) {
            System.out.println("Вагон полностью значит, мест нет ");
        } else if (passenger < seatingPositions) {
            int availableSeats = seatingPositions - passenger;
            System.out.println("Есть " + availableSeats + " свободных сидячих мест");
        } else {
            int places = allPlaces - passenger;
            System.out.println("Сидячих мест нет, но есть " + places + " стоячих мест");
        }

            // Задание 7
        int max;
        int one = 19;
        int two = 28;
        int three = 2;
        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }
        System.out.println("Наибольшее число: " + max);
        }
    }