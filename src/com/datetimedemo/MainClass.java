/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datetimedemo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

/**
 *
 * @author rahul
 */
public class MainClass {
    public static void main(String args[]){
        Set<String> ids=ZoneId.getAvailableZoneIds();
//        System.out.println(ids);
        for(String s:ids){
            LocalDateTime d=LocalDateTime.now(ZoneId.of(s));
            System.out.println(s+"\t\t\t\t\t"+d.getHour());
        }
        
        
        
//        Set<String> zoneids=ZoneId.getAvailableZoneIds();
//        for(String zone:zoneids){
//            LocalDateTime d=LocalDateTime.now(ZoneId.of(zone));
//            System.out.println(zone+"\t"+d);
//        }
        
    }
}
