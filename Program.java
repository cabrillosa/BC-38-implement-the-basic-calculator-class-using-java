import java.util.*;

class Program
{
    public static void main(String[] args)
    {
        //scanner class to accept input from keyboard
        Scanner sc = new Scanner(System.in);
        //create an instance of our class
        Calculator calc = new Calculator();

        //get first number
        System.out.print("Enter first number:");
        calc.setFirstNumber(sc.nextDouble());

        //get second number
        System.out.print("Enter second number:");
        calc.setSecondNumber(sc.nextDouble());

        //get operator
        System.out.print("Enter operations (+ - * /):");
        char operator = sc.next().charAt(0);
        
        double result = calc.calculate(operator);

        System.out.println("Output:");
        System.out.println(calc.getFirstNumber() + " "+operator +" "+
        calc.getSecondNumber()+ " = " + result);
        
    }
}

class Calculator
{
    private double first_number;
    private double second_number;

    public void setFirstNumber(double first_number)
    {
        this.first_number = first_number;
    }

    public double getFirstNumber()
    {
        return this.first_number;
    }

    public void setSecondNumber(double second_number)
    {
        this.second_number = second_number;
    }

    public double getSecondNumber()
    {
        return this.second_number;
    }

    public double calculate(char operator)
    {
        double result = 0;

        switch(operator)
        {
            case '+': result = this.first_number + this.second_number;  break;
            case '-': result = this.first_number - this.second_number;  break;
            case '*': result = this.first_number * this.second_number;  break;
            case '/': result = this.first_number / this.second_number;  break;
            default:{
                System.out.println("Operator is not valid!");
                break;
            }
        }
        return result;
    }

}
