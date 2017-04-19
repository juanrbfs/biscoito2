/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling.Testes;

/**
 *
 * @author PMec Humanoide
 */

//classe usada para validação dos schedule
//para soluções unicas
public class MascModel {
  
    boolean classroom[][]; //mascara de salas-horario
    boolean teachers [][]; // mascara de professore-horario
    boolean students [][];  // mascara de estudante-horario
    boolean classoomCapacity[][];//mascara de capacidade das salas
    
    int n_times; // numero de timeslots
    int n_classrooms;//numero de salas
    int n_teachers;//numero de professores
    int n_student; //numero de estudantes
    int n_classoomCapacity;//capacidade das salas
    
    //Mascara de soluçoes estrutura que contrem todas as mascaras 
    Object objMask[];
    
    //inicializa com timeslots, numero de salas e numero de professores
    MascModel(int n_times,int n_classrooms,int n_teachers,int n_student, int n_classoomCapacity){
        
        //tamanho da matriz
        this.n_times            = n_times; 
        this.n_classrooms       = n_classrooms;
        this.n_teachers         = n_teachers;
        this.n_student          = n_student; 
        this.n_classoomCapacity = n_classoomCapacity;
        
        //matrizes
         classroom = new boolean[n_classrooms][n_times];                   //sala - timeslot
         teachers  = new boolean[n_teachers][n_times];                     //professores - timeslot
         students  = new boolean[n_student][n_times];                       //estudante - timeslot
         classoomCapacity = new boolean[n_classrooms][n_classoomCapacity]; // sala - capacidade
         
         initMask();
         
         objMask = new Object[5];
         objMask[0] = classroom;
         objMask[1] = teachers;
         objMask[2] = students;
         objMask[3] = classoomCapacity;
         
    }
    
    //iniciar a marcara de validação de schedule todos as matrizes
    public void initMask(){
        
        for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_classrooms; j++) {
                classroom[i][j] = false;
            }
        }
        
       for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_teachers; j++) {
                teachers[i][j] = false;
            }
        }
            
        for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_student; j++) {
                students[i][j] = false;
            }
        }
        
        for (int i = 0; i < n_classrooms; i++) {
            for (int j = 0; j < n_classoomCapacity; j++) {
                classoomCapacity[i][j] = false;
            }
        }
    }
    
    //vector timeslot,sala,professor,estudante,capacidade
    public void setValue(int vector[]){
        int timeslot = vector[0];
        int classromm = vector[1];
        int teacher = vector[2];
        int student = vector[3];
        int capacity = vector[4];
        
        classroom[classromm][timeslot] = true; 
        teachers[teacher][timeslot]  = true; 
        students[student][timeslot]  = true; 
        classoomCapacity[classromm][capacity]= true; 
    }
    
    //retorna se o ponto já esta colocado na mascara de solução
    //e seta esse ponto na mascara de solução
    public boolean isValidValue(int vector[]){
        boolean value = false;
        int timeslot = vector[0];
        int classromm = vector[1];
        int teacher = vector[2];
        int student = vector[3];
        int capacity = vector[4];
        
        if(classroom[classromm][timeslot] != true )
            value = true;
        if(teachers[teacher][timeslot]  != true)
            value = true;
        if(students[student][timeslot]  == true)
            value = true;
        if(classoomCapacity[classromm][capacity]== true)
            value = true;
        
        if(value == true){
            setValue(vector);
            return true;
        }
        
        return false;
    }
    
}
