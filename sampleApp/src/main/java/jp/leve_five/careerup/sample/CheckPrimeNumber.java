package jp.leve_five.careerup.sample;

import java.util.ArrayList;

public class CheckPrimeNumber {
    
    public int inputOutput(int maximum){
       ArrayList<Integer> primeNumberList = new ArrayList<Integer>(1);
        primeNumberList.add(2);
        
        if(maximum <= 2){
            return 0;
        }
        for(int current = 2; current < maximum; current++){
            boolean primeNumber = checkNumber(current, primeNumberList);
            if(primeNumber){
                primeNumberList.add(current);
            }
        }
        return primeNumberList.size();
    }
    
    private boolean checkNumber(int current, ArrayList<Integer> primeNumberList){
        boolean primeNumber = true; 
        for(int index = 0; primeNumberList.size() - 1 >= index; index++){
            if(current % primeNumberList.get(index) == 0){
                primeNumber = false;
                break;
            }
        }
        return primeNumber;
    }
    
    
    
}
