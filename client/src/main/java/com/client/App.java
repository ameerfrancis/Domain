package com.client;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                libraryFrontEnd x = new libraryFrontEnd();
                x.setVisible(true);


            }
        });


    }
}
