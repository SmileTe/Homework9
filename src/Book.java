public class Book {
    private String title;
    private Author author;
    private  Integer yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }
    public String toString() {
        return "Book: " + title+ " by Author: " +author.toString() ;
    }

    public boolean equals(Book other){
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return title.equals(c2.getTitle())&&author.equals(c2.getAuthor());
    }
    public int hashCode() {
        return java.util.Objects.hash(title, yearOfPublication);
    }

    //получение значений полей
    public  String getTitle(){
        return  this.title;
    }
    public  Author getAuthor(){
        return  this.author;
    }

    public  Integer getYearOfPublication(){
        return  this.yearOfPublication;
    }

    //установка значений полей
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
}
}
