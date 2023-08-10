import modules.DataReader;

public class Main {
    public static void main(String[] args) {
        int[] vetor = DataReader.readInt("Teste reader: ", 5);
        for (int number : vetor) {
            System.out.println(number);
        }
    }
}
