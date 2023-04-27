package algorithms;

public class bubble implements Strategy{

    public double[] sort_strategy(double[] arr) {
        
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
