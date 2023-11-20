public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(10, "Hello");
        System.out.println(pair1.getFirst()); // Выводит 10
        System.out.println(pair1.getSecond()); // Выводит Hello
        System.out.println(pair1); // Выводит (10, Hello)

        Pair<String, Double> pair2 = new Pair<>("Java", 3.14);
        System.out.println(pair2.getFirst()); // Выводит Java
        System.out.println(pair2.getSecond()); // Выводит 3.14
        System.out.println(pair2); // Выводит (Java, 3.14)
    }
}