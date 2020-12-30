/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Second extends Agent{
     @Override
     protected void setup(){
         addBehaviour(new CyclicBehaviour() {
             @Override
             public void action() {
                 //Receive the other agent message
                 ACLMessage msg = receive();
                 if (msg!=null) {
                     JOptionPane.showMessageDialog(null,"Message received" + msg.getContent());
                 }else block();
                 //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             }
         });
         
     }
    
}
