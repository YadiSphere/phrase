package phrase;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class Shout implements Sentence {

    private String text;

    public Shout(String text) {
        this.text = text;
    }

    @Override
    public String get() {
        return text + "!";
    }
}