public class Library {
    private Book[] arrayBooks;
    private int size;

    public Library(int lengthArray) {
        arrayBooks = new Book[lengthArray];
       }

    public String toString() {
        String tem = "";
        for (int i = 0; i <= arrayBooks.length-1; i++) {

                if (arrayBooks[i] == null) {
                    continue;
                }
                else {
                    if(i==0){tem = arrayBooks[i].toString();}
                    else {  tem = tem+ "\n" + arrayBooks[i].toString(); }
                }
        }
        return tem ;
    }

    public boolean equals(Book[] other){
        //if (this.getClass() != other.getClass()) {
       //    return false;
       // }
        Book [] c2 = (Book[]) other;
        return arrayBooks.equals(c2);
    }
    public int hashCode() {
        return java.util.Objects.hash(arrayBooks);
    }

    public void addNewBookInArray( Book newBook) {
        arrayBooks[size++] = newBook;
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


