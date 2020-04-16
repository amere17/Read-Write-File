/**
 * @author Mohamad Amer - 315336115
 * Url: - method to check the string from the input file is a url
 *      - method to get the length of the content for the url
 * 2020
 * EX 1
 */
//-----------------------------------------------------------------------------
package com.amere.ex1;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
//-----------------------------------------------------------------------------
public class Url {
    private int Length = 0;
    private String url;
    private boolean validUrl;
    //----------------------------------------------------------

    /**
     * Constructor
     * @param mUrl set the string to check if this string is url/not url
     */
    public Url(String mUrl){
        this.url = mUrl;
        try {
           calcLength(url);
        }catch (Exception e){}
    }
    //----------------------------------------------------------

    /**
     * @return the content length for the valid url
     */
    public int getLength(){
        if(Length == -1)
            return 0;
        return Length;
    }
    //----------------------------------------------------------

    /**
     * return the boolean variable of the object
     * @return if the url is valid or not
     */
    public boolean isValidUrl(){
        return validUrl;
    }
    //----------------------------------------------------------

    /**
     * calc the content length for the url
     * @param url url to calculate the content length
     * @throws IOException exception for the errors in this method
     */
    private void calcLength(String url) throws IOException {
        URL urlT;
        urlT = new URL(url);
        URLConnection c = urlT.openConnection();
        c.connect();
        validUrl = true;
        this.Length = c.getContentLength();
    }
}
//-----------------------------------------------------------------------------
