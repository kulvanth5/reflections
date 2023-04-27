package algorithms;

public  class Insertion implements Strategy
{
    public double[] sort_strategy(double[] arr)
    {    
        double n = arr.length;
        int iter=1;
        double temp=0.0;
        
        for(iter=1;iter<n;iter++)
        {
           temp=arr[iter];
           int i;
           for(i=iter-1;i>=0;i--)
           {
           		if(temp>=arr[i])
           			break;
                    
           		else
           			arr[i+1]=arr[i];
           }
           arr[i+1] = temp;
        }
        return arr;
    }
}
