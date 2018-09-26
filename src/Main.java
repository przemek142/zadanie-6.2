public class Main {
    public static void main(String[] args) {
        int number = 111111, numberSaved, suma = 0,  range=10;
        numberSaved = number;
        while (number / range != 0) {
            range *= 10;
        }
        range /= 10;

        while (10 <= range) {
            suma += number / range;
            number -= range * (number / range);
            range /= 10;
        }
        suma += (number / range);
        System.out.println("Liczba: " + numberSaved + ", suma: " + suma);
    }
}
