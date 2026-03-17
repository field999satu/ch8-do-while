void main() {
    Scanner input = new Scanner(System.in);
    int number1 = 50;
    int number2 = 10;
    int result = 0;
    int choice;

    do {
        IO.println("1. Add ");
        IO.println("2. Multiply ");
        IO.println("3. Subtract ");
        IO.println("0. Exit");
        IO.print("Please Choose (Number) : ");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 * number2;
                break;
            case 3:
                result = number1 - number2;
                break;
            default:
                result = 0;
                break;
        }
        IO.println("Result : " + result);
    } while (choice != 0);
}