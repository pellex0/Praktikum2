public class PythagoraeischeZahlentripel{
    private int[] pruefZahlen;
    private int[] pruefZahlenQuad;
    private int pTripelMenge;

    public PythagoraeischeZahlentripel(int minimum, int maximum){
        int[] intArray = UtilsForArrays.createIntArray(minimum, maximum);
        int[] pruefZahlen = intArray;
        int[] pruefZahlenQuad = UtilsForArrays.quadriere(intArray); 
    }

    public boolean istQuadratzahl(int zahl){
        return Math.sqrt(zahl) == Math.floor(Math.sqrt(zahl));    
    }

    public void berechne(){
        pTripelMenge = 0;
        for(int i = 1; i < pruefZahlenQuad.length; ++i) {
            int zahl = Math.abs(pruefZahlenQuad[i] - pruefZahlenQuad[i-1]);
            if (istQuadratzahl(zahl) = true) {
                int pTripelMenge = pTripelMenge + 1 ;
                System.out.println(Math.sqrt(pruefZahlenQuad[i-1]) + zahl + "^2" 
                                            + "^2 = " + Math.sqrt(pruefZahlenQuad[i]) + "^2");
            } else {

            }
        }
    }

    public void gibAnzahlAus(){
        System.out.print("Anzahl Pythagoräische Zahlentripel:" + pTripelMenge);
    }


}