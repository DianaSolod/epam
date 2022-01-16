package by.epam.lab;

import java.util.*;
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
                trials.stream().filter(Trial::isPassed()).count());

        trials.sort((Trial t1, Trial t2) -> Integer.compare(t1.getSum(),t2.getSum()));

        System.out.println("\nSum of marks from sorted array:");
        trials.stream().map(Trial::getSum).forEach(System.out::println);

        System.out.println("\nUnpassed trials with cleared marks:");
        List<Trial> unpassed = trials.stream()
            .filter(trial -> !trial.isPassed())
            .map(Trial::clone())
            .peek(Trial::clearMarks())
            .peek(System.out::println)
            .collect(Collectors.toList());

        int sums[] = trials.stream().mapToInt(Trial::getSum).toArray();
        System.out.println(Arrays.stream(sums).mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));
    }
}
