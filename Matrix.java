
public class Matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,0,0},{0,1,0},{0,0,1}};
        int c[][]=new int[3][3];
        int d[][]=new int[3][3];
        // Matrix Multiplication
        System.out.println("Matrix Multiplication");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println(); 
        }
        // Matrix Addition
        System.out.println("Matrix Addition");
        for(int i =0; i<3;i++){
            for(int j=0;j<3;j++){
              d[i][j]=a[i][j]+b[i][j];
              System.out.print(d[i][j]+ " ");
            }
            System.out.println();
        }
    }  
}

