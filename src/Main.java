public class Main {
    public static void main(String[] args) {
        //task - 1
        System.out.println("Задание - 1");
        for (int i =1; i <=10; i++){
            System.out.println(i);
        }
        //task - 2
        System.out.println("Задание - 2");
        for (int i =10; i >=1; i--){
            System.out.println(i);
        }
        //task - 3
        System.out.println("Задание - 3");
        for (int i =0; i <=17; i=i+2){
            System.out.println(i);
        }
        //task - 4
        System.out.println("Задание - 4");
        for (int i =10; i >=-10; i--){
            System.out.println(i);
        }
        //task - 5
        System.out.println("Задание - 5");
        for (int i =1904; i <=2096; i=i+4){
            System.out.println(i+ " год является високосным");
        }
        //task - 6
        System.out.println("Задание - 6");
        for (int i =7; i <=98; i=i+7){
            System.out.println(i);
        }
        //task - 7
        System.out.println("Задание - 7");
        for (int i =1; i <=512; i=i*2){
            System.out.println(i);
        }
        //task - 8,9
        System.out.println("Задание - 8,9");
        int accumulation = 29000;
        int total = 0;
        for (int i =1; i <=12; i++){
            total = total + total/100 + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна "+total+" рублей");
        }
        //task - 10
        System.out.println("Задание - 10");
        int two=0;
        for (int i =1; i <=10; i++){
            two = two+2;
            System.out.println("2 * " + i + " = " +two);
        }
    }
}