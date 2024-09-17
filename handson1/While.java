package handson1;

public class While {
    public static void main(String[] args) {
        String[] JenisBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        int counter = 0;
        while (counter < JenisBuah.length) {
            System.out.println(" Elemen ke " + (counter + 1) + "adalah : " + JenisBuah[counter]);
            counter++;
        }
    }
}
