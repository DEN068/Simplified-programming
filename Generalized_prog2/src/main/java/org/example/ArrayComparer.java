public class ArrayComparer {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] arrayInt1 = {1, 2, 3, 4, 5};
        Integer[] arrayInt2 = {1, 2, 3, 4, 5};
        System.out.println(compareArrays(arrayInt1, arrayInt2)); // Выводит true

        String[] arrayStr1 = {"a", "b", "c"};
        String[] arrayStr2 = {"a", "b", "d"};
        System.out.println(compareArrays(arrayStr1, arrayStr2)); // Выводит false
    }
}
