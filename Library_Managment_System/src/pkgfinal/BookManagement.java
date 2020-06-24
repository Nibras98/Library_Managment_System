
package pkgfinal;
import java.io.*;

public class BookManagement {
    Book books[] = new Book[10];
    int size = 0;
    void insertBook(Book b) throws IOException {
        books[size] = b;
        size++;
        try{
            FileReader fr = new FileReader("books.txt");
        }
        catch(Exception e){
            PrintWriter pw = new PrintWriter("books.txt");
            pw.close();
        }
        FileWriter fw = new FileWriter("books.txt", false);
        fw.write("Title: "+b.getTitle()+"\n");
        fw.write("Subtitle: "+b.getSubtitle()+"\n");
        fw.write("Subtitle: "+b.getSubtitle()+"\n");
        fw.write("Author: "+b.getAuthor().getName()+"\n");
        fw.write("Publisher: "+b.getPublisher().getName()+"\n");
        fw.close();
    }
    Book getBook(int bookId){
        for(int i=0;i<size;i++){
            if(books[i].getBookId()==0)
                continue;
            if(books[i].getBookId()==bookId)
                return books[i];
        }
        System.out.println("Book does not exists");
        return null;
    }
    void showAllBooks(){
        for(int i=0;i<size;i++){
            if(books[i]==null)
                continue;
            books[i].showInfo();
        }
    }
}