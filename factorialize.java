
class factorialize {

    public static void main(String[] args) {


        int theInput = 5;

        int theReturn = factorialzeMe(theInput);
        System.out.println("got: " + theReturn);
    }


    public static int factorialzeMe(int theValue) {



    //    System.out.println("21 theValue: " + theValue);


        if (  theValue >0) {
            int temp =  theValue*(theValue-1);
           // System.out.println("return theValue " +temp);

            return  theValue * factorialzeMe(theValue-1);
        } else {


          //  System.out.println("32 theInput is: " + theValue);
            return 1;
        }
    }
}

