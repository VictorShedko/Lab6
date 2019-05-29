package by.bsuir.Random.controller.mapings;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MappingListOfList {
    @SerializedName("Collection")
    private List<List<List<Integer>>> collection;

    public List<List<List<Integer>>> getCollection() {
        return collection;
    }
}
