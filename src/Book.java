public class Book {
    private String title;
    private Author author;
    private  Integer yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
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
