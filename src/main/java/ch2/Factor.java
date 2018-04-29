package ch2;

import java.util.ArrayList;
import java.util.List;

public class Factor {
    public static List<Integer> factor(int x){
        List<Integer> re = new ArrayList<>();
        for(int k=2;k<x;k++){
            while(x%k==0){
                re.add(k);
                x/=k;
            }

        }
        if(x>1) re.add(x);
        return re;
    }

}
