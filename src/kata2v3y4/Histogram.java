
package kata2v3y4;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    
     private final T[] data;


    public Histogram(T[] data) {
        this.data = data;
    }
    
    public T[] getArray() {
        return data;
    }
    
    public Map<T,Integer> getHistogram(){
        Map <T,Integer> datos = new HashMap<>();
        for (T i : data) {
            
                datos.put(i, datos.containsKey(i) ? datos.get(i) + 1 : 1);
        }
        return datos;
    }
    
}
