import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        PortionsOfIntegers.positronic_brain(PortionsOfIntegers.Fill_with_nothingsness(PortionsOfIntegers.the_Beginning(10)));

        PortionsOfIntegers.Ergebnis.stream()
                .sorted(Comparator.comparing(o-> o.toString()))
                .sorted(Comparator.comparing(o-> o.get(0)))
                .forEach(System.out::println);
    }
}
