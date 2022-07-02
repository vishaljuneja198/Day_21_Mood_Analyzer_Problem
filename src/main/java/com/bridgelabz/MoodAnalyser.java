package com.bridgelabz;

public class MoodAnalyser {

    String message;

    MoodAnalyser() {
        this.message = "";
    }

    MoodAnalyser(String message) {
        this.message = message;
    }

    String analyseMood() {
        return analyseMood(message);
    }

    String analyseMood(String message) {

        String messageToReturn = "";

        try {

            if (message == "") {
                throw new MoodAnalysisException("Empty Mood");
            }

            String split[] = message.split(" ");
            for (String var : split) {
                if (var.equalsIgnoreCase("Sad")) {
                    messageToReturn = var;
                    break;
                } else if (var.equalsIgnoreCase("Happy")) {
                    messageToReturn = var;
                    break;
                }
            }
        } catch (NullPointerException e) {
            messageToReturn = "Happy";
        } catch (MoodAnalysisException e) {
            return e.getMessage();
        }

        if (messageToReturn.equals("")) {
            return "Happy";
        }

        return messageToReturn;
    }
}