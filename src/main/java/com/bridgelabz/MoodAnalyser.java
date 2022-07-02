package com.bridgelabz;

public class MoodAnalyser {

    String message;

    MoodAnalyser() {

    }

    MoodAnalyser(String message) {
        this.message = message;
    }

    String analyseMood() {
        return analyseMood(message);
    }

    String analyseMood(String message) {
        String split[] = message.split(" ");

        String messageToReturn = "";

        for (String var : split) {
            if (var.equalsIgnoreCase("Sad")) {
                messageToReturn = var;
                break;
            } else if (var.equalsIgnoreCase("Happy")) {
                messageToReturn = var;
                break;
            }
        }

        if (messageToReturn.equals("")) {
            return "Happy";
        }

        return messageToReturn;
    }

}