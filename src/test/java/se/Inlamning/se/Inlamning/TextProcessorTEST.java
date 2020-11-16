package se.Inlamning.se.Inlamning;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.Inlamning.TextProcessor;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTEST {
    @BeforeEach
    public void initEach(){
        System.out.println("Before every TEST");
    }

    @Test
    @DisplayName (" Testing the UpperCase")
    void testTextToUpperCase(){
        assertNotNull("watch out!");
    }


    @Test
    @DisplayName (" Testing the LowerCase")
    void testTextToLowerCase() {
        TextProcessor textProcessor = new TextProcessor();
        assertEquals("take it easy", textProcessor.textToLowerCase("TAKE IT EASY"));

    }
    @Test
    @DisplayName (" Testing the Reverse")
    void testReverse  () {
        TextProcessor textProcessor = new TextProcessor();
        assertEquals("krowemoh", textProcessor.reverse("homework"));

    }

}
