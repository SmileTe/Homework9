public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String toString() {
        return firstName+ " " + secondName  ;
    }

    public boolean equals(Author other){
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
         return secondName.equals(c2.getSecondName())&&firstName.equals(c2.getFirstName());
    }
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
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
