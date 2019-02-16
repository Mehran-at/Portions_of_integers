import java.util.*;

public class Genesis {

    static Set<List<Integer>> Ergebnis = new HashSet();

    static Data_Class the_Beginning(int eini) {
        List<Integer> leereListe = new ArrayList<>();
        leereListe.add(eini);
//        System.out.println("leereListe.size" + leereListe.size());
//        System.out.println("leereListe.get(0)" + leereListe.get(0));
        Data_Class aussi = new Data_Class(leereListe, 0, 1);
        return aussi;
    }

    static Data_Class Fill_with_nothingsness(Data_Class eini) {
        if (eini.liste.size()
                ==
                eini.liste.get(0)) {
            return eini;
        } else {
            eini.liste.add(0);
            return Fill_with_nothingsness(eini);
        }
    }

    static Data_Class heisenbergkompensator(Data_Class eini) {
//        System.out.println("XXX eini.index " + eini.index);
        if (eini.liste.get(eini.liste.size() - 1) == 1) {
            System.out.println("des do");
            return eini;
        }
        if (((eini.index + 1) < eini.liste.size()) && ((eini.index + eini.range) < eini.liste.size())) {
            System.out.println("platz einhalb");
            if (eini.liste.get(eini.index) > 1 + eini.liste.get(eini.index + eini.range)) {
                eini.liste.set(eini.index, eini.liste.get(eini.index) - 1);
                eini.liste.set(eini.index + eini.range, eini.liste.get(eini.index + eini.range) + 1);
                System.out.println(eini.liste);
                System.out.println("platz eins");
                positronic_brain(eini);
                heisenbergkompensator(eini);
            }
            eini.index++;
            System.out.println("platz zwei");
            positronic_brain(eini);
            heisenbergkompensator(eini);
        }
        return eini;
    }

    static Data_Class positronic_brain(Data_Class eini) {

//        System.out.println("XXX eini.index " + eini.index);
        if (eini.liste.get(eini.liste.size() - 1) == 1) {
//            System.out.println("des do");
            return eini;
        }

        List rausListe = (List) ((ArrayList<Integer>) eini.liste).clone();
        Data_Class aussi = new Data_Class(rausListe, eini.index, eini.range);
        if ((aussi.liste.size()) > (aussi.index + 1) && ((aussi.index + aussi.range) < aussi.liste.size())) {
            if (aussi.liste.get(aussi.index) >= 1 + eini.liste.get(aussi.index + 1)) {

                aussi.liste.set(aussi.index, aussi.liste.get(aussi.index) - 1);
                aussi.liste.set(aussi.index + aussi.range, aussi.liste.get(aussi.index + aussi.range) + 1);
                List raus = ((List) ((ArrayList) aussi.liste).clone());
                                Collections.sort(raus, Collections.reverseOrder());
//                System.out.println(aussi.liste);
                Ergebnis.add(raus);
                positronic_brain(aussi);
            }
            aussi.range++;
            //       eini.index++;
            positronic_brain(aussi);
        }
 //       System.out.println("das Ende");
        return eini;
    }
}