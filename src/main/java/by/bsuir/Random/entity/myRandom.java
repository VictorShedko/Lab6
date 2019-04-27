package by.bsuir.Random.entity;


import java.util.Random;

public class myRandom {

    public static int getRand(int Max){
             Random r = new Random();
            return r.nextInt(Max);
          }
}
