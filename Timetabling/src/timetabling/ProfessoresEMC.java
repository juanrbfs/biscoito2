/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetabling;

import static timetabling.DadosEngenhariaComputacaoMatutino.ADIMINISTRACAO_EMPRESARIAL;
import static timetabling.DadosEngenhariaComputacaoMatutino.ALGEBRA_LINEAR;
import static timetabling.DadosEngenhariaComputacaoMatutino.ALGORITMOS_PROGRAMACAO_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.ALGORITMOS_PROGRAMACAO_2;
import static timetabling.DadosEngenhariaComputacaoMatutino.ANALISE_SISTEMAS_LINEARES;
import static timetabling.DadosEngenhariaComputacaoMatutino.ARQUITETURA_COMPUTADORES_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.BANCO_DADOS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.CALCULO_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.CALCULO_2;
import static timetabling.DadosEngenhariaComputacaoMatutino.CALCULO_3;
import static timetabling.DadosEngenhariaComputacaoMatutino.CALCULO_NUMERICO;
import static timetabling.DadosEngenhariaComputacaoMatutino.CIENCIAS_AMBIENTE;
import static timetabling.DadosEngenhariaComputacaoMatutino.CIRCUITOS_ELETRICOS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.CIRCUITOS_LOGICOS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.COMPILADORES_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.COMPUTACAO_GRAFICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.CONVERSAO_ELETROMECANICA_ENERGIA_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.DESENHO_TECNICO;
import static timetabling.DadosEngenhariaComputacaoMatutino.DIREITO_ENGENHARIA;
import static timetabling.DadosEngenhariaComputacaoMatutino.ECONOMIA;
import static timetabling.DadosEngenhariaComputacaoMatutino.ELETROMAGNETISMO;
import static timetabling.DadosEngenhariaComputacaoMatutino.ELETRONICA_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.ENGENHARIA_ECONOMICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.ENGENHARIA_SOFTWARE_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.EQUACOES_DIFERENCIAS;
import static timetabling.DadosEngenhariaComputacaoMatutino.ESTAGIO_SUPERSIONADO;
import static timetabling.DadosEngenhariaComputacaoMatutino.ESTRUTURA_DADOS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.ESTRUTURA_DADOS_2;
import static timetabling.DadosEngenhariaComputacaoMatutino.FENOMENOS_TRANSPORTE;
import static timetabling.DadosEngenhariaComputacaoMatutino.FISICA_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.FISICA_3;
import static timetabling.DadosEngenhariaComputacaoMatutino.FISICA_4;
import static timetabling.DadosEngenhariaComputacaoMatutino.FUNDAMENTOS_LOGICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.INTELIGENCIA_COMPUTACIONAL;
import static timetabling.DadosEngenhariaComputacaoMatutino.INTRODUCAO_ENGENHARIA_COMPUTACAO;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_CIRCUITOS_ELETRICOS;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_CIRCUITOS_LOGICOS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_ELETRONICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_FISICA_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_FISICA_4;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_MATERIAIS_ELETRICOS;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES;
import static timetabling.DadosEngenhariaComputacaoMatutino.LABORATORIO_SISTEMA_CONTROLE;
import static timetabling.DadosEngenhariaComputacaoMatutino.LINGUAGENS_FORMAIS;
import static timetabling.DadosEngenhariaComputacaoMatutino.MATEMATICA_DISCRETA;
import static timetabling.DadosEngenhariaComputacaoMatutino.MATERIAIS_ELETRICOS;
import static timetabling.DadosEngenhariaComputacaoMatutino.MECANICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.METODOLOGIA_CIENTIFICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.METODOS_MATEMATICOS_LINEARES;
import static timetabling.DadosEngenhariaComputacaoMatutino.MICROPROCESSADORES_MICROCONTROLADORES;
import static timetabling.DadosEngenhariaComputacaoMatutino.PEQUISA_OPERACIONAL_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.PROBABILIDADE_ESTATISTICA;
import static timetabling.DadosEngenhariaComputacaoMatutino.PROJETO_FINAL_CURSO_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.PROJETO_FINAL_CURSO_2;
import static timetabling.DadosEngenhariaComputacaoMatutino.QUIMICA_GERAL;
import static timetabling.DadosEngenhariaComputacaoMatutino.QUIMICA_GERAL_EXPERIMENTAL;
import static timetabling.DadosEngenhariaComputacaoMatutino.REDES_COMPUTADORES_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.RESISTENCIA_MATERIAIS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.SISTEMAS_DISTIBUIDOS_1;
import static timetabling.DadosEngenhariaComputacaoMatutino.SISTEMAS_OPERACIONAIS;
import static timetabling.DadosEngenhariaComputacaoMatutino.SISTEMA_CONTROLE;
import static timetabling.DadosEngenhariaComputacaoMatutino.TEORIA_TELECOMUNICACOES;

