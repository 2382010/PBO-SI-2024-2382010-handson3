package handson1;

public class DoWhile {
    public static void main(String[] args) {
        String[] JenisBuah = { "Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        do {
            System.out.println("Elemen ke " + (counter + 1)+ " adalah : " + JenisBuah[counter]);
            counter++;
        } while (counter < JenisBuah.length);
    }
}
