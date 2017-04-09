package timetabling;

import java.util.ArrayList;
import java.util.List;

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
        int lengthPeriods = 1; //contador do numero de periodos
        int n=0; //contador do cromossomo variavel auxiliar para setar o gene no cromossomo
        
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
                System.out.println("ENGENHARIA_COMPUTACAO_MATUTINO");
               //do something
               //gerar individuo
               int periods = DadosEngenhariaComputacaoMatutino.COURSE_PERIODS;
               months = DadosEngenhariaComputacaoMatutino.MONTHS;
                  
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
               
               Object vector[] = {firstPeriod,secondPeriod,thirdPeriod,fouthPeriod,fifthPeriod,sixthPeriod,seventhPeriod,eighthPeriod,ninthPeriod,tenthPeriod,eleventhPeriod,twelfthPeriod} ;
               
                for (int j = 0; j < vector.length; j++) {//percorre o array de periodos
                    
                    int array[]= (int[]) vector[j]; // pegar o vetor de disciplinas em um periodo
                  // int array[]= (int[]) vector[0];                   
                    List<List<int[]>> list =  processClassesEngenhariaComputacaoMatutino(array,lengthPeriods);
                       
                        for (int k = 0; k < list.size(); k++) { 
                             Gene gene =  new Gene(CONSTANTS.ENGENHARIA_COMPUTACAO_MATUTINO,CONSTANTS.MORNING); //criar um Gene
                             Object _class[][] = gene._getClass(); //Obter a matriz de horarios
                            for (int l = 0; l < list.get(k).size(); l++) {
                                int obj[] = (int[]) list.get(k).get(l);
                                addClass(_class,gene.getLine(),gene.getColumn(),obj );//adicionar turma na matriz de horarios
                            }
                            
                             chromosome[n] = gene; 
                             n++; //incrementar o contador do cromossomo
                             lengthPeriods++; //incrementar o contador de periodos
                        }
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
    
    //Metodo que gera uma turma 
    //retornando uma turma dado um vetor de disciplinas
    //implementar ainda
    private int[] processClass(int _class,int period, int typeClassroom){
       
        int cell[] = new int[6];
       
        //0-codigo;
        //1 - professor
        //2 - periodo
        //3 - carga horaria;
        //4 - tipo sala;
        //4 - sala;
        
        cell[0] = _class;//codigo disciplina
        cell[1] = 0;//implementar professor
        cell[2] = period;//periodo
        cell[3] = DadosEngenhariaComputacaoMatutino.getClassCHS(_class);//carga Horaria
        cell[4] = typeClassroom;//Tipo sala
        cell[5] = 0;//sala //implementar                     
        
        return cell;
    }
    
    //Metodo que gera uma turma 
    //retornando uma turma dado um vetor de disciplinas
    private List<List<int[]>> processClassesEngenhariaComputacaoMatutino(int _classes[],int periodo){
        
        List<List<int[]>> list = new ArrayList<List<int[]>>(); //lista de 4 posiçoes cada posção 1 mes de um periodo
                                                               // de uma lista de turmas
                                                               //cada lista de turma tem a quantidade de turmas por mês
        
        list.add(new ArrayList<int[]>()); //primeiro mês
        list.add(new ArrayList<int[]>());//segundo mês
        list.add(new ArrayList<int[]>());//terceiro mÊs
        list.add(new ArrayList<int[]>());//quarto mês
        
        for (int i = 0; i < _classes.length; i++) {//precorre o array de disciplinas ofertadas no semestre
            
            int aux = _classes[i]; //recebe o valor do codigo da disciplina
            
            int type = DadosEngenhariaComputacaoMatutino.getTypeClass(aux); // verifica o tipo da disciplina teoria, pratica, ou ambos
            
            if(type == CONSTANTS.THEORY){ // se for apenas teoria
                int chs = DadosEngenhariaComputacaoMatutino.getClassCHS(aux);
                int quantity = DadosEngenhariaComputacaoMatutino.getClassCHSBlockPerMonth(chs); // quantidade de blocos de aula por mês
                int typeClassroom = CONSTANTS.THEORY;
               
               // System.out.print(DadosEngenhariaComputacaoMatutino.getClassLabel(aux));
              //  System.out.println(" t:"+quantity);
               if(quantity == 12){ // 3 aulas por semana
                    for (int j = 0; j < 4; j++) { //cada mês recebe três turmas da disciplina  
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }   
                }
               else if(quantity == 8){// 2 aulas por semana
                    for (int j = 0; j < 4; j++) {    
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }   
                }
                else if(quantity == 6){ //duas aulas nos dois primeiros meses
                    for (int j = 0; j < 2; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }
                   for (int j = 2; j < 4; j++) {//uma aula nos dois ultimos meses
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    } 
                }
                else if(quantity == 4){//1 aula por mês
                    for (int j = 0; j < 4; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }   
                }
                else if(quantity == 2){//uma aula toda semana a cada dois meses (mes sim, mes não)
                    
                    for (int j = 1; j < 5; j++) {
                        if(j%2 == 0)
                            list.get(j-1).add(processClass(aux,periodo,typeClassroom));
                    }   
                } 
            }
            else if(type == CONSTANTS.PRACTICE){
               
                int chsp = DadosEngenhariaComputacaoMatutino.getClassCHSPractice(aux);
                int quantity = DadosEngenhariaComputacaoMatutino.getClassCHSBlockPerMonth(chsp);
                int typeClassroom = CONSTANTS.PRACTICE;
                //System.out.print(DadosEngenhariaComputacaoMatutino.getClassLabel(aux)); 
                //System.out.println(" p:"+quantity);
              if(quantity == 12){ // 3 aulas por semana
               for (int j = 0; j < 4; j++) { //cada mês recebe três turmas da disciplina  
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }   
                }
               else if(quantity == 8){// 2 aulas por semana
                    for (int j = 0; j < 4; j++) {    
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }   
                }
                else if(quantity == 6){ //duas aulas nos dois primeiros meses
                    for (int j = 0; j < 2; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }
                   for (int j = 2; j < 4; j++) {//uma aula nos dois ultimos meses
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    } 
                }
                else if(quantity == 4){//1 aula por mês
                    for (int j = 0; j < 4; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom));
                    }   
                }
                else if(quantity == 2){//uma aula toda semana a cada dois meses (mes sim, mes não)
                    
                    for (int j = 1; j < 5; j++) {
                        if(j%2 == 0)
                            list.get(j-1).add(processClass(aux,periodo,typeClassroom));
                    }   
                } 
            }
            
            else if( type == CONSTANTS.THEORY_PRACTICE){
               // System.out.print(DadosEngenhariaComputacaoMatutino.getClassLabel(aux));
                int chsp = DadosEngenhariaComputacaoMatutino.getClassCHSPractice(aux);
                int chst = DadosEngenhariaComputacaoMatutino.getClassCHSTheory(aux);
                int quantityTheory = DadosEngenhariaComputacaoMatutino.getClassCHSBlockPerMonth(chst);
                int quantityPractice = DadosEngenhariaComputacaoMatutino.getClassCHSBlockPerMonth(chsp);
                
                
                int typeClassroom1 = CONSTANTS.THEORY;
                int typeClassroom2 = CONSTANTS.PRACTICE;
               // System.out.print(" t:"+quantityTheory);
               // System.out.println(" p:"+quantityPractice);
                if(quantityTheory == 8){
                    for (int j = 0; j < 4; j++) {    
                        list.get(j).add(processClass(aux,periodo,typeClassroom1));
                        list.get(j).add(processClass(aux,periodo,typeClassroom1));
                    }   
                }
                else if(quantityTheory == 6){
                    for (int j = 1; j < 2; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom1));
                        list.get(j).add(processClass(aux,periodo,typeClassroom1));
                    }
                   for (int j = 2; j < 4; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom1));
                    } 
                }
                else if(quantityTheory == 4){
                    for (int j = 0; j < 4; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom1));
                    }   
                }
                else if(quantityTheory == 2){
                    
                    for (int j = 1; j < 5; j++) {
                        if(j%2 == 0)
                            list.get(j -1).add(processClass(aux,periodo,typeClassroom1));
                    }   
                }
                
               if(quantityPractice == 8){
                    for (int j = 0; j < 4; j++) {    
                        list.get(j).add(processClass(aux,periodo,typeClassroom2));
                        list.get(j).add(processClass(aux,periodo,typeClassroom2));
                    }   
                }
               else if(quantityPractice == 6){
                    for (int j = 1; j < 2; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom2));
                        list.get(j).add(processClass(aux,periodo,typeClassroom2));
                    }
                   for (int j = 2; j < 4; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom2));
                    } 
                }
               else if(quantityPractice == 4){
                    for (int j = 0; j < 4; j++) {
                        list.get(j).add(processClass(aux,periodo,typeClassroom2));
                    }   
                }
               else if(quantityPractice == 2){
                    
                    for (int j = 1; j < 5; j++) {
                        if(j%2 == 0)
                            list.get(j -1).add(processClass(aux,periodo,typeClassroom2));
                    }   
                } 
            }
  
        }
