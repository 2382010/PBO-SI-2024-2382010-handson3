package handson1;

public class For {
    public static void main(String[] args) {
        String[] JenisBuah = {"Apel", "Pisang", "Mangga", "Jeruk", "Durian", "Anggur"};
        for (int i = 0; i < JenisBuah.length; i++) {
            if (i == 3){
                break;
            }
            System.out.println("Elemen ke " + (i+1) + " adalah : " + JenisBuah[i]);
        }
    }
}
