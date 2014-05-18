/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cmd.admin;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CakBin
 */
public class VideoPage {
    static String VideoTitle;
    static String URL;
    static int id;
    static boolean valid;
    static int option;
    static Scanner input=new Scanner(System.in);
    
    static void SelectOption(int i) throws OptionException{
        System.out.println("Insert option: ");
        option= input.nextInt();
        if (option > i || option <0){
            throw new OptionException("Invalid Option");
        }
        else{
            valid = true;
        }
    }
    
    static void print(){
        System.out.println("Video: "+VideoTitle);
        System.out.println("Link: "+URL);
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1. Edit");
        System.out.println("2. Delete");
        System.out.println("0. Back");
    }
    static void input(){
        valid=false;
        while(!valid){
            try{
                SelectOption(2);
            }
            catch(OptionException a){
                System.out.println(a.getMessage());
            }
        }
    }
    static void execute(){
        if(option==1){VideoEditForm.action();}
        else if(option==2){VideoDeleteForm.action();}
        else{Videos.action(1,10);}
    }
    static void action(int _id){
        id=_id;
        try {
            VideoTitle=DataController.VC.SelectVideoData().get(id)[1];
            URL=DataController.VC.SelectVideoData().get(id)[2];
        } catch (SQLException ex) {
            Logger.getLogger(VideoPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        print();
        input();
        execute();
    }
}
