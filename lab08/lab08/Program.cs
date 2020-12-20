using System;

namespace lab08
{
    class Program
    {
        static void Main(string[] args)
        {
            Library library = new Library("Biblioteka nr 1");
            library += new Section("fantastyka");
            library.sections[0] += new Book("Pieśń lodu i ognia", "G.R.R Martin");
            library += new Book("Hobbit", "J.R.R. Tolkien");
            
            library.Print();
            Console.ReadKey();
        }
    }
}
