public class PythagoraeischeZahlentripel{
    private int[] pruefZahlen;
    private int[] pruefZahlenQuad;
    private int pTripelMenge;

    public PythagoraeischeZahlentripel(int minimum, int maximum){
        this.pruefZahlen = UtilsForArrays.createIntArray(minimum, maximum);
        this.pruefZahlenQuad = UtilsForArrays.quadriere(this.pruefZahlen);
        UtilsForArrays.arrayInhaltAusgeben(this.pruefZahlenQuad);
        berechne();
    }

    public boolean istQuadratzahl(int zahl){
        return Math.sqrt(zahl) == Math.floor(Math.sqrt(zahl));    
    }

    public void berechne(){
        for (int j = 0; j < pruefZahlenQuad.length - 2; j++) {
            for (int i = j; i < pruefZahlenQuad.length; i++) {
                int zahl = Math.abs(pruefZahlenQuad[j] - pruefZahlenQuad[i]);
                if (pruefZahlenQuad[j] < zahl && istQuadratzahl(zahl) == true) {
                    this.pTripelMenge = this.pTripelMenge + 1;
                    System.out.println(Math.sqrt(pruefZahlenQuad[j]) 
                                        + "^2 + "  
                                        + Math.sqrt(zahl)
                                        + "^2 = " 
                                        + Math.sqrt(pruefZahlenQuad[i]) 
                                        + "^2");                   
                }
            }
        }
    }

    public void gibAnzahlAus(){
        System.out.println("Anzahl Pythagoraeische Zahlentripel:" + this.pTripelMenge);
    }
}