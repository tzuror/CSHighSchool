package Bagrot.Year2023;

public class Question1 {
    public static boolean posOrder(int[] MainArray){
        int MainArrayLength = MainArray.length;
        int counter = 0;
        int LastPositive = -1;
        while (counter<MainArrayLength){
            if(MainArray[counter] > 0){
                if (LastPositive>0 && MainArray[counter]< LastPositive){
                    return false;
                }else{
                    LastPositive = MainArray[counter];

                }
            }
            counter++;
        }
        return true;

    }
    public static void main(String[] args) {
        int[] a = {1,2,-1,3,5,-3,1};
        System.out.println(posOrder(a));
        
    }
}
