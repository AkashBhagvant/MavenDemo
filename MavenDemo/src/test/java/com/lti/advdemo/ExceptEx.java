package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptEx {
	@Test
    void testExpection() {

       Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("100");
        });
    }
    
	
	
}
