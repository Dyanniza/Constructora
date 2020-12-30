/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora;

/**
 *
 * @author Carlos Alberto
 */

import jade.core.Agent;

import jade.core.AID;
import jade.core.behaviours.*;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.domain.DFService;
import jade.domain.FIPAException;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import java.util.ArrayList;



public class AgenteArquitecto extends Agent {
 
    @Override
   public void setup() {
        /*Se crea una descripcion del serivicio/accion que realizara el comprador*/
        DFAgentDescription template = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        sd.setType("Realizar planos");
        template.addServices(sd);
        try {
            DFService.register(this, template);
        } catch (FIPAException fe) {
        }
        //el agente se encarga primero de realizar el estudio de suelo, medio ambiente etc
          addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                System.out.println("El agente realiza un estudio de las condiciones");
            }
        });
          
         // el agente realiza el disenio de planos 
           addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                System.out.println("Realiza el disenio de planos");
            }
        });
           
           /*addBehaviour(new OneShotBehaviour(this){
            @ Override
            public void action(){
               System.out.println("Entregar planos a albañil");
            }
           });*/
           
            addBehaviour(new TickerBehaviour(this, 30000) {
            @Override
            protected void onTick() {
                //addBehaviour(new EntregarPlanos());
            }
        });
            
        addBehaviour(new OneShotBehaviour(this) {
            @Override
            public void action() {
                //Send  message 
                ACLMessage msg = new ACLMessage(ACLMessage.INFORM);
                msg.setContent("Send");
                msg.addReceiver(new AID("second",AID.ISLOCALNAME));
                send(msg);
                
            }
        });
        
  
   }
    
}
