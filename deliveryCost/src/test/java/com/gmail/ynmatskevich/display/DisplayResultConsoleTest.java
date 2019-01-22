package com.gmail.ynmatskevich.display;

import com.gmail.ynmatskevich.calculate.DeliveryCost;
import com.gmail.ynmatskevich.calculate.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DisplayResultConsoleTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Calculator deliveryCost = new DeliveryCost(10, 10);

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void displayResultTest() {
        new DisplayResultConsole().displayResult(deliveryCost);
        assertEquals("Resulted cost:\n1000.00\n", out.toString());
    }

}