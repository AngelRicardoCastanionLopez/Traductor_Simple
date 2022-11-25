/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbtis270.programacion.compile_error;

/**
 *
 * @author User
 */
public class Translator {
    
   protected String translation = "";
   protected String responsecode = "null";
   protected String apikey = "2Yf5keLjXwdFHnNetjCrHUxLKz1HgsaMD9M5reZodYFUHYM3tvzySmAKrSLJs1VdySXdPxx3e6X4jXpA4akvug6pa157woWXjd4QwWWy";
    
    public void requestTranslation(String lang, String text){
    
    translation = "Traduciria: "+text+" Al Idioma: "+lang;    
        
        }
    
    public String gotTranslation(){
    
        return translation;
        
        }
    public void setApiKey(String apik){
    
        apikey = apik;
        
        }
    
}
