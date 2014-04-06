
public class GameBoard {

	/*litere mici-negru
	  litere mari-alb
	  t-tura
	  c-cal
	  n-nebun
	  q-regina
	  r-rege
	*/
	static int PozitieRegeA, PozitieRegeN;
	static String[][] chessBoard={
        {"t","c","n","q","r","n","c","t"},
        {"p","p","p","p","p","p","p","p"},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "},
        {"P","P","P","P","P","P","P","P"},
        {"T","C","N","Q","R","N","C","T"}};
	
	public static void move(String move){
		if (move.charAt(4)=='P'){
			posibilMoves();
		}
	
	}
	
	public static void swapBoard() { // folosit de comanda white/black.
		String temp;
		for (int i=0;i<32;i++) { 
			int r=i/8, c=i%8; //r-rand c-coloana
			if (Character.isUpperCase(chessBoard[r][c].charAt(0))) {
				temp=chessBoard[r][c].toLowerCase();
	           	} else {
	           		temp=chessBoard[r][c].toUpperCase();
	           	}
	           	if (Character.isUpperCase(chessBoard[7-r][7-c].charAt(0))) {
	                chessBoard[r][c]=chessBoard[7-r][7-c].toLowerCase();
	           	} else {
	           		chessBoard[r][c]=chessBoard[7-r][7-c].toUpperCase();
	           	}
	           	chessBoard[7-r][7-c]=temp;
	       	}
	       	int RTemp=PozitieRegeA;
	       	PozitieRegeA=63-PozitieRegeN;
	       	PozitieRegeN=63-RTemp;
	}
	 
	public static String posibilMoves() {
        String list="";
        for (int i=0; i<64; i++) {
            switch (chessBoard[i/8][i%8]) {
                case "P": list+=posibilP(i);
                    break;
                case "T": list+=posibilT(i);
                    break;
                case "C": list+=posibilC(i);
                    break;
                case "N": list+=posibilN(i);
                    break;
                case "Q": list+=posibilQ(i);
                    break;
                case "R": list+=posibilR(i);
                    break;
            }
        }
        return list;
    }
    public static String posibilP(int i) {
        String list="";
        int r=i/8, c=i%8; //r-rand c-coloana
        for (int j=-1; j<=1; j+=2) {
        	try {//mutare pion o casuta
                if (" ".equals(chessBoard[r-1][c]) && i>=16) {
                    chessBoard[r][c]=" ";
                    chessBoard[r-1][c]="P";
                   
                    chessBoard[r][c]="P";
                }
            } catch (Exception e) {}
        	try {//mutare pion 2 casute
                if (" ".equals(chessBoard[r-1][c]) && " ".equals(chessBoard[r-2][c]) && i>=48) {
                    chessBoard[r][c]=" ";
                    chessBoard[r-2][c]="P";
                    chessBoard[r][c]="P";
                    }
            } catch (Exception e) {}
        }
        return list;
    }
    /*de implementat*/
    public static String posibilT(int i) {
        String list="";
        return list;
    }
    public static String posibilC(int i) {
        String list="";
        return list;
    }
    public static String posibilN(int i) {
        String list="";
        return list;
    }
    public static String posibilQ(int i) {
        String list="";
        return list;
    }
    public static String posibilR(int i) {
        String list="";
        return list;
    }
}
