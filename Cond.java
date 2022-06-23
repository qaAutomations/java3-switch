import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Scanner;

public class Cond {
    public static void main(String[] args) {

        // int x = 99 ;
//
        // if ( x%2==0  || x <100  )
        //     System.out.println("yaaaay we got it ");
        // else
        //     System.out.println("game over");
        //
        //int y = 12;
//
        //if ( y >= 50 && y <= 70 )
        //    System.out.println("yaaaay we got it ");
        //else
        //    System.out.println("game over");
       // int grade = 80;
//
       // if (grade >= 90)
       //     System.out.println("maaa man ");
       //  else
       //     if (grade < 90 && grade >= 80)
       //         System.out.println("goood work");
       //      else
       //         if (grade >= 70 && grade < 80)
       //             System.out.println("you almost there");
       //          else
       //             System.out.println("you need to work harder ");
//
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("please enter a number");
        //double x =scanner.nextDouble();
        //System.out.println("please enter an operator");
        //char op = scanner.next().charAt(0);
        //System.out.println("please enter a number");
        //double y=scanner.nextDouble();
        //if (op == '+' )
        //    System.out.println(x+y);
        //else if (op == '-')
        //    System.out.println(x-y);
        //    else if (op == '*')
        //        System.out.println(x*y);
        //        else if (op == '/')
        //            System.out.println(x/y);
        //                else
        //                    System.out.println("you entered a wrong operator");
        //switch (op){
        //   case '+' -> System.out.println(x+y);
        //   case '-' -> System.out.println(x-y);
        //   case '*' -> System.out.println(x*y);
        //   case '/' -> System.out.println(x/y);
        //   case '%' -> System.out.println(x%y);
        //   case 'q' -> System.out.println(Math.sqrt(x));
        //   default -> System.out.println("you entered a wrong operator");
        //}
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a name ");
        String qa31 = scanner.next();
        int number = scanner.nextInt();

        switch (qa31){
            case "aziz","naomi", "maria" , "root" -> System.out.println("haalofeem");
            case "ibrahim" -> System.out.println("aluuuuuuf");
            case "hani" -> System.out.println("100%");
            default -> System.out.println("you must remember your class mates");
        }

        switch (number){
            case 10 -> System.out.println(10);
            case 5 -> System.out.println(5555555);
            case  7,8,9-> System.out.println("5-10");
            case  1,2,3,4-> System.out.println("1-4");
            default -> System.out.println("please enter a number between 1-10 ");
        }




    }
}
