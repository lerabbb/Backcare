package ru.nsu.backcare.models.survey;

import java.util.Objects;

import ru.nsu.backcare.models.enums.Treatment;

public class SurveyTreatment {
    private Survey survey;
    private Treatment treatment;
    private ScheduledTreatment firstTreatment;
    private int frequency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SurveyTreatment that = (SurveyTreatment) o;
        return frequency == that.frequency && Objects.equals(survey, that.survey) && treatment == that.treatment && Objects.equals(firstTreatment, that.firstTreatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(survey, treatment, firstTreatment, frequency);
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public ScheduledTreatment getFirstTreatment() {
        return firstTreatment;
    }

    public void setFirstTreatment(ScheduledTreatment firstTreatment) {
        this.firstTreatment = firstTreatment;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