/**
 *
 * @author HOME
 */
public class ProfessoresEMC {
    
    public static int ADALBERTO        = 1;
    public static int ADMYR            = 2;
    public static int ADRIANO          = 3;
    public static int ANA_CLAUDIA      = 4;
    public static int ANDREIA          = 5;
    public static int ANTONIO_BALEEIRO = 6;
    public static int ANTONIO_MELO     = 7;
    public static int BERNARDO         = 8;
    public static int CACILDA          = 9;
    public static int CARLOS_GALVAO    = 10;
    public static int CASSIO_VINHAL    = 11;
    public static int COLEMAR          = 12;
    public static int DEMOSTENES       = 13;
    public static int EMILSON          = 14;
    public static int ENES             = 15;
    public static int EULER            = 16;
    public static int FERNANDO_MELO    = 17;
    public static int FLAVIO           = 18;
    public static int GELSON_BRIGATTO  = 19;
    public static int GELSON_CRUZ      = 20;
    public static int GETULIO          = 21;
    public static int GEYVERSON        = 22;
    public static int GISELE           = 23;
    public static int IGOR_KOPCAK      = 24;
    public static int JOAO_PAULO       = 25;
    public static int JOSE_WILSON      = 26;
    public static int KARINA           = 27;
    public static int KLEBER_FIGUEIREDO= 28;
    public static int LEONARDO_BRITO   = 29;
    public static int LEONARDO_QUEIROZ = 30;
    public static int LEONARDO_GUEDES  = 31;
    public static int LINA_PAOLA       = 32;
    public static int LOURENCO         = 33;
    public static int MARA_GRACE       = 34;
    public static int MARCELO_STEHLING = 35;
    public static int MARCO_ASSFALK    = 36;
    public static int MARCOS_SOUZA     = 37;
    public static int MARLIPE          = 38;
    public static int REINALDO         = 39;
    public static int RODRIGO_LEMOS    = 40;
    public static int ROSANGELA        = 41;
    public static int SANDRERLEY       = 42;
    public static int SERGIO_FIGUEIREDO= 43;
    public static int SERGIO_GRANATO   = 44;
    public static int SERGIO_PIMENTEL  = 45;
    public static int SIGIO            = 46;
    public static int THYAGO_MARQUES   = 47;
    public static int TOMAS_BADAN      = 48;
    public static int WANDER           = 49;
    public static int WANIR            = 50;
    public static int WEBER            = 51;
    
    public static int ProfessorINF1    = 52;
    public static int ProfessorINF2    = 53;
    public static int ProfessorINF3    = 54;
    public static int ProfessorINF4    = 55;
    public static int ProfessorINF5    = 56;
    public static int ProfessorINF6    = 57;
    
    public static int ProfessorIME1    = 58;
    public static int ProfessorIME2    = 59;
    public static int ProfessorIME3    = 60;
    public static int ProfessorIME4    = 61;
    public static int ProfessorIME5    = 62;
    public static int ProfessorIME6    = 63;
    
    public static int ProfessorIQ1     = 64;
    public static int ProfessorIQ2     = 65;
    

