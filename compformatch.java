import java.util.HashSet;

class compformatch {
    public static void main(String[] args) {

        String[] array1 = {"a", "b", "c", "x"};
        String[] array2 = {"q", "y", "x"};

/*

        // Array1
        for (int i = 0; i < array1.length; i++) {
            System.out.println("arr1 val is: " + array1[i]);
        }


        // Array2
        for (int j = 0; j < array2.length; j++) {
            System.out.println("ar2 val is: " + array2[j]);
        }

*/






      boolean thereturn =  theFunction(array1, array2);
        System.out.println("theFunction is: " + thereturn);

    }
    public static boolean theFunction(String[] _array1,String[] _array2){
        System.out.println("function arr1 val is: " + _array1[0]);
        HashSet<String> mapOfFirstArray = new HashSet<>();

        // load up the hashset with the first array
        for (int i = 0; i < _array1.length; i++) {
            System.out.println("adding this value to the HashSet: " + _array1[i]);
            mapOfFirstArray.add(_array1[i]);
        }

        // loop through the second array.
        for (int j = 0; j < _array2.length; j++) {
            System.out.println("looking at this value in  array2: " + _array2[j]);
            // do a comparision to see if you have a match.
            if (mapOfFirstArray.contains(_array2[j])){
                System.out.println("got a hit for  val is: " + _array2[j]);
                return true;
            }
        }
        return false;


    }
}