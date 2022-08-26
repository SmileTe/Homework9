public class Main {
    public static void main(String[] args) {

        //2 автора
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");

        //2 книги
        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Евгений Онегин", author2, 1867);

        book1.setYearOfPublication(1833);

        /*
        System.out.println("book1.getTitle() = " + book1.getTitle());
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());
        book1.setYearOfPublication(1902);
        System.out.println("book1.getYearOfPublication() = " + book1.getYearOfPublication());

        System.out.println("author2.getFirstName() = " + author2.getFirstName());
        System.out.println("author2.getSecondName() = " + author2.getSecondName());
*/
        /*
        1. Необходимо в классе с методом main создать массив объектов типа Book и
        положить туда созданные книги.

        2. Написать статические методы для работы с массивом в классе, где располагается метод main:
            1. Добавить книгу (найти свободную ячейку массива и положить туда книгу).
              Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5)
              и каждая новая книга должна успешно укладываться в массив.
            2. Напечатать в консоль все книги из массива в следующем формате:
            “Stephen King: The Stand: 1978”
     */

    Book[] arrayBooks = {book1, book2};

    Author author3 = new Author("Stephen", "King");
    Book book3 = new Book("The Stand", author3, 2000);

    arrayBooks = Library.addNewBookInArray(arrayBooks, book3);

    for (int i = 0; i < arrayBooks.length; i++) {
        System.out.printf("%1s %2s: %3s: %4d", arrayBooks[i].getAuthor().getFirstName(),
                arrayBooks[i].getAuthor().getSecondName(), arrayBooks[i].getTitle(), arrayBooks[i].getYearOfPublication());
        System.out.println();
    }


        /*
        1. Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
         Учесть, что доступ к нему должен быть только из Library (private поле),
        а сеттеры и геттеры отсутствуют. Работать с массивом можно только через
        внутренние нестатические методы класса Library.

         2. Конструктор класса должен получать в качестве параметра размер массива
        и инициализировать в себе поле массива тем размером, что пришел параметром.

        3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.

        4. Создать новые нестатические методы в классе Library:
            1. Напечатать информацию о книге по ее названию, которое приходит в метод
            в качестве параметра.
            Формат: “The Stand by Stephen King was published in 1978”
            2. Изменить год публикации книги по ее названию.
             В метод подаются два параметра, а именно: название и новый год публикации.
            Нужно найти книгу и изменить ее год публикации.
   */
    Library.printInformationAboutBook("Война и мир", arrayBooks);
    Library.changeYearOfPublication("Война и мир",2022,  arrayBooks);


    }

    /*
    public static Book[] addNewBookInArray(Book[] arrayBooks, Book newBook) {
        Book[] arrayBooksNew = new Book[arrayBooks.length+1];
        for (int i = 0; i < arrayBooks.length; i++) {
          arrayBooksNew[i] = arrayBooks[i];
        }
        arrayBooksNew[arrayBooksNew.length-1] = newBook;
        return arrayBooksNew;
    }
*/

}