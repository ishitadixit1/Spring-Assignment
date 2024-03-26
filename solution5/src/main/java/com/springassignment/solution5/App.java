package com.springassignment.solution5;

import service.TrainerService;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	 TrainerService trainerService = new TrainerService();
         List<Trainer> trainers = trainerService.getAllTrainersWithSessions();
         for (Trainer trainer : trainers) {
             System.out.println("Trainer: " + trainer.getName());
             System.out.println("Sessions:");
             int c=1;
             for (Session session : trainer.getSessions()) {
                 System.out.println(c+". " + session.getName());
                 c++;
             }
             c=1;
             System.out.println();
         }
    }
}
