using System;
using System.Collections.Generic;

namespace lab08
{
    class Library
    {
        public string Name { get; set; }
        public List<Book> Books { get; set; } = new List<Book>();
        public List<Section> sections { get; set; } = new List<Section>();

        public Library(string name) {
            Name = name;
        }
        
        public static Library operator +(Library library, Book book)
        {
            library.Books.Add(book);
            return library;
        }

        public static Library operator +(Library library, Section section)
        {
            library.sections.Add(section);
            return library;
        }
        
        public static Library operator -(Library library, Section section) {
            library.sections.Remove(section);
            return library;
        }
        
        public void Print()
        {
            Console.WriteLine(Name);
            foreach (var book in sections)
                book.Print();
        }
    }
}
