package laba3_author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public  Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setGender(char gender){ this.gender = gender; }

    public int getGender(){
        return this.gender;
    }

    public String toString(){
        return ("Name : " + name +"\nEmail : " +
                this.email + "\nGender : " + this.gender);
    }
}
class TestAuthor {
    public static void main(String[] arg){
        Author b1 = new Author("Pushkin","Puskin1837@gmail.com", 'M');
        System.out.println(b1.toString());
    }
}
