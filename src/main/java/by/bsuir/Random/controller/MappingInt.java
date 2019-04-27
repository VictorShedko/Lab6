package by.bsuir.Random.controller;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class MappingInt {

    @SerializedName("ItemList")
    private List<Integer> itemList ;

    public List<Integer> getItemList() {
        return  this.itemList;
    }

    public void setItemList(List<Integer> itemList) {
        this.itemList = itemList;
    }
    public MappingInt(List<Integer> inList){
        setItemList(inList);

    }
    public MappingInt(){
        super();

    }

}
