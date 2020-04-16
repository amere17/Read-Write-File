/**
 * @author Mohamad Amer - 315336115
 * Main class to run the program
 * 2020
 * EX 1
 */
//-----------------------------------------------------------------------------
package com.amere.ex1;
import java.io.IOException;
//-----------------------------------------------------------------------------

public class Main {
    /**
     *
     * @param args pathNames for input and output files
     * @throws IOException if there is an error in the program
     * this exception will catch this error
     */
    public static void main(String[] args) throws IOException {
        Reader reader;
        Writer writer;
        Controller controller;

        if(args.length <= 1) {
            System.err.println("wrong usage");
            System.exit(0);
        }
        try {
            reader = new Reader(args[0]);
            reader.readFile();
            controller = new Controller(reader.getUrlMap());
            controller.sortMap();
            writer = new Writer(args[1],controller.getMap());
            writer.writeOnFile();
        }catch (IOException e){}


    }
}
//-----------------------------------------------------------------------------
