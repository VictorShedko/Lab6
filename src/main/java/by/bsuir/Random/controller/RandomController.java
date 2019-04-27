package by.bsuir.Random.controller;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import by.bsuir.Random.entity.myRandom;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class RandomController {
    myRandom random;
    @PostMapping(value="/random")
    public List<Integer> getRandom(@RequestBody Integer[] jsonString ) {
        {

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

           List<Integer> inList=new ArrayList<Integer>(Arrays.asList(jsonString));



            return inList.stream().map(u->random.getRand(u)).collect(Collectors.toList());

        }


    }

    @PostMapping(value="/random1")
    public List<Integer> getRandomWithoutReapet(@RequestBody Integer[] jsonString ) {
        {

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

            List<Integer> inList=new ArrayList<Integer>(Arrays.asList(jsonString));



            return inList.stream().map(u->random.getRand(u)).distinct().collect(Collectors.toList());

        }



        @PostMapping(value="/random1")
        public List<Integer> getRandomWithoutReapet(@RequestBody Integer[] jsonString ) {
            {

                //Gson g=new Gson();
                //MappingInt p = g.fromJson(jsonString, MappingInt.class);
                //JsonObject jsonObject=JSON.parse(jsonString);
                //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

                List<Integer> inList=new ArrayList<Integer>(Arrays.asList(jsonString));



                return inList.stream().map(u->random.getRand(u)).distinct().collect(Collectors.toList());

            }

    }

        @PostMapping(value="/random2")
        public List<Integer> getRandomAt(@RequestBody Integer[] jsonString ) {
            {

                //Gson g=new Gson();
                //MappingInt p = g.fromJson(jsonString, MappingInt.class);
                //JsonObject jsonObject=JSON.parse(jsonString);
                //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

                List<Integer> inList=new ArrayList<Integer>(Arrays.asList(jsonString));



                return inList.stream().map(u->random.getRand(u)).distinct().collect(Collectors.toList()).add();

            }

}
