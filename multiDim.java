public class multiDim {
    public static void main(String[] args){
        int[][] myNumber ={{1,2,3,4},{5,6,7}};
        for(int i=0;i<myNumber.length;++i){
            for(int j=0;j<myNumber[i].length;++j){
                System.out.println(myNumber[i][j]);
            }
        }
    }
}
