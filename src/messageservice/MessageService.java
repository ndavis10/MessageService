/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;

/**
 *
 * @author viewt_000
 */
public class MessageService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MessageReader reader = new SwingReader();
        MessageWriter writer = new SwingWriter();
        String test = reader.readMessage();
        writer.writeMessage(test);
    }
    
}
