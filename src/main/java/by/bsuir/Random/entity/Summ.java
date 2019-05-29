package by.bsuir.Random.entity;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

public class Summ {
   static public Integer sum(List<List<List<Integer>>> InCollection) {



        return    InCollection.stream().mapToInt(listOfList->listOfList.stream().mapToInt(lList->lList.stream().mapToInt(Integer::intValue).sum()).sum()).sum();

    }


}
