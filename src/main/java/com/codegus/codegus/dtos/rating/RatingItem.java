package com.codegus.codegus.dtos.rating;

public class RatingItem {

    private float punctuation;

    public float getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(float punctuation) {
        this.punctuation = punctuation;
    }

    @Override
    public String toString() {
        return "RatingItem{" +
                "punctuation=" + punctuation +
                '}';
    }
}
