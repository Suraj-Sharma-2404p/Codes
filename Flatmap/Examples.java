package Flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
        List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
        List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
        List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
        List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
        List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
        List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
        List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

        // before java 8 streams
        List<List<String>> playersInWorldCup2016  = new ArrayList<>();
        playersInWorldCup2016.add(teamIndia);
        playersInWorldCup2016.add(teamAustralia);
        playersInWorldCup2016.add(teamEngland);
        playersInWorldCup2016.add(teamNewZeland);
        playersInWorldCup2016.add(teamSouthAfrica);
        playersInWorldCup2016.add(teamWestIndies);
        playersInWorldCup2016.add(teamSriLanka);
        playersInWorldCup2016.add(teamPakistan);
        System.out.println(playersInWorldCup2016);

        List<String> listOfPLayers = new ArrayList<>();
        for (List<String> team : playersInWorldCup2016){
            for (String name : team){
                listOfPLayers.add(name);
            }
        }
        System.out.println(listOfPLayers);

        // with the help of java streams

        List<String> namesOfAllPlayers = playersInWorldCup2016.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println("the resultant list is :");
        System.out.println(namesOfAllPlayers);




    }
}
