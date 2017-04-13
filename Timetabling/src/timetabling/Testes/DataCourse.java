/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling.Testes;

import timetabling.*;

/**
 *
 * @author HOME
 */
public class DataCourse {
    
    public static int PORTUGUES                          = 1;
    public static int MATEMATICA                         = 2;
    public static int FISICA                             = 3;
    public static int QUIMICA                            = 4;
    public static int BIOLOGIA                           = 5;
    public static int GEOGRAFIA                          = 6;
    public static int HISTORIA                           = 7;
    public static int INGLES                             = 8;
    public static int ESPANHOL                           = 9;
    
    public static int CHS_PORTUGUES                      = 1;
    public static int CHS_MATEMATICA                     = 2;
    public static int CHS_FISICA                         = 3;
    public static int CHS_QUIMICA                        = 4;
    public static int CHS_BIOLOGIA                       = 5;
    public static int CHS_GEOGRAFIA                      = 6;
    public static int CHS_HISTORIA                       = 7;
    public static int CHS_INGLES                         = 8;
    public static int CHS_ESPANHOL                       = 9;
    
    public static String _PORTUGUES                      = "Português";
    public static String _MATEMATICA                     = "Matemática";
    public static String _FISICA                         = "Física";
    public static String _QUIMICA                        = "Química";
    public static String _BIOLOGIA                       = "Biologia";
    public static String _GEOGRAFIA                      = "Geografia";
    public static String _HISTORIA                       = "História";
    public static String _INGLES                         = "Inglês";
    public static String _ESPANHOL                       = "Espanhol";
    
    public static String SIGLA_PORTUGUES                      = "POR";
    public static String SIGLA_MATEMATICA                     = "MAT";
    public static String SIGLA_FISICA                         = "FÍS";
    public static String SIGLA_QUIMICA                        = "QUI";
    public static String SIGLA_BIOLOGIA                       = "BIO";
    public static String SIGLA_GEOGRAFIA                      = "GEO";
    public static String SIGLA_HISTORIA                       = "HIS";
    public static String SIGLA_INGLES                         = "ING";
    public static String SIGLA_ESPANHOL                       = "ESP";
    
        //Metodos para retorna as disciplinas de um determinado periodo
    public static int[] getClasses(){
      int aux[] =  {PORTUGUES,MATEMATICA,FISICA,QUIMICA,BIOLOGIA,GEOGRAFIA,HISTORIA,INGLES,ESPANHOL};
      return aux;
    }
    
    //Retorna quantidade da carga horaria da disciplina dado o codigo da disciplina
    public static int getClassCHS(int data){
        
        if(PORTUGUES == data)
          return CHS_PORTUGUES;    
        else if(MATEMATICA == data)  
          return CHS_MATEMATICA;
        else if(FISICA == data)
            return CHS_FISICA;
        else if(QUIMICA == data)
            return CHS_QUIMICA;
        else if(BIOLOGIA == data)
            return CHS_BIOLOGIA;
        else if(GEOGRAFIA == data)
            return CHS_GEOGRAFIA;
        else if(HISTORIA == data)
            return CHS_HISTORIA;
        else if(INGLES == data)
            return CHS_INGLES;
        else if(ESPANHOL == data)
            return CHS_ESPANHOL;
        
        return -1;
    }
    
    //Retorna o nome  da disciplina o codigo da disciplina
    public static String getClassName(int data){
        
        if(PORTUGUES == data)
          return _PORTUGUES;    
        else if(MATEMATICA == data)  
          return _MATEMATICA;
        else if(FISICA == data)
            return _FISICA;
        else if(QUIMICA == data)
            return _QUIMICA;
        else if(BIOLOGIA == data)
            return _BIOLOGIA;
        else if(GEOGRAFIA == data)
            return _GEOGRAFIA;
        else if(HISTORIA == data)
            return _HISTORIA;
        else if(INGLES == data)
            return _INGLES;
        else if(ESPANHOL == data)
            return _ESPANHOL;
        
        return null;
    }
    
    //Retorna a sigla da disciplina dado o codigo
    public static String getClassLabel(int data){
        
        if(PORTUGUES == data)
          return SIGLA_PORTUGUES;    
        else if(MATEMATICA == data)  
          return SIGLA_MATEMATICA;
        else if(FISICA == data)
            return SIGLA_FISICA;
        else if(QUIMICA == data)
            return SIGLA_QUIMICA;
        else if(BIOLOGIA == data)
            return SIGLA_BIOLOGIA;
        else if(GEOGRAFIA == data)
            return SIGLA_GEOGRAFIA;
        else if(HISTORIA == data)
            return SIGLA_HISTORIA;
        else if(INGLES == data)
            return SIGLA_INGLES;
        else if(ESPANHOL == data)
            return SIGLA_ESPANHOL;
        
        return null;
    }
    
   //Retorna quantidade de bloco para cada disciplina por mês
    public static int getClassCHSBlockPerMonth(int data){
   
        if(CONSTANTS.CHS_96 == data)
            return 12;
        if(CONSTANTS.CHS_64 == data)
            return 8;
        if(CONSTANTS.CHS_48 == data)
            return 6;
        if(CONSTANTS.CHS_32 == data)
            return 4;
        if(CONSTANTS.CHS_16 == data)
            return 2;
        
        return -1;
    }
}
