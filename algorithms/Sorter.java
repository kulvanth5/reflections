package algorithms;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Sorter {
    
    Strategy strategy;

    public void sort(double arr[],Strategy strategy){
        arr = strategy.sort_strategy(arr);
        System.out.println("using sort(arr,strategy)");
        //display(arr);
    }

    public void sort(double arr[]){
        arr = strategy.sort_strategy(arr);
        System.out.println("using sort(arr)");
        //display(arr);
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void display(double arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    public static double[] sorter(double arr[],String str){

        Sorter obj = new Sorter();
        
        if(str=="merge")
	        obj.sort(arr,new merge());

	    else if(str=="bubble")
	    	obj.sort(arr,new bubble());
	    	
	    else if(str=="insertion")
	    	obj.sort(arr,new Insertion());
	    
	    else
	        obj.setStrategy(new bubble());
    	    obj.sort(arr);

		//obj.display(arr);
		
        return arr;
    }
}
