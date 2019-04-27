package by.bsuir.Random.controller;



import java.util.List;
import java.util.stream.Collectors;

import by.bsuir.Random.entity.myRandom;
import org.springframework.web.bind.annotation.*;

@RestController
public class RandomController {
    myRandom random;
    @PostMapping(value="/random")
    public List<Integer> getRandom(@RequestBody MappingInt mappingInt ) {
        {

            int test;
            test=3;
            return mappingInt.getItemList().stream().map(u->random.getRand(u)).collect(Collectors.toList());


        }


    }
}
