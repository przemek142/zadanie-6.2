public class Main {
    public static void main(String[] args) {
        int number = 111111, numberSaved, suma = 0, mod = 10, range;
        numberSaved = number;
        while (number / mod != 0) {
            mod *= 10;
        }

        range = (mod / 10);
        mod = 10;

        while (mod <= range) {
            suma += (number / range);
            number -= (range * (number / range));
            range /= 10;
        }
        suma += (number / range);
        System.out.println("Liczba: " + numberSaved + ", suma: " + suma);
    }
}
