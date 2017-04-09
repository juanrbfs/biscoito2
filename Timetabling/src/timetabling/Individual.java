package timetabling;

public class Individual {
    
    public static final int     NO_MUTATION               = 0;   // Não aplica mutação
    public static final int     UNIFORM_MUTATION          = 1;   // Mutação uniforme
    
    //Individuo uma lista de gene(Gene e um estrutura de dados com curso, periodo e uma matriz de vetores do tipo int)
    private Gene chromosome[];
    private int  fitness      = 0;
    private int listCourses[];
  
    //tamanho do vetor de inteiros é igual a 4 
    //implementado para os cursos de ECM, ECN, EE,EM
    public Individual(int[] courses) {
        listCourses = new int[4];
        int numGenes = 0;
        int months =0;
        //preecher lista  para guardar a ordem dos cursos
        //e inicializar o tamanho do individuo
        //sendo igual a soma dos periodos de cada curso
        for(int i=0;i<courses.length;i++){
            
            if(courses[i] == CONSTANTS.ENGENHARIA_COMPUTACAO_MATUTINO ){
                months = DadosEngenhariaComputacaoMatutino.MONTHS;
                numGenes += DadosEngenhariaComputacaoMatutino.COURSE_PERIODS*months;
                listCourses[i] = CONSTANTS.ENGENHARIA_COMPUTACAO_MATUTINO;
            }
            if(courses[i] == CONSTANTS.ENGENHARIA_COMPUTACAO_NOTURNO ){
                numGenes += 0;//IMPLEMENTAR
                listCourses[i] = CONSTANTS.ENGENHARIA_COMPUTACAO_NOTURNO;
            }
            if(courses[i] == CONSTANTS.ENGENHARIA_ELETRICA ){
                numGenes += 0;//IMPLEMENTAR
                listCourses[i] = CONSTANTS.ENGENHARIA_ELETRICA;
            }
             if(courses[i] == CONSTANTS.ENGENHARIA_MECANICA){
                numGenes += 0;//IMPLEMENTAR
                listCourses[i] = CONSTANTS.ENGENHARIA_MECANICA;
            }
            
        }
             
        chromosome = new Gene[numGenes];
        
         for(int i=0;i<listCourses.length;i++){
            
            if(listCourses[i] == CONSTANTS.ENGENHARIA_COMPUTACAO_MATUTINO ){
               //do something
               //gerar individuo
               int periods = DadosEngenhariaComputacaoMatutino.COURSE_PERIODS;
               months = DadosEngenhariaComputacaoMatutino.MONTHS;
               int lengthPeriods = periods*months;
               
               int firstPeriod[]   = DadosEngenhariaComputacaoMatutino.getFirstPeriod();
               int secondPeriod[]  = DadosEngenhariaComputacaoMatutino.getSecondPeriod();
               int thirdPeriod[]   = DadosEngenhariaComputacaoMatutino.getThirdPeriod();
               int fouthPeriod[]   = DadosEngenhariaComputacaoMatutino.getFouthPeriod();
               int fifthPeriod[]   = DadosEngenhariaComputacaoMatutino.getFifthPeriod();
               int sixthPeriod[]   = DadosEngenhariaComputacaoMatutino.getSixthPeriod();
               int seventhPeriod[] = DadosEngenhariaComputacaoMatutino.getSeventhPeriod();
               int eighthPeriod[]  = DadosEngenhariaComputacaoMatutino.getEighthPeriod();
               int ninthPeriod[]   = DadosEngenhariaComputacaoMatutino.getNinthPeriod();
               int tenthPeriod[]   = DadosEngenhariaComputacaoMatutino.getTenthPeriod();
               int eleventhPeriod[]= DadosEngenhariaComputacaoMatutino.getEleventhPeriod();
               int twelfthPeriod[] = DadosEngenhariaComputacaoMatutino.getTwelfthPeriod();
               
               for(int j=0;j<lengthPeriods;j++){
                   
               }
               
               
               
            }
            if(listCourses[i] == CONSTANTS.ENGENHARIA_COMPUTACAO_NOTURNO ){
               //IMPLEMENTAR
            }
            if(listCourses[i] == CONSTANTS.ENGENHARIA_ELETRICA ){
               //IMPLEMENTAR     
            }
             if(listCourses[i] == CONSTANTS.ENGENHARIA_MECANICA){
               //IMPLEMENTAR  
            }
            
        }
        
        processFitness();       
      
    }
    
    public int getFitness() {
        return 0;
    }
   
    public String getGenes() {
        return "";
    }

    private void processFitness() {
       
    }
}
