package by.bsuir.Random.controller.mapings;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class MappingMatrix {
    @SerializedName("FirstMatrixRowNumber")
    private Integer FirstMatrixRowNumber ;
    @SerializedName("SecondMatrixRowNumber")
    private Integer SecondMatrixRowNumber ;
    @SerializedName("FirstMatrixColumnNumber")
    private Integer FirstMatrixColumnNumber ;
    @SerializedName("SecondMatrixColumnNumber")
    private Integer SecondMatrixColumnNumber ;
    @SerializedName("FirstMatrix")
    private double[][] FirstMatrix;
    @SerializedName("SecondMatrix")
    private double[][] SecondMatrix;

    public double[][] getFirstMatrix() {
        return FirstMatrix;
    }

    public double[][] getSecondMatrix() {
        return SecondMatrix;
    }

    public MappingMatrix(){
        super();

    }

}
