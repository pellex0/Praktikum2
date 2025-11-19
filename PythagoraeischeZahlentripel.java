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
        for (int j = 0; j < pruefZahlenQuad.length - 2; j++) {
            for (int i = j + 2; i < pruefZahlenQuad.length; i++) {
                int zahl = Math.abs(pruefZahlenQuad[j] - pruefZahlenQuad[i]);
                if (istQuadratzahl(zahl) == true) {
                    this.pTripelMenge = this.pTripelMenge + 1;
                    System.out.println(Math.sqrt(pruefZahlenQuad[j]) 
                                        + "^2 + "  
                                        + zahl 
                                        + "^2 = " 
                                        + Math.sqrt(pruefZahlenQuad[i]) 
                                        + "^2");
                }
            }
        }
    }

    public void gibAnzahlAus(){
        System.out.print("Anzahl Pythagoräische Zahlentripel:" + this.pTripelMenge);
    }


}