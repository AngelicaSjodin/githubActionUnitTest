package com.example.githubActionUnitTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void myMethodShouldReturnSum(){
        //arrange
        Controller controller = new Controller();

        //act
        int result = controller.myMethod(1,2);

        //assert
        assertEquals(4,result);
    }

    @Test
    void divisionShouldReturnQoute(){
        //arrange
        Controller controller = new Controller();

        //act
        double result = controller.divicion(4,2);

        //assert
        assertEquals(2,result);
    }

}