package ppj09;

public class Exercise7 {
    public static void swap(int[] tab, int source, int destination) {
        int tmp = tab[destination];
        tab[destination] = tab[source];
        tab[source] = tmp;
    }
}