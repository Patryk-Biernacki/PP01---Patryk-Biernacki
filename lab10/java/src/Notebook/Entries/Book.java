package Notebook.Entries;

import Notebook.Interfaces.NotebookEntry;
import Notebook.Traits.Slugger;

public class Book implements NotebookEntry, Slugger {

    private String name;

    public Book(String name) {
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
