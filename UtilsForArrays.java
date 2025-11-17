public class UtilsForArrays {

    
    public static int[] createIntArray(int minimum, int maximum) {
        int[] intArray = new int[maximum-minimum+1];

        for(int index = 0; index < intArray.length; ++index){
            intArray[index] = minimum+index; 
        }
        return intArray;
    }

    public static int[] quadriere(int[] intArray) {
        int[] intArrayQuad = new int[intArray.length];

        for(int index = 0; index < intArrayQuad.length; ++index){
            intArrayQuad[index] = intArray[index]*intArray[index];
        }
        return intArrayQuad;
    }

    public static void arrayInhaltAusgeben(int[] anyArray) {

       for(int index = 0; index < anyArray.length; ++index){
        if (index < anyArray.length-1) {
            System.out.print(anyArray[index]+ ",");
        }
        else {
            System.out.println(anyArray[index]);
        }
       }
    }
}
