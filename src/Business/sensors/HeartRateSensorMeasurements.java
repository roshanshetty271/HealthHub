/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.sensors;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author prasanna
 */
public class HeartRateSensorMeasurements extends Thread{
    
    private String measuredTimeStamp;
    private static int count; 
    

    public ArrayList<VitalSigns> generateVitalSign(ArrayList<String> trackList, ArrayList<VitalSigns> vitalSignsList)
    {
   
    VitalSigns vitalSigns;
     Random random = new Random();
     while(count < 5)
    {
     vitalSigns = new VitalSigns();
    for(String vs : trackList)
    {
     if(vs.equals("Heart Rate"))
     {
     int heartRate = (random.nextInt(75))+55;
  //        System.out.println("setHeartRate >> "+ heartRate);
          vitalSigns.setHeartRate(heartRate);
     }
   
     if(vs.equals("Systollic Blood Pressure"))
     {
    int sysBP = (random.nextInt(40))+80;
  //       System.out.println("setSystolicBloodpressure >> "+ sysBP);
         vitalSigns.setSystolicBloodpressure(sysBP);
       
     }
     
     if(vs.equals("Respiratory Rate"))
     {
      float respiratoryRate = (random.nextInt(20))+12;
  //    System.out.println("respiratoryRate >> "+ (float)(Math.random()*20)+12);
       vitalSigns.setRespiratoryRate(respiratoryRate);
     }
    
      if(vs.equals("Weight"))
     {
        float weight = (random.nextInt(160))+20;
  //    System.out.println("weight >> "+ weight);
      vitalSigns.setWeightInPounds(weight);
     
     }
   
    }
       DateFormat df = new SimpleDateFormat("EEE, MMM d, YYYY hh:mm aaa");
         Calendar cal = Calendar.getInstance();
       String timestamp = df.format(cal.getTime());
       
       vitalSigns.setTimeStamp(timestamp);
        count ++;  
  //      System.out.println("count " +count);
        
      vitalSignsList.add(vitalSigns);
    }
    if(count>=5)
     {
  //    System.out.println("count before return "+count);
      count=0;   
      return vitalSignsList;
     }
    return vitalSignsList;
   
    }
    
  
    @Override
    public String toString() {
        return this.measuredTimeStamp;
    }

  
 private volatile boolean stop = false;

  private static int counter = 0;

  public void run() {
    while (!stop && counter < 3) {
        counter++;
      System.out.println();
    }
  
    if (stop)
    {
      System.out.println("Detected stop");
    }
    
  }

  public void requestStop() {
    stop = true;
  }
  
    
}
