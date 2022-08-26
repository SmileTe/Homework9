public class Library {
    private Book[] arrayBooks;

    public Library(int lenghtArray) {
        Book[] array = new Book[lenghtArray];
        this.arrayBooks = array;
    }

    public static Book[] addNewBookInArray(Book[] arrayBooks, Book newBook) {
        Book[] arrayBooksNew = new Book[arrayBooks.length+1];
        for (int i = 0; i < arrayBooks.length; i++) {
            arrayBooksNew[i] = arrayBooks[i];
        }
        arrayBooksNew[arrayBooksNew.length-1] = newBook;
        return arrayBooksNew;
    }

    public static void printInformationAboutBook(String title,   Book[] arrayBook ) {
        for (int i = 0; i < arrayBook.length; i++) {
          Book book = arrayBook[i];
          if(book.getTitle() == title) {
              System.out.printf("%1s by %2s %4s was published in %5d", book.getTitle(), book.getAuthor().getFirstName(), book.getAuthor().getSecondName(), book.getYearOfPublication());
              System.out.println();

          }
        }

    }

    public static void changeYearOfPublication(String title, int newYearOfPublication,  Book[] arrayBook ) {
        for (int i = 0; i < arrayBook.length; i++) {
            Book book = arrayBook[i];
            if (book.getTitle() == title) {
                book.setYearOfPublication(newYearOfPublication);
                System.out.println(book.getYearOfPublication());
            }
        }

    }

}


