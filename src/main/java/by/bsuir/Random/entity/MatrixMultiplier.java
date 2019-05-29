package by.bsuir.Random.entity;


import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.List;
public class MatrixMultiplier {

    public static double[][] mul(double[][] FirstMatrix, double[][] SecondMatrix) {




        double[][] result = Arrays.stream(FirstMatrix).map(raw ->
                IntStream.range(0, SecondMatrix[0].length).mapToDouble(i ->
                        IntStream.range(0, SecondMatrix.length).mapToDouble(j -> raw[j] * SecondMatrix[j][i]).sum()
                ).toArray()).toArray(double[][]::new);

        return result;
    }
}