import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            while (true) {
                Robot r = new Robot();
                r.delay(10000);
                r.keyPress(KeyEvent.VK_SEMICOLON);
            }
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}