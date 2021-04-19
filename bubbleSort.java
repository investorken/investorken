import java.util.Arrays;
class bubbleSort {

    public static void main(String[] args) {




        int theArrayI[] = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

        System.out.println("starting with : " + Arrays.toString(theArrayI));

        int theArrayR [] = bubbleSort(theArrayI);

//        Arrays.sort(theArrayI);

        System.out.println("got: " + Arrays.toString(theArrayR));

    }



    public static int[] bubbleSort(int[] theValue) {

        int iFirst = 0;

        int iSize = theValue.length;

        int theReturn[] = theValue;

        iSize--;
     //   System.out.println("the array is this big: " + iSize);


       int iCounter = 0;

        boolean didASwitch = true;
           while (didASwitch  ){
            didASwitch= false;
            for (int i = 0; i < iSize; i++) {

                iCounter++;
              //  System.out.println("this set: " + theReturn[i] + " / " + theReturn[i + 1]);
                iFirst = theReturn[i];

                if (theReturn[i] > theReturn[i+1]) {
                    // swap them
                    theReturn[i] = theReturn[i + 1] ;
                    theReturn[i + 1] = iFirst;

                //      System.out.println(" did a swap and theReturn : " + Arrays.toString(theReturn));

                    didASwitch=true;


                }
            }
        }
        return   theReturn;
    }




}

