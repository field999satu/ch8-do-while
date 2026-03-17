public class BreakCintinue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("พบเลข 5 แล้ว หยุด!");
                break;
            }
            System.out.println("i = " + i);
        }

    }
}