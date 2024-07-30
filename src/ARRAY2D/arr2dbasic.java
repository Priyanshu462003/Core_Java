public class arr2dbasic {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4,5},{8,5,1,7,9},{5,6,2,0,7}};
        // int a[][]=new int[2][5];
        // int a[][];
        // a=new int[2][5];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Other");
        for(int x[]:a)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
