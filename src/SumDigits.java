public class SumDigits {
    public int sumAllDigits(int number){
        int range=10, suma=0;
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
        return suma;
    }
}
