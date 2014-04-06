/*enumeratie pentru a verifica ce culoare are fiecare jucator*/
public enum Jucator {
	NEGRU, ALB;

	
	public Jucator Inamic(){
		if(this == ALB)
			return NEGRU;
		else
			return ALB;
	}
	
}


