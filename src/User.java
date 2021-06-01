/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author struj
 */
public class User {
    
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String urlImg;
    private String birthday;
    private String profession;
    private String gener;
    private String city;
    private String tlephone;

    public User(String firstName, String lastName, String documentType, String documentNumber, String urlImg, String birthday, String profession, String gener, String city, String tlephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.urlImg = urlImg;
        this.birthday = birthday;
        this.profession = profession;
        this.gener = gener;
        this.city = city;
        this.tlephone = tlephone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTlephone(String tlephone) {
        this.tlephone = tlephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getProfession() {
        return profession;
    }

    public String getGener() {
        return gener;
    }

    public String getCity() {
        return city;
    }

    public String getTlephone() {
        return tlephone;
    }
    
    
    
}
