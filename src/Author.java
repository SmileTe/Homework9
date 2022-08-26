public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    //получение значений полей
    public  String getFirstName(){
        return this.firstName;
    }
    public  String getSecondName(){
        return this.secondName;
    }
    //установка значений полей

}
