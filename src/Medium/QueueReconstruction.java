package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstruction {
    public static void main(String[] args){
        int[][] queue = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        Arrays.sort(queue, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?-o1[0]+o2[0]:o1[1]-o2[1];
            }
        });

/*        Arrays.sort(queue, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]>o2[1]){
                    return 1;
                }else{
                    return -1;
                }
            }
        });*/


     //   insertionSort(queue);
        for(int i=0;i<queue.length;i++){
            for (int j=0;j<queue[i].length;j++){
                System.out.print(queue[i][j]);
            }
            System.out.println();
        }

    }

    private static void insertionSort(int[][] queue) {
        int value = 0,value1 =0;
        int hole = 0;
        for(int i=1;i<queue.length;i++){
            value = queue[i][0];
            value1 = queue[i][1];
            hole = i;
            while(hole>0 && queue[hole-1][0]>=value && queue[hole-1][1]<=value1 ){
                queue[hole][0] = queue[hole-1][0];
                queue[hole][1] = queue[hole-1][1];
                hole--;
            }
            queue[hole][0] = value;
            queue[hole][1] = value1;
        }
    }
}
