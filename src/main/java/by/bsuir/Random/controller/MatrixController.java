package by.bsuir.Random.controller;



import by.bsuir.Random.controller.mapings.ListMapping;
import by.bsuir.Random.controller.mapings.MappingListOfList;
import by.bsuir.Random.controller.mapings.MappingMatrix;
import by.bsuir.Random.entity.MatrixMultiplier;
import by.bsuir.Random.entity.primaryNumberMull;
import com.google.gson.Gson;
import by.bsuir.Random.entity.Summ;
import by.bsuir.Random.entity.CollectionToSet;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class MatrixController {
    MatrixMultiplier Multiplier;
    primaryNumberMull   primaryMull;
    CollectionToSet collectiotoSet;
    Summ sumMatrix;
    @PostMapping(value = "/mul")
    public double[][] mulMatrix(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
            MappingMatrix p = g.fromJson(jsonString, MappingMatrix.class);
            // JsonObject jsonObject=JSON.parse(jsonString);

            return Multiplier.mul(p.getFirstMatrix(),p.getSecondMatrix());

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

            //List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


           // return inList.stream().map(u -> random.getRand(u)).distinct().collect(Collectors.toList());

        }

    }

    @PostMapping(value = "/mul10")
    public List<Integer> mulCollection(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
            ListMapping p = g.fromJson(jsonString, ListMapping.class);
            // JsonObject jsonObject=JSON.parse(jsonString);

            return primaryMull.mul(p.getCollection());

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

            //List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


            // return inList.stream().map(u -> random.getRand(u)).distinct().collect(Collectors.toList());

        }

    }


    @PostMapping(value = "/toset")
    public Set<Integer> collectionToset(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
            ListMapping p = g.fromJson(jsonString, ListMapping.class);
            // JsonObject jsonObject=JSON.parse(jsonString);

            return collectiotoSet.toSet(p.getCollection());

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

            //List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


            // return inList.stream().map(u -> random.getRand(u)).distinct().collect(Collectors.toList());

        }

    }
    @PostMapping(value = "/sum")
    public Integer sumL(@RequestBody String jsonString) {
        {

            Gson g=new Gson();
            MappingListOfList p = g.fromJson(jsonString, MappingListOfList.class);
            // JsonObject jsonObject=JSON.parse(jsonString);

            return sumMatrix.sum(p.getCollection());

            //Gson g=new Gson();
            //MappingInt p = g.fromJson(jsonString, MappingInt.class);
            //JsonObject jsonObject=JSON.parse(jsonString);
            //return p.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());

            //List<Integer> inList = new ArrayList<Integer>(Arrays.asList(jsonString));


            // return inList.stream().map(u -> random.getRand(u)).distinct().collect(Collectors.toList());

        }

    }


}
