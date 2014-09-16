/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package messageservice;
import java.util.*;
/**
 *
 * @author viewt_000
 */
public class ArrayReader implements MessageReader
{
    private String[] strings =
    {"This is a test", "Please do not adjust your settings", "This has been a test"};
    private final Random randomGenerator = new Random(System.nanoTime());
    
    public ArrayReader()
    {
        
    }
    
    public ArrayReader(String[] strings)
    {
        setStrings(strings);
    }
    
    @Override
    public String readMessage()
    {
        return strings[randomGenerator.nextInt(strings.length)];
    }
    
    public final void setStrings(String[] strings)
    {
        this.strings = strings;
    }
}
