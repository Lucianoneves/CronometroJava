/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometrojavaa;


public class Minuto implements Runnable{
    
     private volatile boolean running = true;
     
        @Override
    public void run() {
        int i = Integer.parseInt(Tela.txtMin.getText());
        while (running) {
            Tela.txtMin.setText(i+"");
            i++;
            if(i==59){
                i=0;
            }
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            
            }
        }
    }

    void stop() {
        running = false;
      
    }
}
