void main() {
    int i;

    for (i = 0; i < 10; i++) {
        if (i == 5) {
            System.out.println("พบเลข 5 แล้วหยุด!");
            break;
        }
    }

    System.out.println("i = " + i);
}