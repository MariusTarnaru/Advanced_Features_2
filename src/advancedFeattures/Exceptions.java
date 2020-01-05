package advancedFeattures;

public class Exceptions {

    public static void main(String[] args) {
        try {
            int x = 5 / 0;
            System.out.println("Aici nu se ajunge niciodata !");
        } catch (Exception e) {
            System.out.println("Am prins exceptia" + e);
        } finally {
            System.out.println("Aceasta bucata de cod se executa tot timpul,\nindiferent daca apare sau nu exceptia !");
        }

        int b = 4;

        try {
            int[] array = new int[3];
            array[4] = 4;
            int x = 10;
            if (x == 10){
                throw new RuntimeException(("Exceptie dorita !"));
            }
            x = b / 0;
            System.out.println("Aici nu se ajunge niciodata !");
        } catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
            System.out.println("Am prins exceptia" + e);
        } catch (Exception e) {
            System.out.println("Am prins exceptia" + e);
        } finally {
            System.out.println("Aceasta bucata de cod se executa tot timpul,\nindiferent daca apare sau nu exceptia !");
        }
    }
}
