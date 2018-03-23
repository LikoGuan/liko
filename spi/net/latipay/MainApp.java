package net.latipay;

import java.util.Iterator;  
import java.util.ServiceLoader;  

import org.java.SearchEngine;
  
public class MainApp {  
  
    public static void main(String[] args) {  
        ServiceLoader<SearchEngine> loader = ServiceLoader.load(SearchEngine.class);  
        Iterator<SearchEngine> item = loader.iterator();  
        while (item.hasNext()) {  
            SearchEngine engine = item.next();  
	    System.out.println(engine.search());
        }  
    }  
}  
