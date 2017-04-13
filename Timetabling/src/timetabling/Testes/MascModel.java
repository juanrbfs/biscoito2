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
  
    int classroom[][]; //mascara de salas-horario
    int teachers [][]; // mascara de professore-horario
    int _classes [][]; // mascara de disciplinas-horario
    int student [][];  // mascara de estudante-horario
    int classoomCapacity[][];
    
    int n_times; 
    int n_classes;  
    int n_classrooms;
    int n_teachers;
    int n_student; 
    int n_classoomCapacity;
    
    
    Object objMask[];
    
    //inicializa com timeslots, numero de disciplinas, numero de salas e numero de professores
    MascModel(int n_times,int n_classes,int n_classrooms,int n_teachers,int n_student, int n_classoomCapacity){
        
        this.n_times            = n_times; 
        this.n_classes          = n_classes;  
        this.n_classrooms       = n_classrooms;
        this.n_teachers         = n_teachers;
        this.n_student          = n_student; 
        this.n_classoomCapacity = n_classoomCapacity;
        
         classroom = new int[n_classrooms][n_times]; 
         teachers  = new int[n_teachers][n_times]; 
         _classes  = new int[n_classes][n_times]; 
         student  = new int[n_student][n_times]; 
         classoomCapacity = new int[n_classrooms][n_classoomCapacity];
         
         initMask();
         
         objMask = new Object[5];
         objMask[0] = classroom;
         objMask[1] = teachers;
         objMask[2] = _classes;
         objMask[3] = student;
         objMask[4] = classoomCapacity;
         
    }
    
    //iniciar a marcara de validação de schedule
    public void initMask(){
        
        for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_classes; j++) {
                classroom[i][j] = 0;
            }
        }
        
       for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_teachers; j++) {
                teachers[i][j] = 0;
            }
        }
        
        for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_classrooms; j++) {
                _classes[i][j] = 0;
            }
        }
        
        for (int i = 0; i < n_times; i++) {
            for (int j = 0; j < n_student; j++) {
                student[i][j] = 0;
            }
        }
    }
    
    
}
