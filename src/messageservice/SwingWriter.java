/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;
import javax.swing.*;
/**
 *
 * @author viewt_000
 */
public class SwingWriter implements MessageWriter{
    
    @Override
    public void writeMessage(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    }
}
