package org.example.lambda.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streams {

    public static void main(String[] args) {

        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        List<Integer> numeritos = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 5, 5, 45, 149, 149, 400));

        long filtrados = numeritos.stream()
                .filter(nums -> nums > 10)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(filtrados);

        List<String> pueblos = new ArrayList<>(Arrays.asList("Elche", "San Vicente", "Mutxamel", "Eliana"));

        pueblos.stream()
                .sorted()
                .distinct()
                .forEach(System.out::println);

    }

}
