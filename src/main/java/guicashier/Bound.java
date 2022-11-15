package guicashier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bound {
    private String dataOrderTemp;
    
    Bound(){
        this.dataOrderTemp = "";
    }
    
    public String getDataOrderTemp() {
        return dataOrderTemp;
    }

    public void setDataOrderTemp(String dataOrder) {
        this.dataOrderTemp = dataOrder;
    }    
}
