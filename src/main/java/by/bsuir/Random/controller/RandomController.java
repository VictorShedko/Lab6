package by.bsuir.Random.controller;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import by.bsuir.Random.controller.mapings.MappingInt;
import by.bsuir.Random.controller.mapings.MappingIntWithNumber;
import by.bsuir.Random.entity.myRandom;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.springframework.web.bind.annotation.*;

@RestController
public class RandomController {
    myRandom random;

    @PostMapping(value = "/random")
    public List<Integer> getRandom(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
             MappingInt p = g.fromJson(jsonString, MappingInt.class);
            // JsonObject jsonObject=JSON.parse(jsonString);
            return p.getItemList().
                    stream().
                    map(u->random.getRand(u)).
                    collect(Collectors.toList());

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

            //List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


           // return inList.stream().map(u -> random.getRand(u)).distinct().collect(Collectors.toList());

        }

    }

    @PostMapping(value = "/randomAtNum")
    public Integer getRandomAt(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
            MappingIntWithNumber p = g.fromJson(jsonString, MappingIntWithNumber.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            return p.getItemList().
                    stream().
                    map(u->random.getRand(u)).
                    collect(Collectors.toList()).get(p.getNumber());

//            List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


 //           return inList.stream().map(u -> random.getRand(u)).collect(Collectors.toList());

        }

    }
    @PostMapping(value = "/randomNoRepit")
    public List<Integer> getRandomNoRepit(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
            MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            return p.getItemList().
                    stream().
                    map(u->random.getRand(u)).
                    distinct().
                    collect(Collectors.toList());

          //  List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


          //  return inList.stream().map(u -> random.getRand(u)).distinct().collect(Collectors.toList());

        }

    }
}
