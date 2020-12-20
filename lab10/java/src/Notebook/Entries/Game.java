package Notebook.Entries;

import Notebook.Interfaces.NotebookEntry;
import Notebook.Traits.Slugger;

public class Game implements NotebookEntry, Slugger {

    private String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public String getSlug() {
        return getSlug(name);
    }

    @Override
    public void setSlug(String name) {
        name+=" "+name;
    }

}
