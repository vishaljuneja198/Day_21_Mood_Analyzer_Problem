package com.bridgelabz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMoodAnalyser {

    @Test
    public void givenSadMood_whenTested_shouldReturnSad() {
        MoodAnalyser mood = new MoodAnalyser();
        String result = mood.analyseMood("I am in Sad mood");
     Assertions.assertEquals(result, "Sad");


    }




}