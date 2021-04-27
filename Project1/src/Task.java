
public class Task implements TaskIF {
    private String[][] zweiD;

    public Task(String[][] s) {
        zweiD = s;
    }


    
    public boolean kommtJederStringNurEinmalVor(String[] sequenz) {
        String kommtJederStringNurEinmalVor = "";
        for (int i = 0; i < sequenz.length; i++) {
            if (kommtJederStringNurEinmalVor.contains(sequenz[i])) { // Kommt jeder String der Sequenz nur einmal vor?
                return false;
            }
            kommtJederStringNurEinmalVor += sequenz[i];
        }
        return true;
    }
    public boolean sindAlleWerteDerSequenzErlaubt(String[] sequenz) {
		String test = "";
		for (int i = 0; i < zweiD.length; i++) {
			for (int j = 0; j < zweiD[i].length; j++) {
				test += zweiD[i][j];
			}
		}
		for (int k = 0; k < sequenz.length; k++) {
			if (!(test.contains(sequenz[k]))) {
				return false;
			}
		}
		return true;

	}
    

}
