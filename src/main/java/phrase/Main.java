package phrase;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class Main {
    public static void main(String[] args) {
        ProseBuilder builder = new ProseBuilder();

        builder.register(new Statement("The sky is blue"));
        builder.register(new Shout("What a beautiful day"));

        System.out.println(builder.get());
    }
}