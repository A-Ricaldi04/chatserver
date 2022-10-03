package it.fi.itismeucci;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        ServerStr servente=new ServerStr();
        servente.attendi();
        servente.comunica();
    }
}
