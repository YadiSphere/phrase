package phrase;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class Statement implements Sentence {

    private String text;

    public Statement(String text) {
        this.text = text;
    }

    @Override
    public String get() {
        return text + ".";
    }
}