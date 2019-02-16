import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        System.out.println(Genesis.the_Beginning(10));
//        System.out.println(Genesis.Fill_with_nothingsness(Genesis.the_Beginning(10)).liste);
//        Genesis.heisenbergkompensator(Genesis.Fill_with_nothingsness(Genesis.the_Beginning(12)));
        Genesis.positronic_brain(Genesis.Fill_with_nothingsness(Genesis.the_Beginning(50)));

        Genesis.Ergebnis.stream()
////                .sorted(Comparator.comparingInt(Object::hashCode))
                .sorted(Comparator.comparing(o-> o.toString()))
                .sorted(Comparator.comparing(o-> o.get(0)))
//                .collect(Collectors.toList());
                .forEach(System.out::println);
//        List<List<Integer>> list = new ArrayList<List<Integer>>(Genesis.Ergebnis);
//        list.sort(o.);
//        System.out.println(list.get(0).get(0));
    }
}
