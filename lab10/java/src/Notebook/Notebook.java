package Notebook;

import Notebook.Interfaces.NotebookEntry;

import java.util.ArrayList;
import java.util.Comparator;

final public class Notebook {

    private ArrayList<NotebookEntry> entries = new ArrayList<>();
    private String licznik;
    static int i = 0;

    Notebook save(NotebookEntry entry) {
        i+=1;
        licznik = Integer.toString(i);
        entry.setSlug(licznik);
        entries.add(entry);
        entries.sort(Comparator.comparing(NotebookEntry::getSlug));
        return this;
    }

    int countEntries() {
        return entries.size();
    }

    Iterable<NotebookEntry> getAll() {
        return entries;
    }

}
