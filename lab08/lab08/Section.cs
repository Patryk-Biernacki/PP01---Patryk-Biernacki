using System;
using System.Collections.Generic;

namespace lab08
{
    class Section
    {
        public string Name { get; set; }
        public List<Book> Books { get; set; } = new List<Book>();
        public Section(string name) {
            Name = name;
        }
        
        public static Section operator +(Section section, Book Name) {
            section.Books.Add(Name);
            return section;
        }
        
        public static Section operator +(Section section, Section sect)
        {
            section.Books.AddRange(sect.Books);
            return section;
        }
        
        public static Section operator -(Section section, Section sect) {
            for (int i = 0; i < sect.Books.Count; i++)
            {
                section.Books.Remove(sect.Books[i]);
            }
            return section;
        }
        
      
        public void Print()
        {
            Console.WriteLine(Name);
            foreach (var book in Books)
                book.Print();
        }
    }
}