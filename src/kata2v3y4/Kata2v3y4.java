package kata2v3y4;

import java.util.Arrays;
import java.util.Map;


public class Kata2v3y4 {

    
    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogram = histo.getHistogram();
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
        System.out.println("=============");
        System.out.println(Arrays.asList(histogram));
        System.out.println("=============");
        System.out.println(histogram.entrySet());
    }
    
}
