public class Array {
    public static void main(String[] args){
        int []arr={1,2,3,4,5,};
        int []arrs={6,7,8,9,10};
        int []merge=new int[arr.length+arrs.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            merge[index]=arr[i];
            index++;
        }
        for(int i=0;i<arrs.length;i++){
            merge[index]=arrs[i];
            index++;
        }
        System.out.println("The merger array is : ");
        for(int i=0;i<merge.length;i++){
            System.out.println(merge[i]+" ");
        }
    }
}
