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
import javax.swing.JOptionPane;

public class AgenteAlbañil extends Agent{
    
      @Override
   public void setup() {
        /*Se crea una descripcion del serivicio/accion que realizara el comprador*/
        DFAgentDescription template = new DFAgentDescription();
        ServiceDescription sd = new ServiceDescription();
        sd.setType("Construir Obra gruesa");
        template.addServices(sd);
        try {
            DFService.register(this, template);
        } catch (FIPAException fe) {
        }
        
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
