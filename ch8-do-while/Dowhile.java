import java.util.Scanner;

void main() {
    int number1 = 5;
    int number2 = 10;
    int result = 0;
    Scanner input = new Scanner(System.in);
    int choice;

    do {
        System.out.println("1. Add ");
        System.out.println("2. Multiply ");
        System.out.println("3. Subtract ");
        System.out.println("0. Exit ");
        System.out.println("Please Choose (number)");

        choice = input.nextInt();

        switch(choice){
            case 1: result = number1 + number2; break;
            case 2: result = number1 * number2; break;
            case 3: result = number1 - number2; break;
            default: result = 0; break;
        }

        System.out.println("result : " + result);

    } while (choice != 0);
}