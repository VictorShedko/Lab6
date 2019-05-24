package by.bsuir.Random.entity;


import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
public class myRandom {

    public static Integer[][] getRand(Integer[][] FirstMatrix, Integer[][] SecondMatrix) {


        Integer[][] result = Arrays.stream(FirstMatrix).map(raw -> IntStream.range(0, SecondMatrix[0].length).map(i ->
                        IntStream.range(0, SecondMatrix.length).map(j -> raw[j] * SecondMatrix[j][i]).sum()
                ).toArray()).toArray(Integer[][]::new);

        return result;
    }
}