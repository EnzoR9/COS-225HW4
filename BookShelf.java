import java.util.ArrayList;

public class BookShelf
{
    public char firstLetter;
    public ArrayList<Book> books;

    public BookShelf(char shelfTitle)
    {
        this.books = new ArrayList<>();
        this.firstLetter = shelfTitle;
    }

    public char getLetter()
    {
        return firstLetter;
    }

    public void addBook(Book book)
    {
        if(book.title.charAt(0) == firstLetter && books.size() < 8 )
        {
            books.add(book);
        }
        else
        {
            return;
        }
    }

    public void remBook(Book book)
    {
        books.remove(book);
    }

    @Override
    public String toString()
    {
        if (books.isEmpty())
        {
            return "-";
        }
        else 
        {
            String output = "";
            for (Book book : books )
            {
                output += book.toString() + "   ";
            }
            return output.trim();
        }
    }

   
}
