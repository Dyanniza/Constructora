/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.lang.acl.ACLMessage;

/**
 *
 * @author Administrator
 */
public class First extends Agent{
    @Override
    protected void setup(){
        addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                //Send  message 
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.setContent("Send");
                msg.addReceiver(new AID("second",AID.ISLOCALNAME));
                send(msg);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
