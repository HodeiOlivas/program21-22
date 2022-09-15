/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkg1.Model;
import pkg1.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
       // view.jSpinnerezabatu.setModel(new javax.swing.SpinnerListModel(new String[] {"7","9"}));
      view.jSpinnerezabatu.setModel(new javax.swing.SpinnerListModel(model.terminoakArrayListera()));
       gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonTxertatu.addActionListener(listener);
        view.jButtonInprimatu.addActionListener(listener);
        view.jButtonEzabatu1.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String euskaraz;
        String gazteleraz;
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":
                System.out.println("TXERTATU botoia sakatu duzu");
                Terminoa t = new Terminoa(0,view.jTextFieldEuskaraz.getText(),view.jTextFieldGazteleraz.getText());
                euskaraz = view.jTextFieldEuskaraz.getText();
                gazteleraz = view.jTextFieldGazteleraz.getText();
                model.terminoaGehitu(euskaraz,gazteleraz);
        case "INPRIMATU":
                System.out.println("INPRIMATU botoia sakatu duzu");
                model.terminoakInprimatu();
                break;
        case "EZABATU":
            int id;
             System.out.println("EZABATU botoia sakatu duzu");
            id= view.jSpinnerezabatu.getValue().hashCode();
           
             model.terminoaEzabatu(id);
           System.out.println(id +" id ezabatu duzu");
        }
    }
}
