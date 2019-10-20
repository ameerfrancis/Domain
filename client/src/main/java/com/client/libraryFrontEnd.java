package com.client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class libraryFrontEnd extends JFrame {

    private Socket cliSock;

    ObjectOutputStream out;
    ObjectInputStream in;

    private JPanel rootPanel;
    private JTextField titleField;
    private JTextField authorField;
    private JTextField genreField;
    private JTextField publisherField;
    private JTextField supplierField;
    private JTextField idField;
    private JButton submitButton;


    public libraryFrontEnd(){

        try	{
            cliSock = new Socket("127.0.0.1",5678);

        }

        catch(Exception e){
            System.out.println("IOException");
        }

        try {

            out = new ObjectOutputStream(cliSock.getOutputStream());
            in = new ObjectInputStream(cliSock.getInputStream());
            //System.out.println("after out");
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

        setTitle("Ameer's Library");
        setSize(400, 400);
        add(rootPanel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            try{

                String title = titleField.getText();
                String author = authorField.getText();
                String genre = genreField.getText();
                String pub = publisherField.getText();
                String supp = supplierField.getText();
                String id = idField.getText();

                /*if(titleField.getText() == ""){
                    JOptionPane.showMessageDialog(null, "Please enter a title");
                }*/

                if(  titleField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a title");
                }

                else if(  authorField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter an author name");
                }

                else if(  genreField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a genre");
                }

                else if(  publisherField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a publisher");
                }

                else if(  supplierField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter a supplier");
                }

                else if(  idField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter an ID");
                }

                else{

                    JOptionPane.showMessageDialog(null,"Book added to system!\n" + "Title: " + title
                    + "\nAuthor: " + author
                    + "\nGenre: " + genre
                    + "\nPublisher: " + pub
                    + "\nSupplier: " + supp
                    + "\nBook ID: " + id);

                    titleField.setText("");
                    authorField.setText("");
                    genreField.setText("");
                    publisherField.setText("");
                    supplierField.setText("");
                    idField.setText("");


                }

                String x = "Book added: " + title + " ; " + author + " ; " + genre + " ; " + pub + " ; " + supp + " ; " + id;
                System.out.println(x);
                out.writeUTF(x);
                out.flush();
                System.out.println("Wrote to server");
            }

            catch(IOException e){

            }

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
