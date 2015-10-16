package se.beamonpeople.anslagstavla;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Stoffe on 2015-10-16.
 */
public class DataHandler {

    private String dataLog;


    public void addToLog(String row){
        if(dataLog == null)
            dataLog = row + "\r\n";
        else {
            dataLog += row + "\r\n";
        }
    }

    public String getTotalLog(){
        return  dataLog;
    }
}
