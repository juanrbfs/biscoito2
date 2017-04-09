/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling;

/**
 *
 * @author HugoEduardo
 */
public class Gene {
    
    public static int MORNING = 1;
    public static int AFTERNOON = 2;
    public static int MORNING_AFTERNOON = 3;
    public static int EVENING = 4;
    
    private int corse;
    private int period;
    //Objeto de vetores de interios
    private Object _class[][];
    
    Gene(){}
    
    Gene(int corse,int period){
        this.corse = corse;
        this.period = period;
        
        if(period == MORNING)
            _class = new Object[3][5];
        
        else if(period == AFTERNOON)
            _class = new Object[2][5];
        
        else if(period == MORNING_AFTERNOON)
            _class = new Object[5][5];
     
        else if(period == EVENING)
            _class = new Object[3][5];
        
        _class[1][1] = createClass();
    }
    
    /**
     * @return the corse
     */
    public int getCorse() {
        return corse;
    }

    /**
     * @param corse the corse to set
     */
    public void setCorse(int corse) {
        this.corse = corse;
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
}
