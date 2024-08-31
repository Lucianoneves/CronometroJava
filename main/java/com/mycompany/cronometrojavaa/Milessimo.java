/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cronometrojavaa;


public class Milessimo implements Runnable {
    
    
    private volatile boolean running = true;

    @Override
    public void run() {
          int i = Integer.parseInt(Tela.txtMil.getText());
        while (running) {
            Tela.txtMil.setText(i+"");
            i++;
            if(i==1000)
                i=0;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void stop() {
      running = false;
    }
}




    
       

    

