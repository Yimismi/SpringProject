package knightstory;

public class BraveKnight implements Knights{
    private Quest quest;
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    public void embarkOnQuest() {
        quest.embark();
    }
}
