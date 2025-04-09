import java.util.Scanner;

public class Calculator {
    public void Calc(){
        Scanner sc = new Scanner(System.in);
        boolean canCalculate = true;

        System.out.println("Простой калькулятор");
        System.out.println("Введите exit для выхода");

        while(true){
            String input;
            canCalculate = true;

            System.out.println("Введите первое число (или exit для выхода): ");

            input = sc.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Калькулятор завершён");
                break;
            }

            double firstNumber;
            try{
                firstNumber = Double.parseDouble(input);
            }catch (NumberFormatException e){
                System.out.println("Ошибка: введите корректное число.");
                continue;
            }

            System.out.println("Введите оператор (+,-,*,/): ");
            String operator = sc.nextLine();

            System.out.println("Введите второе число: ");
            double secondNumber;
            try{
                secondNumber = Double.parseDouble(sc.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Ошибка: введите корректное число.");
                continue;
            }

            switch(operator){
                case "+":
                    firstNumber += secondNumber;
                    break;
                case "-":
                    firstNumber -= secondNumber;
                    break;
                case "*":
                    firstNumber *= secondNumber;
                    break;
                case "/":
                    if(secondNumber == 0){
                        System.out.println("Ошибка деления на ноль");
                        canCalculate = false;
                    }else {
                        firstNumber /= secondNumber;
                    }
                    break;
                default:
                    System.out.println("Неизвестный тип оператора");
                    canCalculate = false;
            }

            if(canCalculate){
                System.out.println("Результат = " + firstNumber);
            }

        }

        sc.close();
    }
}