//Debugar a lista de saida       
//        for (int k = 0; k < list.size(); k++) {        
//             System.out.println("SIZE"+k+":" + list.get(k).size()); 
//            
//            for (int i = 0; i < list.get(k).size(); i++) {
//                int a[] = (int[])list.get(k).get(i);
//                System.out.println(DadosEngenhariaComputacaoMatutino.getClassLabel(a[0]));
//            }
//        }
        
        return list;
    }
    
    //metodo para setar uma valor na matriz de disciplinas
    //implementado de modo sequencial
    public void addClass(Object _class[][],int line,int column, int [] data){
       
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if(_class[i][j] == null){
                    _class[i][j] = data;
                    return;
                }     
            }
        }
    }
    
    //imprimir o individuo
    //Sequencia de genes (matrizes de horario)
    public static void printIndividual(Individual individual){
       Gene chromosome[] = individual.chromosome;
       System.out.println("1:"+"____________________________________________");
       System.out.println("SEG  |TER  |QUA  |QUI  |SEX  |SAB  |");
       
       for (int i = 0; i < chromosome.length; i++) {
           Gene gene = chromosome[i];
           Gene.printClassSIGLA(gene._getClass(),gene.getLine(),gene.getColumn());
           System.out.println("---------------------------------------------");
           
           if(i<chromosome.length -1) {
            System.out.println((i+2)+":"+"____________________________________________");
            System.out.println("SEG  |TER  |QUA  |QUI  |SEX  |SAB  |");
           }
        }
    }
    
    public static void printAllInfoIndividual(Individual individual){
       Gene chromosome[] = individual.chromosome;
            System.out.println(1+":"+"_______________________________________________________________________________________________________________________________________________________________");
            System.out.println("SEG                       |TER                       |QUA                       |QUI                       |SEX                       |SAB                       |");
       
       for (int i = 0; i < chromosome.length; i++) {
           Gene gene = chromosome[i];
           Gene.printClassAll(gene._getClass(),gene.getLine(),gene.getColumn());
           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           
           if(i<chromosome.length -1) {
            System.out.println((i+2)+":"+"_______________________________________________________________________________________________________________________________________________________________");
            System.out.println("SEG                       |TER                       |QUA                       |QUI                       |SEX                       |SAB                       |");
           }
        }
    }
}
