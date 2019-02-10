package models;

/**
 * @author Rubzer
 */

public class Student {
    
    private String id, dni, name, surname1, surname2;
    
    public Student(){}
    
    public Student(String id, String dni, String name
            , String surname1, String surname2){
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname1 = surname1;
        this.surname2 = surname2;
        
    }
    
    public String[] getParamArray(){
        return new String[]{id, dni, name, surname1, surname2};
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }
    
    
    
}
