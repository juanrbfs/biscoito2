/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling;

/**
 *
 * @author 
 */
public class Gene {

    private int course;
    //Periodo vai de 1 - 48
    //1 periodo tem 4 meses ( 4 estruturas para um mesmo periodo)
    private int period;
    //Objeto de vetores de interios
    private Object _class[][];
    private int column;
    private int line;
   
    Gene(int corse,int period){
        this.course = corse;
        this.period = period;
        
        if(period == CONSTANTS.MORNING){
            _class = new Object[3][5];
            column = 5;
            line = 3;
        }
        
        else if(period == CONSTANTS.AFTERNOON){
            _class = new Object[2][5];
            column = 5;
            line = 2;   
        }
        
        else if(period == CONSTANTS.MORNING_AFTERNOON){
            _class = new Object[5][5];
            column = 5;
            line = 5;
        }
     
        else if(period == CONSTANTS.EVENING){
            _class = new Object[3][5];
            column = 5;
            line = 3;
        }
        
       
    }
    
    public static int getPeriodNumber(int data){
        return data%4;
    }
    
    
    public static int getPeriod(int data){
        
        if(data%4 == 0)
          return data/4;
        
        return (data/4) +1;
    }
    
    /**
     * @return the course
     */
    public int getCourse() {
        return course;
    }

    /**
     * @param course the corse to set
     */
    public void setCourse(int course) {
        this.course = course;
    }

    /**
     * @return the period
     */
    public int getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(int period) {
        this.period = period;
    }

    /**
     * @return the _class
     */
    public Object[][] _getClass() {
        return _class;
    }

    /**
     * @param _class the _class to set
     */
    public void setClass(Object[][] _class) {
        this._class = _class;
    }
    
    public int[] createClass() {
        return new int[6];
    }
    
    public static void printClass(Object _class[][],int line,int column){
       
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(_class[i][j] != null){
                    int array[] =  (int[]) _class[i][j];
                    for (int k = 0; k < array.length; k++) {
                        System.out.print(array[k]);
                    }
                    System.out.print("|");
                }
                else{
                    System.out.print("  -  |");
                }
                    
            }
            System.out.println();
        }
    }
    
    public static void printClassSIGLA(Object _class[][],int line,int column){
       
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(_class[i][j] != null){
                    int array[] =  (int[]) _class[i][j];
                    System.out.print(DadosEngenhariaComputacaoMatutino.getClassLabel(array[0]));
                    System.out.print("|");
                }
                else{
                    System.out.print("  -  |");
                }
                    
            }
            System.out.println();
        }
    }
    
    public static void printClassAll(Object _class[][],int line,int column){
       
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(_class[i][j] != null){
                    int array[] =  (int[]) _class[i][j];
                    String label = DadosEngenhariaComputacaoMatutino.getClassLabel(array[0]).trim();
                    int lengthLabel = label.length();
                    
                    while(label.length() <6)
                        label = label+" ";
                    
                    System.out.print(label);//Label disciplina
                    System.out.print("????? ");//professor
                    String periodo = "";
                    if(array[2] < 10)
                        periodo = "0"+array[2];
                    else if(array[2] < 99)
                        periodo = ""+array[2];
                    
                    System.out.print(periodo+" ");//periodo
                    System.out.print(array[3]+" ");//Carga Horaria
                    System.out.print(CONSTANTS.getNameTypeClass(array[4])+" ");//Tipo de Sala
                    String sala = "";
                     if(array[5] < 10)
                        sala = "00"+array[5];
                     else if(array[5] < 100)
                        sala = "0"+array[5];
                     else
                         sala = "0"+array[5];
                    System.out.print(" "+sala);// Sala
                    System.out.print("|");
                }
                else{
                    System.out.print("            -             |");
                }
                    
            }
            System.out.println();
        }
    }

    /**
     * @return the column
     */
    public int getColumn() {
        return column;
    }

    /**
     * @return the line
     */
    public int getLine() {
        return line;
    }
}
