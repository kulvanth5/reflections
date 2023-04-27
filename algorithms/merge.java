package algorithms;

public class merge implements Strategy{


    public double[] sort_strategy(double[] arr) {
        
        int start = 0,end=arr.length - 1;
        return merge_sort(arr,start,end);
    }
    
    public double[] merge_sort(double[] arr,int start,int end){

        if(start == end){
            double temp[] = {arr[start]};
            return temp;
        }

        int mid = (start+end)/2;
        double[] arr1 = merge_sort(arr,start,mid);
        double[] arr2 = merge_sort(arr, mid+1, end);
        return merge_subarrays(arr1,arr2);
    }

    public double[] merge_subarrays(double arr1[],double arr2[]){

       int l1 = arr1.length , l2 = arr2.length , i1 = 0 , i2 = 0;
       double final_array[] = new double[l1+l2];

       for(int i=0;i<final_array.length;i++){

            if( i1 == l1){
                final_array[i] = arr2[i2];
                i2++;
            }

            else if( i2 == l2 ){
                final_array[i] = arr1[i1];
                i1++;
            }

            else if( arr1[i1] > arr2[i2] ){
                final_array[i] = arr2[i2];
                i2++;
            }
            else{
                final_array[i] = arr1[i1];
                i1++;
            }
       }
        return final_array;
    }
}
