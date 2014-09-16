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
public class MessageService
{
    private MessageReader reader;
    private MessageWriter writer;
    
    public MessageService(MessageReader reader, MessageWriter writer)
    {
        setReader(reader);
        setWriter(writer);
    }
    
    public void processMessage()
    {
        String message = reader.readMessage();
        writer.writeMessage(message);
    }

    public final void setReader(MessageReader reader) {
        this.reader = reader;
    }

    public final void setWriter(MessageWriter writer) {
        this.writer = writer;
    }
}
