/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogocorrida;

/**
 *
 * @author user
 */
public class veiculo {
    
    imotor motor;
    
    veiculo(imotor m){
        
        this.motor = m;
    }
    
    public String scelerar(){
       return this.motor.acelerar(); 
    }   

    boolean acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
