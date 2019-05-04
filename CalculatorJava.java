import java.util.Scanner;
public class CalculatorJava {
           public static void main(String args[]){
            int rez;
            Scanner sc = new Scanner(System.in);
            // input first number
            int num1=0;
            System.out.print("Введите для первого числа любое целое число от 1 до 10: ");
            num1 = sc.nextInt();
            while  (num1 < 1 || num1 >10 )
            {
                System.out.println("Вы ввели неверное число " + num1+" повторите ввод");
                try {num1 = sc.nextInt();}
                catch(Exception e) {continue;}
            }
            if (num1 > 0|| num1 <11)
            {System.out.println ("Вы ввели число " + num1);}

            // input second number
            int num2=0;
            System.out.print("Введите для второго числа любое целое число от 1 до 10: ");
            num2 = sc.nextInt();
            while  (num2 < 1 || num2 >10 )
            {
                System.out.println("Вы ввели неверное число " + num2+" повторите ввод");
                try {num2 = sc.nextInt();}
                catch(Exception e) {continue;}
            }
            if (num2 > 0|| num2 <11)
            {System.out.println ("Вы ввели число " + num2);}


            //  mathematic operation

            System.out.println("Укажите операцию: * или / или + или -");
            Scanner op = new Scanner(System.in);
            String operation = op.next();
            System.out.println(operation);
            switch(operation)
            {
                case "+":
                    rez=num1+num2;
                    System.out.println(num1+"+"+num2+"="+rez);
                    break;
                case "-":
                    rez =num1-num2;
                    System.out.println(num1+"-"+num2+"="+rez);
                    break;
                case "*":
                    rez =num1*num2;
                    System.out.println(num1+"*"+num2+"="+rez);
                    break;
                case "/":
                    if(num2 == 0) System.out.println("Нельзя делить на ноль");
                    else {
                        rez =num1/num2;
                        System.out.println(num1+"/"+num2+"="+rez);
                        break;
                    }
                    break;
                default :
                    System.out.println("Неверная информация");
            }


        }

    }





