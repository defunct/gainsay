package com.goodworkalan.gainsay;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class GainsayExceptionTest
{
    @Test
    public void constructor()
    {
        GainsayException e = new GainsayException(101);
        assertEquals(e.getCode(), 101);
    }
}
