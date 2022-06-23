import java.util.Scanner;

public class HomeWorkS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1
        //System.out.println("please enter a number : ");
        //int number1 = scanner.nextInt();
        //if (number1%2==0){
        //    System.out.println("even number !!!!!");
        //}else{
        //    System.out.println("Odd number alert !!!!!");
        //}


        //2
        //double number2 = scanner.nextDouble();
        //System.out.println(Math.abs(number2));
        //System.out.println(Math.abs(scanner.nextDouble()));

        //3

        //System.out.println("how many ?");
        //int q = scanner.nextInt();
        //System.out.println("how much ?");
        //double pricePerUnit = scanner.nextDouble();
        //Double income = pricePerUnit * q ;
//
        //if(income > 5000){
        //    income=income * 0.9;
        //}
//
        //System.out.println(income);

        //4
        //System.out.println("please enter the first number");
        //int x1 = scanner.nextInt();
        //System.out.println("please enter the second number");
        //int x2 = scanner.nextInt();
        //if (x1>x2){
        //    System.out.println(x1);
        //}else{
        //    System.out.println(x2);
        //}

        //5
        //System.out.println("please enter a number : ");
        //int number2 = scanner.nextInt();
        //if (number2 >= 0){
        //    System.out.println(number2 +" positive !!!!!");
        //}else{
        //    System.out.println(number2+" negative !!!!!");
        //}

        //6

        //int a = scanner.nextInt();
        //int b = scanner.nextInt();
        //int c = scanner.nextInt();
        //
        //if (a+b+c == 180){
        //    System.out.println("you have a valid triangle");
        //}else {
        //    System.out.println("lech lech tehapes");
        //}

        //7
        //System.out.println("please enter a year ");
        //int year = scanner.nextInt();
//
        //if (year%4 == 0){
        //    System.out.println("leap year");
        //} else {
        //    System.out.println("just another Boring year");
        //}


        //8
        //System.out.println("please enter a radius");
        //double radius = scanner.nextDouble();
        //double hekef = 2*3.14*radius;
        //double area = 3.14 * (radius * radius);
        //System.out.println(area);
        //System.out.println(hekef);

        //9

       //System.out.println("please enter c temp");
       //double c = scanner.nextDouble();

       //System.out.println(((c*1.8)+32) + " in F");

        double p = 100000;
        double r = 0.95/12;
        double n = 12*20;

        double m = p   *((r*Math.pow(1+r,n))
                                 /
                       (1+Math.pow(r,n))-1);






    }
}
