/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpatternjavaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Ominext
 */
public class DecoratorPatternJavaIO {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int c;
        try
        {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("./test")));
            while((c = in.read()) >= 0)
            {
                System.out.println((char)c);
            }
            in.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
