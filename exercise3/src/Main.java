import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = List.of(4, 9, 7, 15, 10);
        int begin = 1;
        int end = 5;
        Integer max = getMaxElement(intList, begin, end);
        System.out.printf("Maximal element in range (" + begin + ", " + end + ") of list " + intList + " is " + max);
    }

    public static <T extends Comparable<T>> T getMaxElement(List<T> list, int begin, int end) {
        if (begin >= end) {
            throw new IllegalArgumentException("Invalid interval. Begin index must be less than end index");
        }
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }
}