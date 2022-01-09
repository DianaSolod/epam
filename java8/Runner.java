package by.epam.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Trial> trials = new ArrayList<Trial>(Arrays.asList(
                new Trial("Sakovich", 45, 93),
                new Trial("Sergeev", 55, 50),
                new Trial("Stepanenko", 60, 90),
                new LiteTrial("Sergeev", 29, 95),
                new LiteTrial("Lis", 35, 68),
                new StrongTrial("Sakovich", 90, 90),
                new StrongTrial("Sergeev", 70, 57),
                new ExtraTrial("Stepanenko", 40, 50, 60),
                new ExtraTrial("Sakovich", 70, 51, 80)
        ));

        trials.forEach(System.out::println);

        System.out.println("\nNumber of passed trials:" +
                trials.stream().filter(trial -> trial.isPassed()).count());

        Collections.sort(trials);

        System.out.println("\nSum of marks from sorted array:");
        trials.stream().map(Trial::getSum).forEach(System.out::println);

        List<Trial> unpassed = trials.stream().filter(trial -> !trial.isPassed()).map(p -> p.clone()).collect(Collectors.toList());
        unpassed.forEach(Trial::clearMarks);
        System.out.println("\nUnpassed trials with cleared marks:");
        unpassed.forEach(System.out::println);

        int sums[] = trials.stream().mapToInt(Trial::getSum).toArray();
        System.out.println(Arrays.toString(sums));
    }
}
