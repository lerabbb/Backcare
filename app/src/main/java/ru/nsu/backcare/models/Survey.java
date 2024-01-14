package ru.nsu.backcare.models;

public class Survey {
    private int Id;
    private int birth_year;
    private int gender_id;

    public Survey(int id, int birth_year, int gender_id) {
        Id = id;
        this.birth_year = birth_year;
        this.gender_id = gender_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getGender_id() {
        return gender_id;
    }

    public void setGender_id(int gender_id) {
        this.gender_id = gender_id;
    }
}
