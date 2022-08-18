package com.endava.steps;

import io.cucumber.java.en.Given;

import javax.sound.midi.Soundbank;

public class Steps {
    @Given( "The {string} text is displayed" )
    public void theTextIsDisplayed(String text){
        System.out.println(text);
    }
}
