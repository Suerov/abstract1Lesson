public class ArraySum extends  ForSum{

    @Override
    public int getSumArr(int[] arr) {
        int sum= 0;
        for (int a:arr) {
            sum+=a;
        }
                return sum ;
    }
}
