/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling.Testes;

import timetabling.*;
import static timetabling.DadosEngenhariaComputacaoMatutino.getClassCHSPractice;
import static timetabling.DadosEngenhariaComputacaoMatutino.getClassCHSTheory;

/**
 *
 * @author HOME
 */
public class CONSTANTS {
    
     public static int ENGENHARIA_COMPUTACAO_MATUTINO = 1;
     public static int ENGENHARIA_COMPUTACAO_NOTURNO  = 2;
     public static int ENGENHARIA_ELETRICA            = 3;
     public static int ENGENHARIA_MECANICA            = 4;
     
    public static int MORNING = 1;
    public static int AFTERNOON = 2;
    public static int MORNING_AFTERNOON = 3;
    public static int EVENING = 4;
 
    //Tipo de aula
     public static int THEORY                          = 0;
     public static int PRACTICE                        = 1;
     public static int THEORY_PRACTICE                 = 2;
     
    //carga horaria de aula
     public static int CHS_96                          = 96;
     public static int CHS_64                          = 64;
     public static int CHS_48                          = 48;
     public static int CHS_32                          = 32;
     public static int CHS_16                          = 16;
     
    //Quantidade de salas disponiveis
    //Cada sala e seguida da sequencia numerica
     public static int CLASSROOMS                       = 12;
     public static int LABORATORY_CLASSROOM_ECM         = 2;
     
     
    //Retorna tipo de turma se ela e apenas teorica, pratica ou ambos
    public static String getNameTypeClass(int data){
   
        if(THEORY == data)
            return "SL ";
        else if(PRACTICE == data)
            return "LAB";
        
        return null;
    }
}
