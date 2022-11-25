/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbtis270.programacion.compile_error;

/**
 *
 * @author User
 */
public class SpeechRecognizer {
    
    protected String language = "es";
    protected String result = "";
    protected boolean useLegacy = true;
    
    public void getText(){
    
        System.out.println( "Empieza a Escuchar el Audio");
        
        result = "Resultado del audio";
        
        }
    public void setLanguage(String lang){
    
        language = lang;
        
        }
    public String afterGettingText(){
    
        return result;
        
        }
    
}
