package ru.nsu.backcare.models.survey;
import java.util.Objects;
import java.util.Set;

import ru.nsu.backcare.models.enums.Gender;
import ru.nsu.backcare.models.enums.Illness;

public class Survey {
    private int Id;
    private int birthYear;
    private int genderId;
    private Gender gender;
    private Set<Illness> illnesses;
    private Set<SurveyTreatment> treatments;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Survey survey = (Survey) o;
        return Id == survey.Id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<Illness> getIllnesses() {
        return illnesses;
    }

    public void setIllnesses(Set<Illness> illnesses) {
        this.illnesses = illnesses;
    }

    public Set<SurveyTreatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(Set<SurveyTreatment> treatments) {
        this.treatments = treatments;
    }

    public Survey(int id, int birthYear, int genderId) {
        Id = id;
        this.birthYear = birthYear;
        this.genderId = genderId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getGenderId() {
        return genderId;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }
}
