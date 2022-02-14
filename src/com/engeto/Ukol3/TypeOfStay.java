package com.engeto.Ukol3;

public enum TypeOfStay {
        WORKING("pracovní"),
        PRIVATE("soukromá");

        final String description;

    TypeOfStay(String description) {
        this.description = description;
    }
}
