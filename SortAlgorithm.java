public class SortAlgorithm{
    import java.util.Arrays;

public class mergeA{
    public static void mergeSort(int[] ints, int leftStrat, int rightEnd){
        if(leftStrat == rightEnd){
            return;
        }
        int leftEnd =(rightEnd -leftStrat) /2 + leftStrat;
        mergeSort(ints, leftStrat,leftEnd);
        mergeSort(ints, leftEnd+1, rightEnd);
        merge(ints, leftStrat, leftEnd, rightEnd);
    }
    public static void merge(int[] ints, int leftStrat, int leftEnd, int rightEnd){
            int[] temp= new int[rightEnd - leftStrat +1];
            int l =leftStrat;
            int r=leftEnd+1;
            int index=0;
            while(l<=leftEnd && r<= rightEnd){
                if(ints[l]< ints[r]){
                    temp[index]=ints[l];
                    index++;
                    l++;
                }else if(ints[r]<ints[l]){
                    temp[index]=ints[l];
                    index++;
                    r++;
                }else{
                    temp[index]=ints[l];
                    index++;
                    l++;
                } 
            }
            while(l<=leftEnd){
                temp[index]=ints[l];
                index++;
                l++;
            }
            while(r<=rightEnd){
                temp[index]=ints[r];
                index++;
                l++;
            }
            for(int i=0; i< temp.length; i++){
                ints[leftStrat + i]=temp[i];    
                }
    }
    public static void print(int[] ints){
        for(int e : ints){
            System.out.print(e+" ");
        }
    }
    public static void main(String[] args) {
        int[] ints= {1,-3,-1,5};
        merge(ints,0,1,3);
        print(ints);
    }
}
}
