package com.pip.chatbot.integration.tests.food;

import com.intuit.karate.junit5.Karate;

public class FoodEndpointsTest {
    @Karate.Test
    Karate foodTests(){
        return Karate.run("./feature/food").relativeTo(getClass());
    }

}
