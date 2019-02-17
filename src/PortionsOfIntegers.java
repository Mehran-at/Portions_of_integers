import java.util.*;

public class PortionsOfIntegers {

    static Set<List<Integer>> result = new HashSet();

    static Data_Class the_Beginning(int in) {
        List<Integer> emptyList = new ArrayList<>();
        emptyList.add(in);
        Data_Class out = new Data_Class(emptyList, 0, 1);
        return out;
    }

    static Data_Class Fill_with_nothingsness(Data_Class in) {
        if (in.liste.size() == in.liste.get(0)) {
            return in;
        } else {
            in.liste.add(0);
            return Fill_with_nothingsness(in);
        }
    }


    static Data_Class positronic_brain(Data_Class in) {
        if (in.liste.get(in.liste.size() - 1) == 1) {
            return in;
        }
        List rausListe = (List) ((ArrayList<Integer>) in.liste).clone();
        Data_Class out = new Data_Class(rausListe, in.index, in.range);
        if ((out.liste.size()) > (out.index + 1) && ((out.index + out.range) < out.liste.size())) {
            if (out.liste.get(out.index) >= 1 + in.liste.get(out.index + 1)) {

                out.liste.set(out.index, out.liste.get(out.index) - 1);
                out.liste.set(out.index + out.range, out.liste.get(out.index + out.range) + 1);
                List raus = ((List) ((ArrayList) out.liste).clone());
                Collections.sort(raus, Collections.reverseOrder());
                result.add(raus);
                positronic_brain(out);
            }
            out.range++;
            positronic_brain(out);
        }
        return in;
    }
}