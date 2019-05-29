package by.bsuir.Random.entity;



import java.beans.Expression;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class primaryNumberMull {
    //private static UnaryOperator<Integer> MullIfPrime;

    public static   List<Integer> mul(List<Integer> inCollection) {
        int size=inCollection.size();
        UnaryOperator<Integer> MullIfPrime=(x)-> {

            BigInteger bigInteger = BigInteger.valueOf(x);
            if (bigInteger.isProbablePrime(x))return  x*10;
            return x;
        };
        List<Integer> evenList=new ArrayList<>();
            for (int i=0;i<size;i=i+2){
                evenList.add(inCollection.get(i));
            }

                List<Integer> s=evenList.stream().map(f->MullIfPrime.apply(f)).collect(Collectors.toList());
        for (int i=0;i<size;i=i+2){
            inCollection.remove(i);
            inCollection.add(i,s.get(i/2));

        }
            return inCollection;
        }



    public static   List<Integer> mul2(List<Integer> inCollection) {
        int size=inCollection.size();
        BinaryOperator<Integer> MullIfPrime=(x,num)-> {

            BigInteger bigInteger = BigInteger.valueOf(x);
            if (bigInteger.isProbablePrime(x)&&num%2==0)return  x*10;
            return x;
        };

        return IntStream.range(0,inCollection.size()).map(f->MullIfPrime.apply(inCollection.get(f),f)).boxed().collect(Collectors.toList());
    }

    }

