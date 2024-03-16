package org.umg.ejercicio1;

import javax.swing.*;
import java.awt.event.*;

public class formMostrar extends JDialog {
    private JPanel contentPane;
    private JButton btnSearch;
    private JButton buttonCancel;
    private JTextArea txtArea;
    private JTextField txtSearch;
    private JTextField txtIndex;
    private int[] listado ={10,20,30,40,50,60,70,80,90,100};






    public formMostrar() {
        setContentPane(contentPane);
        setModal(true);
        setSize(300, 400);
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnSearch);

        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                search();
            }
        });





        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        for(int i=0;i<this.listado.length;i++){
            this.txtArea.setText(this.txtArea.getText()+this.listado[i]+",");
        }

    }

    private void search() {
        int n= Integer.parseInt(this.txtSearch.getText());
        int index= busquedaBinaria(this.listado,n);
        this.txtIndex.setText(index+"");
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        formMostrar dialog = new formMostrar();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arreglo[medio] == elemento) {
                return medio;
            }
            if (arreglo[medio] < elemento) {
                izquierda = medio + 1;
            }
            else {
                derecha = medio - 1;
            }
        }
        return -1;
    }
}
