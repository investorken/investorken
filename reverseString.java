import java.util.HashSet;

class reverseString {
    public static void main(String[] args) {


        String nameI = "Hi my name is CoderKen Rowe!";
        //String nameI = null;

        System.out.println("Input String value: "+nameI);
        if (nameI == null || nameI.length() < 1){
            System.out.println("There is nothing to reverse!");
             return;
        }
        char[] theChar = nameI.toCharArray();
        int iCharLength = theChar.length;
        char[] theCharReverse = new char[iCharLength];


     /*  char array loop works fine
        for (int i = nameI.length(); i > 0 ; i--) {
           // System.out.println("I is: : " + i);

            sReverse += nameI.substring(i-1,i);
         //   System.out.println("in loop" +sReverse);
        }

        System.out.println(sReverse);
*/
     //   int iCounter = 0;

        //iCharLength--;
/*
        for (int i = iCharLength; i >= 0 ; i--) {
            System.out.println("i is  " + i);
             System.out.println("the char is this " + theChar[i]);

            theCharReverse[iCounter++] = theChar[i];
            //   System.out.println("in loop" +sReverse);
        }

 */
        int iCharFirstHalf = -1;
        while (iCharFirstHalf++ <= iCharLength--  ){
           // System.out.println("iCharFirstHalf: " +iCharFirstHalf);
          //  System.out.println("iCharLength]: " +iCharLength);

         //   System.out.println("theChar[iCharFirstHalf]: " +theChar[iCharFirstHalf]);
          //  System.out.println("theChar[iCharLength]: " +theChar[iCharLength]);

            theCharReverse[iCharLength] = theChar[iCharFirstHalf];
            theCharReverse[iCharFirstHalf] = theChar[iCharLength];

        }
      //  System.out.println( String.valueOf(theChar));
        System.out.println( String.valueOf(theCharReverse));

        /*StringBuilder input1 = new StringBuilder();
       // string buillder works fine with no coding to do!
        // append a string into StringBuilder input1
        //input1.append(nameI);

        // reverse StringBuilder input1
        //input1.reverse();
        //System.out.println("fancy reverse output: " +input1.toString());

*/




    }


}