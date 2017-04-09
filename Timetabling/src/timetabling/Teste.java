/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling;

/**
 *
 * @author HOME
 */
public class Teste {
     public static void main(String[] args) {
		 
//	    Gene gene =  new Gene(1,1);
//            
//            Object _class[][] = gene._getClass();
//            int turma[] = {1,1,1,1,1,1};
//            int turma2[] = {2,2,2,2,2,2};
//            _class[1][1] = turma;
//            _class[2][4] = turma2;
//            gene.printClass(gene.getLine(),gene.getColumn());           
//            System.out.println(gene);
            int courses[] = {CONSTANTS.ENGENHARIA_COMPUTACAO_MATUTINO,CONSTANTS.ENGENHARIA_COMPUTACAO_NOTURNO,CONSTANTS.ENGENHARIA_ELETRICA,CONSTANTS.ENGENHARIA_MECANICA};
            Individual individual = new Individual(courses);
            
           // individual.printIndividual(individual);         //imprime horario apenas mostrando as Siglas
            Individual.printAllInfoIndividual(individual); //imprime horario  mostrando todas as informações
	 }
}
