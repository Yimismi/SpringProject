package knightstory;

import java.io.*;

public class SlayDragonQuest implements Quest {
    private PrintStream stream;
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
