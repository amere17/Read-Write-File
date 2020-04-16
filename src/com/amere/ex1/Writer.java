/**
 * @author Mohamad Amer - 315336115
 * Writer Class is to write the data in the output file
 * 2020
 * EX 1
 */
//-----------------------------------------------------------------------------
package com.amere.ex1;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
//-----------------------------------------------------------------------------
public class Writer {
    private BufferedWriter writer;
    HashMap<URL,Integer> map;
    //----------------------------------------------------------

    /**
     * Constructor: get the output file path and the data
     *              to fill the output file
     * @param pathname pathe for the output  file
     * @param m_map this is the data we need to write in the output file
     * @throws IOException catch the errors of output file
     */
    public Writer(String pathname, HashMap<URL,Integer> m_map) throws IOException{
        writer = Files.newBufferedWriter(Paths.get(pathname));
        map = m_map;
    }
    //----------------------------------------------------------
    public void writeOnFile() throws IOException {
            map.forEach((key, value) -> {
                try {
                    writer.write(key + " " + value + "\n");
                } catch (IOException e) {
                }
            });
            try { writer.close();
        } catch (IOException e) {}
    }
}
//-----------------------------------------------------------------------------

