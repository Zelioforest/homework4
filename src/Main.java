// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //tack1

        System.out.println("Задача № 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();


        //tack2

        System.out.println("Задача № 2");
        int temperature = 7;
        if (temperature <= 2){
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки");
        }
        System.out.println();

        //tack3

        System.out.println("Задача № 3");
        int speed = 75;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else{
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задача № 4");
        int ageMan = 13;
        if (ageMan >= 2 && ageMan <= 6){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад.");
        }
        if (ageMan >= 7 && ageMan <= 17){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу.");
        }
        if (ageMan >= 18 && ageMan <= 24){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в университет.");
        }
        if (ageMan > 24){
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить на работу.");
        }
        System.out.println();

        System.out.println("Задача № 5");
        int ageForAttraction = 7;
        if (ageForAttraction < 5){
            System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему ельзя кататься на аттракционе");
        }
        if (ageForAttraction >= 5 && ageForAttraction < 14){
            System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageForAttraction >= 14){
            System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

        System.out.println("Задача № 6");
        int passengers = 127;
        if (passengers < 60){
            System.out.println("Есть сидячие и стоячие места");
        }
        if (passengers >= 60 && passengers < 102){
            System.out.println("Есть только стоячие места");
        }
        if (passengers >= 102){
            System.out.println("Мест нет. Вагон заполнен");
        }
        System.out.println();

        System.out.println("Это вариант с использованием else");

        if (passengers >= 102){
            System.out.println("Мест нет");
        } else {
            System.out.println("Есть места");
        }
        System.out.println();



        System.out.println("Задача № 7");
        int one = 7;
        int two = 15;
        int three = 25;
        int maxNumber = 0;
        if (one < two){
            maxNumber = two;
        } else{
            maxNumber = one;
        }
        if (three > maxNumber){
            maxNumber = three;
        }
        System.out.println("Самое большое число равно " + maxNumber);



    }
}