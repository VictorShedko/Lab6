package by.bsuir.Random.controller.mapings;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class MappingIntWithNumber {
    @SerializedName("Number")
    private Integer number ;
    @SerializedName("ItemList")
    private List<Integer> itemList ;

    public Integer getNumber() {
        return number;
    }

    public List<Integer> getItemList() {
        return  this.itemList;
    }

    public void setItemList(List<Integer> itemList) {
        this.itemList = itemList;
    }
    public MappingIntWithNumber(List<Integer> inList){
        setItemList(inList);

    }
    public MappingIntWithNumber(){
        super();

    }

}
