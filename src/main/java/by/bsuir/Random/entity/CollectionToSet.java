package by.bsuir.Random.entity;

import java.math.BigInteger;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Collectors;
import java.util.List;
public class CollectionToSet {


    public static Set<Integer> toSet(List<Integer> inCollection) {
        return inCollection.stream().collect(Collectors.toSet());
    }
}
