package Notebook;

import Notebook.Entries.*;
import Notebook.Interfaces.NotebookEntry;

import java.util.Scanner;

final public class Menu {

    private Notebook notebook;

    public Menu(Notebook notebook) {

        this.notebook = notebook;
    }

    public void run() {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while(running) {
            displayMenu();

            write("Wybierz opcję: ");
            switch(scanner.nextLine()) {
                case "1": {
                    write();
                    comment("zanotowano:");
                    for(NotebookEntry item : notebook.getAll()) {
                        write(item.getSlug());
                    }
                    break;
                }
                case "2": {
                    write("Podaj tytuł filmu: ");
                    String title = scanner.nextLine();
                    WatchedMovie movie = new WatchedMovie(title);
                    notebook.save(movie);
                    break;
                }
                case "3": {
                    write("Podaj nazwę piwa: ");
                    String name = scanner.nextLine();
                    write("Podaj nazwę browaru: ");
                    String brewery = scanner.nextLine();
                    DrankBeer beer = new DrankBeer(name, brewery);
                    notebook.save(beer);
                    break;
                }

                case "4": {
                    write("Podaj tytuł gry: ");
                    String title = scanner.nextLine();
                    Game game = new Game(title);
                    notebook.save(game);
                    break;
                }

                case "5": {
                    write("Podaj mecz: ");
                    String title = scanner.nextLine();
                    WatchedMatch match = new WatchedMatch(title);
                    notebook.save(match);
                    break;
                }

                case "6": {
                    write("Podaj tytuł ksiązki: ");
                    String title = scanner.nextLine();
                    Book book = new Book(title);
                    notebook.save(book);
                    break;
                }

                case "x": {
                    running = false;
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    private void displayMenu() {
        write();
        comment("notatek: ");
        write("[1] wypisz notatki");
        write("[2] zanotuj obejrzany film");
        write("[3] zanotuj wypite piwo");
        write("[4] zanotuj grę");
        write("[5] zanotuj mecz");
        write("[6] zanotuj książkę");

        write("[x] wyjdź");
    }

    private void write() {
        System.out.println();
    }

    private void write(String $line) {
        System.out.println($line);
    }

    private void comment(String line) {
        write(line);
    }

}
