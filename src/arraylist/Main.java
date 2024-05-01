package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Cesar", "Platon", "Alba"};
        String[] names2 = new String[3];
        List<String> partyInvites = new ArrayList<>();
//        var lottoNumbers = new ArrayList<Integer>();
        System.out.println(partyInvites.size());
        partyInvites.add("Bezos");
        partyInvites.add("Mary");
        partyInvites.add("Paul");
        System.out.println(partyInvites.size());
        partyInvites.remove(0);
        System.out.println(partyInvites.size());
        System.out.println(partyInvites);
        partyInvites.add("Marta");
        System.out.println(partyInvites.get(2));
        for (String name : partyInvites) {
            System.out.println(name);
        }
        partyInvites.set(2, "Terri");
        System.out.println(partyInvites);


        var lottoNumbers = new ArrayList<Integer>();
        var lottoNumbers2 = new ArrayList<>(List.of(1, 2, 3));
        partyInvites.remove(1);
        System.out.println(partyInvites);

        partyInvites.addAll(List.of(names));
//        partyInvites.remove(2);
        System.out.println(partyInvites);
    }
}