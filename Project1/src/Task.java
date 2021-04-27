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

}
