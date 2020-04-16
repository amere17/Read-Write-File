/**
 * @author Mohamad Amer - 315336115
 * Class to sort the map of the urls by there value
 * 2020
 * EX 1
 */
//-----------------------------------------------------------------------------
package com.amere.ex1;
import java.net.URL;
import java.util.*;
//-----------------------------------------------------------------------------
public class Controller {

    private HashMap<URL,Integer> sortedMap;
//-------------------------------------------------------------------
    /**
     *
     * @param map
     * constructor for the controller to get the hashmap
     */
    public Controller(final HashMap<URL, Integer> map){
        sortedMap = map;
    }
//-------------------------------------------------------------------
    /**
     *
     * @return sortedMap
     * Function to return the map after sorting method
     */
    public HashMap<URL,Integer> getMap(){
        return sortedMap;
    }
//-------------------------------------------------------------------
    /**
     * Function to sort the map by the value
     */
    public void sortMap(){
        List<Map.Entry<URL, Integer> > list =
                new LinkedList<Map.Entry<URL, Integer> >(sortedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<URL, Integer> >() {
            public int compare(Map.Entry<URL, Integer> url1,
                               Map.Entry<URL, Integer> url2)
            {
                return (url1.getValue()).compareTo(url2.getValue());
            }
        });
        HashMap<URL, Integer> temp = new LinkedHashMap<URL, Integer>();
        for (Map.Entry<URL, Integer> url : list) {
            temp.put(url.getKey(), url.getValue());
        }
        sortedMap = temp;
    }
}
//-----------------------------------------------------------------------------
