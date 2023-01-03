package com.kata.demo.lcd;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LCDMonitorTest {

    @Test
    void display_number_one_lcd_style() {
        // Arrange
        String expectedLCDStyleNumbers = "|\n|";

        // Act
        LCDMonitor lcdMonitor = new LCDMonitor();
        String displayLCDStyleNumbers = lcdMonitor.displayLCDStyleNumbers("1");

        // Assert
        assertThat(displayLCDStyleNumbers).isEqualTo(expectedLCDStyleNumbers);
    }
}