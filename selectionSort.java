import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

class selectionSort {

    public static void main(String[] args) {




       // int theArrayI[] = {-99, 44, 6, -300, 2, 1, 5, 63, 87, 283, 4, -100};
       int theArrayI[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.println("starting with : " + Arrays.toString(theArrayI));

        int theArrayR [] = selectionSort(theArrayI);


        System.out.println("got: " + Arrays.toString(theArrayR));

    }



    public static int[] selectionSort(int[] theValue) {

        int iFirst = 0;
        int iSecond = 0;
        int iSize = theValue.length;
        iSize--;
        int iArrayPos = 0;
        int theReturn[] = theValue;

        int iLittestPos =  0;

      //  System.out.println("the array is this big: " + iSize);


       int iCounter = 0;
       int iLittlest = 0;


           while (theValue.length>0  ){

            for (int i = 0; i < iSize; i++) {


                iCounter++;
              // initialize the variables
               if (i==0){
                   iLittlest = theValue[i];
                   iLittestPos= 0;
               }

                iFirst = theValue[i];



                iSecond   = theValue[i+1];
                /*
                System.out.println(" i is : " +i);
                System.out.println(" 53 iLittlest is : " +iLittlest);
                System.out.println("58 the littlest position  is : " +iLittestPos);
                System.out.println(" 59 iFirst is : " +iFirst);
                System.out.println(" 60 iSecond is : " +iSecond);
                */
                if ( iSecond <  iLittlest) {
                    // swap them
                    iLittlest = iSecond;
                    iLittestPos=i+1;
              //      System.out.println("67 the littlest position  is : " +iLittestPos);



                }

            }

     //    System.out.println("72 the littlest one is : " +iLittlest);
    //     System.out.println("74 the littlest poistion  is : " +iLittestPos);


     //   System.out.println("theValue before remove : " + Arrays.toString(theValue));
        if (theValue.length> 1) {
            theValue = ArrayUtils.remove(theValue, iLittestPos);
            theReturn[iArrayPos] = iLittlest;
        }else{
            // last value
            theReturn[iArrayPos] = theValue[0];
            theValue = ArrayUtils.remove(theValue, iLittestPos);

        }
        // add to final product





     //   System.out.println("theValue after remove: " + Arrays.toString(theValue));
   //     System.out.println(" theReturn : " + Arrays.toString(theReturn));
        iSize--;
        iArrayPos++;
       }
        return   theReturn;
    }




}

