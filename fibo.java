
class fibo {

    public static void main(String[] args) {


        int theInput = 10;

        int theReturn = fibonacciMeR(theInput);
        System.out.println("fibonacciMeR got: " + theReturn);
        int theReturnI = fibonacciMeI(theInput);

        System.out.println("fibonacciMeI got: " + theReturn);
    }

/* recursuive  inefficient  n squared */

    public static int fibonacciMeR(int theValue) {

        if (theValue < 2){
            return theValue;
        }

        return   fibonacciMeR(theValue-1)+fibonacciMeR(theValue-2);
    }


    /* Iterative much better */
    public static int fibonacciMeI(int theValue) {

        int theArray[] = {0,0};


        if (theValue < 2){
            return theValue;
        }

       for (int i = 2;i< theValue+1;i++){


               theArray[0] =  theArray[0]+i - 1;
               theArray[1] = theArray[1]+i - 2;




      //     System.out.println("21 theValue: " + theArray[0] + " / "+ theArray[1]);
        }
        System.out.println("52 theValue: " + theArray[0] + " / "+ theArray[1]);
       return theArray[0]+theArray[1];
    }

}

