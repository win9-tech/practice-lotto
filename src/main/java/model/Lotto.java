package model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        ascending(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    private void ascending(List<Integer> list){
        list.sort(Comparator.naturalOrder());
    }
    public String getLotto(){
        String output = numbers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    return "[" + output + "]";
    }
}
