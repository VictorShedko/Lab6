package by.bsuir.Random.controller.mapings;


import com.google.gson.annotations.SerializedName;
import java.util.List;
public class ListMapping {

    @SerializedName("Collection")
    private List<Integer> collection;

    public List<Integer> getCollection() {
        return collection;
    }

    public ListMapping(){
        super();

    }

}