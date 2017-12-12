//package com.example.javac;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
public class Atom extends JTextPane {

    public final static String NAME = "MyEditor";
    public static void main(String[] args) throws BadLocationException {
        UI u = new UI();
        u.setVisible(true);
    }
}