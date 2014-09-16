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
    private static final String[] TEST_STRINGS =
    {"This is a test", "Please do not adjust your settings", "This has been a test"};
    private final Random randomGenerator = new Random();
    
    @Override
    public String readMessage()
    {
        return TEST_STRINGS[randomGenerator.nextInt(TEST_STRINGS.length - 1)];
    }
}
