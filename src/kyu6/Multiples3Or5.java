package kyu6;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class Multiples3Or5 {
    
    private final Set<Integer> set = new HashSet();
    
    public int solution(int number) {    

//        return IntStream.range(0, number)
//                .filter((num) -> (num % 5 == 0) || (num % 3 == 0))
//                .sum();
        
        for (int i = 1; i < number; i++) {
            if(i % 5 == 0) set.add(i);
            if(i % 3 == 0) set.add(i);
        }

        return set.stream()
                 .reduce(0, (acc, el) -> acc + el);
    }

}
