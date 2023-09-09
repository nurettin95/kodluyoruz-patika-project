package Week4;

public class Student {

    private String name;
    private String surName;
    private String idNo;
    private String address;
    private int note;

    public Student(String name, String surName, String idNo, String address, int note) {
        this.name = name;
        this.surName = surName;
        this.idNo = idNo;
        this.address = address;
        if(note > 100 || note < 0){
            note = 0;
        }
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if(note > 100 || note < 0){
            note = 0;
        }
        this.note = note;
    }
}
