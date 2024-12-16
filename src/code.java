import java.util.Random;

public class code {
    public static void main(String[] args) {
        Random obj = new Random();
        int n = 5;
        int arr[][] = new int[n][n];
        int result[][] = new int[n][n];

         for (int i = 0;i<arr.length ;i++ ){
           for (int j = 0;j< arr[0].length ;j++ ){
               arr[i][j] = obj.nextInt(10);
               System.out.print(arr[i][j]+"\t");


            }
             System.out.println("");
         }
        System.out.println("90 deg rotated");
        for (int i = 0;i<arr.length ;i++ ){
            for (int j =  arr[0].length -1; j>=0;j-- ){
                for(int k = 0 ;k<arr[0].length;k++){
                    result[k][j] = arr[arr[0].length-1-j][k];
                }



            }
        }
        for (int i = 0;i<arr.length ;i++ ){
            for (int j = 0;j< arr[0].length ;j++ ){

                System.out.print(result[i][j]+"\t");


            }
            System.out.println("");
        }


    }
}