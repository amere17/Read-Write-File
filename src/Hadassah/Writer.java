/**
 * @author Mohamad Amer - 315336115
 * Writer Class is to write the data in the output file
 * 2020
 * EX 1
 */
//-----------------------------------------------------------------------------
package Hadassah;
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
     * @param pathname
     * @param m_map
     * @throws IOException
     */
    public Writer(String pathname, HashMap<URL,Integer> m_map) throws IOException{
        writer = Files.newBufferedWriter(Paths.get(pathname));
        map = m_map;
    }
    //----------------------------------------------------------
    public void writeOnFile() throws IOException {
        try {
            map.forEach((key, value) -> {
                try { writer.write(key + " " + value + "\n");
                }
                catch (IOException ex) { throw new UncheckedIOException(ex); }
            });
        } catch(UncheckedIOException ex) { throw ex.getCause(); }
        writer.close();
    }
}
//-----------------------------------------------------------------------------

