import java.util.HashMap;
import java.util.Arrays;
class matchedPair {
    public static void main(String[] args) {

        //Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2
       int[] input = {6, 5, 1, 2, 3, 5, 1, 2, 4};
//        int[] input = {      2,5,5,2,3,5,1,2,4};
//        int[] input = { 2,3,4,5};
//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1
//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2

//Given an array = [2,3,4,5]:
//It should return undefined


        int iReturn = firstRecurringCharacter (input);
        System.out.println("We got this: " + iReturn);



    }
    public static int  firstRecurringCharacter(int[] input){

        HashMap <Integer,Integer> theMap = new HashMap<Integer,Integer>();


        int iSize = input.length;
        System.out.println("the array is this big: "+iSize);
        for (int i = 0; i< iSize; i++){
       //     System.out.println("adding this one: "+input[i]);
            if (i > 1){
                if (theMap.containsValue(input[i])){
                    System.out.println("Bingo for: " + input[i]);
                    return input[i];
                }
            }
            theMap.put(i,input[i]);
        }
        System.out.println("Nothing matched for: " + theMap);
        return -1;


}






}