    public static String _ADALBERTO        = "Adalberto José Batista";
    public static String _ADMYR            = "Ademyr Gonçalves de Oliveira";
    public static String _ADRIANO          = "Adriano César Santana";
    public static String _ANA_CLAUDIA      = "Ana Cláudia Marques do Valle";
    public static String _ANDREIA          = "Andreia Aoyagui Nascimento";
    public static String _ANTONIO_BALEEIRO = "Antônio César Baleeiro Alves";
    public static String _ANTONIO_MELO     = "Antônio Melo de Oliveira";
    public static String _BERNARDO         = "Bernardo Pinheiro de Alvarenga";
    public static String _CACILDA          = "Cacilda de Jesus Ribeiro";
    public static String _CARLOS_GALVAO    = "Carlos Galvão Pinheiro Júnior";
    public static String _CASSIO_VINHAL    = "Cássio Dener Noronha Vinhal";
    public static String _COLEMAR          = "Colemar Arruda";
    public static String _DEMOSTENES       = "Demostenes Ferreira Filho";
    public static String _EMILSON          = "Emilson Rocha de Oliveira";
    public static String _ENES             = "Enes Gonçalves Marra";
    public static String _EULER            = "Euler Bueno dos Santos";
    public static String _FERNANDO_MELO    = "Fernando Ferreira de Melo";
    public static String _FLAVIO           = "Flávio Henrique Teles Vieira";
    public static String _GELSON_BRIGATTO  = "Gelson Antônio A. Brigatto";
    public static String _GELSON_CRUZ      = "Gélson da Cruz Júnior";
    public static String _GETULIO          = "Getúlio Antero de Deus Júnior";
    public static String _GEYVERSON        = "Geyverson Teixeira de Paula";
    public static String _GISELE           = "Gisele Guimarães";
    public static String _IGOR_KOPCAK      = "Igor Kopcak";
    public static String _JOAO_PAULO       = "João Paulo da Silva Fonseca";
    public static String _JOSE_WILSON      = "José Wilson Lima Nerys";
    public static String _KARINA           = "Karina Rocha Gomes da Silva";
    public static String _KLEBER_FIGUEIREDO= "Kléber Mendes de Figueiredo";
    public static String _LEONARDO_BRITO   = "Leonardo da Cunha Brito";
    public static String _LEONARDO_QUEIROZ = "Leonardo de Queiroz Moreira";
    public static String _LEONARDO_GUEDES  = "Leonardo Guerra de Rezende Guedes";
    public static String _LINA_PAOLA       = "Lina Paola Garces Negrete";
    public static String _LOURENCO         = "Lourenço Matias";
    public static String _MARA_GRACE       = "Mara Grace Silva Figueiredo";
    public static String _MARCELO_STEHLING = "Marcelo Stehling de Castro";
    public static String _MARCO_ASSFALK    = "Marco Antônio Assfalk de Oliveira";
    public static String _MARCOS_SOUZA     = "Marcos Antonio de Sousa";
    public static String _MARLIPE          = "Marlipe Garcia Fagundes Neto";
    public static String _REINALDO         = "Reinaldo Gonçalves Nogueira";
    public static String _RODRIGO_LEMOS    = "Rodrigo Pinto Lemos";
    public static String _ROSANGELA        = "Rosângela Nunes A. de Castro";
    public static String _SANDRERLEY       = "Sandrerley Ramos Pires";
    public static String _SERGIO_FIGUEIREDO= "Sérgio Araújo de Figueiredo";
    public static String _SERGIO_GRANATO   = "Sérgio Granato de Araújo";
    public static String _SERGIO_PIMENTEL  = "Sérgio Pires Pimentel";
    public static String _SIGIO            = "Sigeo Kitatani Júnior";
    public static String _THYAGO_MARQUES   = "Thyago Carvalho Marques";
    public static String _TOMAS_BADAN      = "Tomás Antônio Costa Badan";
    public static String _WANDER           = "Wander Gonçalves da Silva";
    public static String _WANIR            = "Wanir José Medeiros Júnior";
    public static String _WEBER            = "Weber Martins";
    

    
    public static int[] getProfessoresALGORITMOS_PROGRAMACAO_1                       (){
        int aux[] = {ProfessorINF1,ProfessorINF2,ProfessorINF3,ProfessorINF4,ProfessorINF5,ProfessorINF6};
        return new int[1]; 
    }
    public static int[] getProfessoresCALCULO_1                                      (){
        int aux[] = {ProfessorIME1,ProfessorIME2,ProfessorIME3,ProfessorIME4,ProfessorIME5,ProfessorIME6};
        return new int[1]; 
    }
    public static int[] getProfessoresQUIMICA_GERAL                                  (){
        int aux[] = {ProfessorIQ1,ProfessorIQ2};
        return new int[1]; 
    }
    public static int[] getProfessoresQUIMICA_GERAL_EXPERIMENTAL                     (){
        int aux[] = {ProfessorIQ1,ProfessorIQ2};
        return new int[1]; 
    }
    public static int[] getProfessoresINTRODUCAO_ENGENHARIA_COMPUTACAO               (){
        int aux[] = {ADRIANO};
        return aux; 
    }
    public static int[] getProfessoresFUNDAMENTOS_LOGICA                             (){
        int aux[] = {WEBER,SERGIO_PIMENTEL,CASSIO_VINHAL,ADRIANO};
        return aux;
    }
    public static int[] getProfessoresCALCULO_2                                      (){
        int aux[] = {ProfessorIME1,ProfessorIME2,ProfessorIME3,ProfessorIME4,ProfessorIME5,ProfessorIME6};
        return aux;
    }
    public static int[] getProfessoresALGEBRA_LINEAR                                 (){
    return new int[1]; 
    }
    public static int[] getProfessoresALGORITMOS_PROGRAMACAO_2                       (){
    return new int[1]; 
    }
    public static int[] getProfessoresFISICA_1                                       (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_FISICA_1                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresESTRUTURA_DADOS_1                              (){
    return new int[1]; 
    }
    public static int[] getProfessoresEQUACOES_DIFERENCIAS                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresCALCULO_3                                      (){
    return new int[1]; 
    }
    public static int[] getProfessoresMATEMATICA_DISCRETA                            (){
    return new int[1]; 
    }
    public static int[] getProfessoresFISICA_3                                       (){
    return new int[1]; 
    }
    public static int[] getProfessoresESTRUTURA_DADOS_2                              (){
    return new int[1]; 
    }
    public static int[] getProfessoresFISICA_4                                       (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_FISICA_4                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresELETROMAGNETISMO                               (){
    return new int[1]; 
    }
    public static int[] getProfessoresDESENHO_TECNICO                                (){
    return new int[1]; 
    }
    public static int[] getProfessoresMETODOS_MATEMATICOS_LINEARES                   (){
    return new int[1]; 
    }
    public static int[] getProfessoresBANCO_DADOS_1                                  (){
    return new int[1]; 
    }
    public static int[] getProfessoresCIRCUITOS_ELETRICOS_1                          (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_CIRCUITOS_ELETRICOS                (){
    return new int[1]; 
    }
    public static int[] getProfessoresANALISE_SISTEMAS_LINEARES                      (){
    return new int[1]; 
    }
    public static int[] getProfessoresMATERIAIS_ELETRICOS                            (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_MATERIAIS_ELETRICOS                (){
    return new int[1]; 
    }
    public static int[] getProfessoresPROBABILIDADE_ESTATISTICA                      (){
    return new int[1]; 
    }
    public static int[] getProfessoresSISTEMA_CONTROLE                               (){
    return new int[1]; 
    }
    public static int[] getProfessoresCONVERSAO_ELETROMECANICA_ENERGIA_1             (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 (){
    return new int[1]; 
    }
    public static int[] getProfessoresELETRONICA_1                                   (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_ELETRONICA                         (){
    return new int[1]; 
    }
    public static int[] getProfessoresCALCULO_NUMERICO                               (){
    return new int[1]; 
    }
    public static int[] getProfessoresFENOMENOS_TRANSPORTE                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresMECANICA                                       (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_SISTEMA_CONTROLE                   (){
    return new int[1]; 
    }
    public static int[] getProfessoresCIRCUITOS_LOGICOS_1                            (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_CIRCUITOS_LOGICOS_1                (){
    return new int[1]; 
    }
    public static int[] getProfessoresSISTEMAS_OPERACIONAIS                          (){
    return new int[1]; 
    }
    public static int[] getProfessoresRESISTENCIA_MATERIAIS_1                        (){
    return new int[1]; 
    }
    public static int[] getProfessoresMETODOLOGIA_CIENTIFICA                         (){
    return new int[1]; 
    }
    public static int[] getProfessoresTEORIA_TELECOMUNICACOES                        (){
    return new int[1]; 
    }
    public static int[] getProfessoresMICROPROCESSADORES_MICROCONTROLADORES          (){
    return new int[1]; 
    }
    public static int[] getProfessoresLABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES (){
    return new int[1]; 
    }  
    public static int[] getProfessoresSISTEMAS_DISTIBUIDOS_1                         (){
    return new int[1]; 
    }
    public static int[] getProfessoresLINGUAGENS_FORMAIS                             (){
    return new int[1]; 
    }
    public static int[] getProfessoresDIREITO_ENGENHARIA                             (){
    return new int[1]; 
    }
    public static int[] getProfessoresCIENCIAS_AMBIENTE                              (){
    return new int[1]; 
    }
    public static int[] getProfessoresREDES_COMPUTADORES_1                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresARQUITETURA_COMPUTADORES_1                     (){
    return new int[1]; 
    }  
    public static int[] getProfessoresCOMPILADORES_1                                 (){
    return new int[1]; 
    }
    public static int[] getProfessoresINTELIGENCIA_COMPUTACIONAL                     (){
    return new int[1]; 
    }
    public static int[] getProfessoresENGENHARIA_SOFTWARE_1                          (){
    return new int[1]; 
    }
    public static int[] getProfessoresADIMINISTRACAO_EMPRESARIAL                     (){
    return new int[1]; 
    }
    public static int[] getProfessoresECONOMIA                                       (){
    return new int[1]; 
    }
    public static int[] getProfessoresPEQUISA_OPERACIONAL_1                          (){
    return new int[1]; 
    } 
    public static int[] getProfessoresCOMPUTACAO_GRAFICA                             (){
    return new int[1]; 
    }
    public static int[] getProfessoresENGENHARIA_ECONOMICA                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresPROJETO_FINAL_CURSO_1                          (){
    return new int[1]; 
    }
    public static int[] getProfessoresESTAGIO_SUPERSIONADO                           (){
    return new int[1]; 
    }
    public static int[] getProfessoresPROJETO_FINAL_CURSO_2                          (){
    return new int[1]; 
    }
    
    
   //Retorna professores  da disciplina dado o codigo da disciplina
    public static int[] getClassName(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return getProfessoresALGORITMOS_PROGRAMACAO_1();    
        else if(INTRODUCAO_ENGENHARIA_COMPUTACAO == data)  
          return getProfessoresINTRODUCAO_ENGENHARIA_COMPUTACAO();
        else if(CALCULO_1 == data)
            return getProfessoresCALCULO_1();
        else if(QUIMICA_GERAL == data)
            return getProfessoresQUIMICA_GERAL();
        else if(QUIMICA_GERAL_EXPERIMENTAL == data)
            return getProfessoresQUIMICA_GERAL_EXPERIMENTAL();
        else if(FUNDAMENTOS_LOGICA == data)
            return getProfessoresFUNDAMENTOS_LOGICA();
        else if(ALGORITMOS_PROGRAMACAO_2 == data)
            return getProfessoresALGORITMOS_PROGRAMACAO_2();
        else if(ALGEBRA_LINEAR == data)
            return getProfessoresALGEBRA_LINEAR();
        else if(CALCULO_2 == data)
            return getProfessoresCALCULO_2();
        else if(FISICA_1 == data)
            return getProfessoresFISICA_1();
        else if(LABORATORIO_FISICA_1 == data)
            return getProfessoresLABORATORIO_FISICA_1();
        else if(ESTRUTURA_DADOS_1 == data)
            return getProfessoresESTRUTURA_DADOS_1();
        else if(EQUACOES_DIFERENCIAS == data)
            return getProfessoresEQUACOES_DIFERENCIAS();
        else if(CALCULO_3 == data)
            return getProfessoresCALCULO_3();
        else if(FISICA_3 == data)
            return getProfessoresFISICA_3();
        else if(MATEMATICA_DISCRETA == data)
            return getProfessoresMATEMATICA_DISCRETA();
        else if(ESTRUTURA_DADOS_2 == data)
            return getProfessoresESTRUTURA_DADOS_2();
        else if(METODOS_MATEMATICOS_LINEARES == data)
            return getProfessoresMETODOS_MATEMATICOS_LINEARES();
        else if(ELETROMAGNETISMO == data)
            return getProfessoresELETROMAGNETISMO();
        else if(FISICA_4 == data)
            return getProfessoresFISICA_4();
        else if(LABORATORIO_FISICA_4 == data)
            return getProfessoresLABORATORIO_FISICA_4();
        else if(DESENHO_TECNICO == data)
            return getProfessoresDESENHO_TECNICO();
        else if(BANCO_DADOS_1 == data)
            return getProfessoresBANCO_DADOS_1();
        else if(ANALISE_SISTEMAS_LINEARES == data)
            return getProfessoresANALISE_SISTEMAS_LINEARES();
        else if(CIRCUITOS_ELETRICOS_1 == data)
            return getProfessoresCIRCUITOS_ELETRICOS_1();
        else if(LABORATORIO_CIRCUITOS_ELETRICOS == data)
            return getProfessoresLABORATORIO_CIRCUITOS_ELETRICOS();
        else if(MATERIAIS_ELETRICOS == data)
            return getProfessoresMATERIAIS_ELETRICOS();
        else if(LABORATORIO_MATERIAIS_ELETRICOS == data)
            return getProfessoresLABORATORIO_MATERIAIS_ELETRICOS();
        else if(PROBABILIDADE_ESTATISTICA == data)
            return getProfessoresPROBABILIDADE_ESTATISTICA();
        else if(SISTEMA_CONTROLE == data)
            return getProfessoresSISTEMA_CONTROLE();
        else if (CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return getProfessoresCONVERSAO_ELETROMECANICA_ENERGIA_1();
        else if(LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return getProfessoresLABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1();
        else if(ELETRONICA_1 == data)
            return getProfessoresELETRONICA_1();
        else if(LABORATORIO_ELETRONICA == data)
            return getProfessoresLABORATORIO_ELETRONICA();
        else if(FENOMENOS_TRANSPORTE == data)
            return getProfessoresFENOMENOS_TRANSPORTE();
        else if(CALCULO_NUMERICO == data)
            return getProfessoresCALCULO_NUMERICO();
        else if(LABORATORIO_SISTEMA_CONTROLE == data)
            return getProfessoresLABORATORIO_SISTEMA_CONTROLE();
        else if(MECANICA == data)
            return getProfessoresMECANICA();
        else if(CIRCUITOS_LOGICOS_1 == data)
            return getProfessoresCIRCUITOS_LOGICOS_1();
        else if(LABORATORIO_CIRCUITOS_LOGICOS_1 == data)
            return getProfessoresLABORATORIO_CIRCUITOS_LOGICOS_1();
        else if(SISTEMAS_OPERACIONAIS == data)
            return getProfessoresSISTEMAS_OPERACIONAIS();
        else if(METODOLOGIA_CIENTIFICA == data)
            return getProfessoresMETODOLOGIA_CIENTIFICA();
        else if(RESISTENCIA_MATERIAIS_1 == data)
            return getProfessoresRESISTENCIA_MATERIAIS_1();
        else if(TEORIA_TELECOMUNICACOES == data)
            return getProfessoresTEORIA_TELECOMUNICACOES();
        else if(LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES == data)
            return getProfessoresLABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES();
        else if (MICROPROCESSADORES_MICROCONTROLADORES == data)
            return getProfessoresMICROPROCESSADORES_MICROCONTROLADORES();
        else if(SISTEMAS_DISTIBUIDOS_1 == data)
            return getProfessoresSISTEMAS_DISTIBUIDOS_1();
        else if(LINGUAGENS_FORMAIS == data)
            return getProfessoresLINGUAGENS_FORMAIS();
        else if(DIREITO_ENGENHARIA == data)
            return getProfessoresDIREITO_ENGENHARIA();
        else if(REDES_COMPUTADORES_1 == data)
            return getProfessoresREDES_COMPUTADORES_1();
        else if(CIENCIAS_AMBIENTE == data)
            return getProfessoresCIENCIAS_AMBIENTE();
        else if(ARQUITETURA_COMPUTADORES_1 == data)
            return getProfessoresARQUITETURA_COMPUTADORES_1();
        else if(COMPILADORES_1 == data)
            return getProfessoresCOMPILADORES_1();
        else if(INTELIGENCIA_COMPUTACIONAL == data)
            return getProfessoresINTELIGENCIA_COMPUTACIONAL();
        else if(PEQUISA_OPERACIONAL_1 == data)
            return getProfessoresPEQUISA_OPERACIONAL_1();
        else if(ADIMINISTRACAO_EMPRESARIAL == data)
            return getProfessoresADIMINISTRACAO_EMPRESARIAL();
        else if(ECONOMIA == data)
            return getProfessoresECONOMIA();
        else if(ENGENHARIA_SOFTWARE_1 == data)
            return getProfessoresENGENHARIA_SOFTWARE_1();
        else if(COMPUTACAO_GRAFICA == data)
            return getProfessoresCOMPUTACAO_GRAFICA();
        else if(PROJETO_FINAL_CURSO_1 == data)
            return getProfessoresPROJETO_FINAL_CURSO_1();
        else if(ENGENHARIA_ECONOMICA == data)
            return getProfessoresENGENHARIA_ECONOMICA();
        else if(PROJETO_FINAL_CURSO_2 == data)
            return getProfessoresPROJETO_FINAL_CURSO_2();
        else if(ESTAGIO_SUPERSIONADO == data)
            return getProfessoresESTAGIO_SUPERSIONADO();
        
        return null;
    }
       
}
