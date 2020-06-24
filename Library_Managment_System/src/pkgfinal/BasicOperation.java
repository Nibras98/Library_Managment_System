
package pkgfinal;

import java.io.IOException;

public interface BasicOperation {
    void borrow(Patron p, Book b) throws IOException;
    void returnBook(Patron p, Book b);
    void fine(Patron p, double amount) throws IOException;
}