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

//Usado para Testes enquanto a parte do leitura de arquivos nao estiver pronta, 
//não sei ,ve o que faz com isso aqui , sei la
public class DadosEngenhariaComputacao {
    //Disciplinas
    
    public static int ALGORITMOS_PROGRAMACAO_1          = 1;
    public static int CALCULO_1                         = 2;
    public static int QUIMICA_GERAL                     = 3;
    public static int QUIMICA_GERAL_EXPERIMENTAL        = 4;
    public static int INTRODUCAO_ENGENHARIA_COMPUTACAO  = 5;
    public static int FUNDAMENTOS_LOGICA                = 6;
    
    //2 PERIODO
    public static int CALCULO_2                         = 7;
    public static int ALGEBRA_LINEAR                    = 8;
    public static int ALGORITMOS_PROGRAMACAO_2          = 9;
    public static int FISICA_1                          = 10;
    public static int LABORATORIO_FISICA_1              = 11;
    
    //3 PERIODO
    public static int ESTRUTURA_DADOS_1                 = 12;
    public static int EQUACOES_DIFERENCIAS              = 13;
    public static int CALCULO_3                         = 14;
    public static int MATEMATICA_DISCRETA               = 15;
    public static int FISICA_3                          = 16;
    
    //4 PERIODO
    public static int ESTRUTURA_DADOS_2                 = 17;
    public static int FISICA_4                          = 18;
    public static int LABORATORIO_FISICA_4              = 19;
    public static int ELETROMAGNETISMO                  = 20;
    public static int DESENHO_TECNICO                   = 21;
    public static int METODOS_MATEMATICOS_LINEARES      = 22;
    
    //5 PERIODO
    public static int BANCO_DADOS_1                     = 23;
    public static int CIRCUITOS_ELETRICOS_1             = 24;
    public static int LABORATORIO_CIRCUITOS_ELETRICOS   = 25;
    public static int ANALISE_SISTEMAS_LINEARES         = 26;
    public static int MATERIAIS_ELETRICOS               = 27;
    public static int LABORATORIO_MATERIAIS_ELETRICOS   = 28;
    
    //6 PERIODO
    public static int PROBABILIDADE_ESTATISTICA          = 29;
    public static int SISTEMA_CONTROLE                   = 30;
    public static int CONVERSAO_ELETROMECANICA_ENERGIA_1 = 31;
    public static int LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA = 32;
    public static int ELETRONICA_1                       = 33;
    public static int LABORATORIO_ELETRONICA             = 34;
    
    //7 PERIODO
    public static int CALCULO_NUMERICO                  = 35;
    public static int FENOMENOS_TRANSPORTE              = 36;
    public static int MECANICA                          = 37;
    public static int LABORATORIO_SISTEMA__CONTROLE     = 38;
    public static int CIRCUITOS_LOGICOS_1               = 39;
    public static int LABORATORIO_CIRCUITOS_LOGICOS_1   = 40;
     
    //8 PERIODO
    public static int SISTEMAS_OPERACIONAIS              = 41;
    public static int RESISTENCIA_MATERIAIS_1            = 42;
    public static int METODOLOGIA_CIENTIFICA             = 43;
    public static int TEORIA_TELECOMUNICACOES            = 44;
    public static int MICROPROCESSADORES_MICROCONTROLADORES = 45;
    public static int LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = 46;  
    
    //9 PERIODO
    public static int SISTEMAS_DISTIBUIDOS_1            = 47;
    public static int LINGUAGENS_FORMAIS                = 48;
    public static int DIREITO_ENGENHARIA                = 49;
    public static int CIENCIAS_AMBIENTE                 = 50;
    public static int REDES_COMPUTADORES                = 51;
    public static int ARQUITETURA_COMPUTADORES_1        = 52;  
    
    //10 PERIODO
    public static int COMPILADORES_1                    = 53;
    public static int INTELIGENCIA_COMPUTACIONAL        = 54;
    public static int ENGENHARIA_SOFTWARE_1             = 55;
    public static int ADIMINISTRACAO_EMPRESARIAL        = 56;
    public static int ECONOMIA                          = 57;
    public static int PEQUISA_OPERACIONAL_1             = 58; 
    
    //11 PERIODO
    public static int COMPUTACAO_GRAFICA                = 59;
    public static int ENGENHARIA_ECONOMICA              = 60;
    public static int PROJETO_FINAL_CURSO_1             = 61;
    
    //12 PERIODO
    public static int ESTAGIO_SUPERSIONADO              = 62;
    public static int PROJETO_FINAL_CURSO_2             = 63;
    
    public static String AP1 = "Algoritimos e Programação 1";
    
    int[] getfirstPeriod(){
      int aux[] =  {ALGORITMOS_PROGRAMACAO_1,INTRODUCAO_ENGENHARIA_COMPUTACAO,CALCULO_1,QUIMICA_GERAL,QUIMICA_GERAL_EXPERIMENTAL,FUNDAMENTOS_LOGICA};
      return aux;
    }
    
    int[] getSecondPeriod(){
      int aux[] =  {ALGORITMOS_PROGRAMACAO_2,ALGEBRA_LINEAR,CALCULO_2,FISICA_1,LABORATORIO_FISICA_1};
      return aux;
    }
    
    int[] getThirdPeriod(){
      int aux[] =  {};
      return aux;
    }

    
    
    String getClassName(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return AP1;    
          
        
        return "";
    }
}
