
package kata2v3y4;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    
     private final int[] data;


    public Histogram(int[] data) {
        this.data = data;
    }
    
    public int[] getArray() {
        return data;
    }
    
    public Map<Integer,Integer> getHistogram(){
        Map <Integer,Integer> datos = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(datos.containsKey(data[i])){
                datos.put(data[i], datos.get(data[i])+1);
            }else{
                datos.put(data[i], 1);
            }
        }
        return datos;
    }
    
}
