package common.exArray;

public class Array {
    public static void main (String [] args){
    int [] nums = {1,2,3,4,5};
        System.out.println(nums[4]);//5
        System.out.println(nums.length);//5
        System.out.println(nums[nums.length-1]);//5

        int [] nums2 = new int [4];
        nums2 [0] = 11;
        nums2 [1] = 12;
        nums2 [2] = 13;
        nums2 [3] = 14;
        System.out.println(nums2[2]);//13

        int[][] nums3 = { { 0, 1, 2 }, { 3, 4, 6 } };
        System.out.println(nums3[1][2]);//6

        int[] array =  { 1, 2, 3};
        for (int i : array){
            System.out.print(i);//123
        }
        System.out.println();

        int[] array1 = new int[] { 1, 2, 3};
        for (int i=0; i<array1.length;i++){
            array1[i] = array1[i] * 2;
            System.out.print(array1[i]);//246
        }
        System.out.println();

        int[][] nums4 = {{ 1, 2, 3 }, { 3, 4, 5 }, { 6, 7, 8}};
        System.out.println(nums4[2][1]);//7

        int[][][] nums5 = new int [3][3][3];
        System.out.println(nums5[2][1]);//[I@1e80bfe8

        int[][] nums6 = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums6.length; i++){
            for(int j=0; j < nums6[i].length; j++){

                System.out.printf("%d ", nums6[i][j]);//1 2 3   4 5 6   7 8 9
            }
            System.out.println();
        }

    }


}
