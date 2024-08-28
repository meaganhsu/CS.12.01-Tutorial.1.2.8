import java.util.*;
public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }
    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList<String> out = new ArrayList<>();

        for (int i = 0; i < token.length; i++) {
            if (token[i].equals(openDel) || token[i].equals(closeDel)) out.add(token[i]);
        }

        return out;
    }
    public boolean isBalanced(ArrayList<String> delimiters) {
        int o = 0;
        int c = 0;

        for (int i = 0; i < delimiters.size(); i++) {
            if (c > o) return false;

            if (delimiters.get(i).equals(openDel)) o++;
            else if (delimiters.get(i).equals(closeDel)) c++;
        }

        return c == o;
    }
    public String getCloseDel() {
        return closeDel;
    }
    public String getOpenDel() {
        return openDel;
    }
}
