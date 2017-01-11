package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) throws FactorielleUnavailableException {
		if (n > 1) { 
			long resultat = n * calculer(n-1);
			if (resultat < 0){
				throw new FactorielleUnavailableException();
			}
			return resultat;
    }
		else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return 1; //pour test de 0 modifier le n en 1

}
}
