/**
 * @author Mohamad Amer - 315336115
 * Reader class for reading the file of the input
 * 2020
 * EX 1
 */
//-----------------------------------------------------------------------------
package com.amere.ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
//-----------------------------------------------------------------------------
public class Reader {
    final private String fileReaderPath;
    private HashMap<URL, Integer> url_Map = new HashMap<>();
//-------------------------------------------------------------------
    /**
     * Constructor to get path of the input file
     * @param mFileReaderPath input file path
     */
    public Reader(String mFileReaderPath){
        this.fileReaderPath = mFileReaderPath;
    }
    public void readFile(){
        try{
        String fileLine;
        final BufferedReader fileReader = new BufferedReader(new FileReader(fileReaderPath));
            while ((fileLine = fileReader.readLine()) != null) {
                Url urlTest = new Url(fileLine);
                if(urlTest.isValidUrl()){
                 URL urlF = new URL(fileLine);
                 setUrl_Map(urlF,urlTest.getLength());
                }
            }
            try {
                fileReader.close();
            }catch (Exception e){}
        }
        catch (IOException e){System.err.println("bad input");}
    }
//-------------------------------------------------------------------
    /**
     *
     * @return Full urls map with the content length
     */
    public HashMap<URL, Integer> getUrlMap(){return this.url_Map;}

    /**
     * Function to append/put new data to the map
     * @param mUrl Url from the input file
     * @param len length of the content for this url
     */
    public void setUrl_Map(URL mUrl,Integer len) {
        this.url_Map.put(mUrl,len);
    }
}
//-----------------------------------------------------------------------------
