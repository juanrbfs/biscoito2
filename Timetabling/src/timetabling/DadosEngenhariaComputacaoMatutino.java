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
//Fazer Teste com apenas uma turma para testar o algoritmo
//sem restrição de aulunos e professores apenas disciplinas e choque de salas e quantidade
public class DadosEngenhariaComputacaoMatutino {
    
     public static String COURSE_LABEL                          = "ECM";
     public static int COURSE_CODE                              = 1;
     public static int COURSE_PERIODS                           = 12;//periodos do curso
      public static int MONTHS                                  = 4;//meses para um semestre
       
    //Quantidade de salas disponiveis
    //Cada sala e seguida da sequencia numerica
     public static int CLASSROOM                       = 12;
     public static int LABORATORY_CLASSROOM            = 2;
     
//Disciplinas (codigo usado no codigo implementado par a teste)
    public static int ALGORITMOS_PROGRAMACAO_1                       = 1;
    public static int CALCULO_1                                      = 2;
    public static int QUIMICA_GERAL                                  = 3;
    public static int QUIMICA_GERAL_EXPERIMENTAL                     = 4;
    public static int INTRODUCAO_ENGENHARIA_COMPUTACAO               = 5;
    public static int FUNDAMENTOS_LOGICA                             = 6;
    public static int CALCULO_2                                      = 7;
    public static int ALGEBRA_LINEAR                                 = 8;
    public static int ALGORITMOS_PROGRAMACAO_2                       = 9;
    public static int FISICA_1                                       = 10;
    public static int LABORATORIO_FISICA_1                           = 11;
    public static int ESTRUTURA_DADOS_1                              = 12;
    public static int EQUACOES_DIFERENCIAS                           = 13;
    public static int CALCULO_3                                      = 14;
    public static int MATEMATICA_DISCRETA                            = 15;
    public static int FISICA_3                                       = 16;
    public static int ESTRUTURA_DADOS_2                              = 17;
    public static int FISICA_4                                       = 18;
    public static int LABORATORIO_FISICA_4                           = 19;
    public static int ELETROMAGNETISMO                               = 20;
    public static int DESENHO_TECNICO                                = 21;
    public static int METODOS_MATEMATICOS_LINEARES                   = 22;
    public static int BANCO_DADOS_1                                  = 23;
    public static int CIRCUITOS_ELETRICOS_1                          = 24;
    public static int LABORATORIO_CIRCUITOS_ELETRICOS                = 25;
    public static int ANALISE_SISTEMAS_LINEARES                      = 26;
    public static int MATERIAIS_ELETRICOS                            = 27;
    public static int LABORATORIO_MATERIAIS_ELETRICOS                = 28;
    public static int PROBABILIDADE_ESTATISTICA                      = 29;
    public static int SISTEMA_CONTROLE                               = 30;
    public static int CONVERSAO_ELETROMECANICA_ENERGIA_1             = 31;
    public static int LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 = 32;
    public static int ELETRONICA_1                                   = 33;
    public static int LABORATORIO_ELETRONICA                         = 34;
    public static int CALCULO_NUMERICO                               = 35;
    public static int FENOMENOS_TRANSPORTE                           = 36;
    public static int MECANICA                                       = 37;
    public static int LABORATORIO_SISTEMA_CONTROLE                   = 38;
    public static int CIRCUITOS_LOGICOS_1                            = 39;
    public static int LABORATORIO_CIRCUITOS_LOGICOS_1                = 40;
    public static int SISTEMAS_OPERACIONAIS                          = 41;
    public static int RESISTENCIA_MATERIAIS_1                        = 42;
    public static int METODOLOGIA_CIENTIFICA                         = 43;
    public static int TEORIA_TELECOMUNICACOES                        = 44;
    public static int MICROPROCESSADORES_MICROCONTROLADORES          = 45;
    public static int LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = 46;  
    public static int SISTEMAS_DISTIBUIDOS_1                         = 47;
    public static int LINGUAGENS_FORMAIS                             = 48;
    public static int DIREITO_ENGENHARIA                             = 49;
    public static int CIENCIAS_AMBIENTE                              = 50;
    public static int REDES_COMPUTADORES_1                           = 51;
    public static int ARQUITETURA_COMPUTADORES_1                     = 52;  
    public static int COMPILADORES_1                                 = 53;
    public static int INTELIGENCIA_COMPUTACIONAL                     = 54;
    public static int ENGENHARIA_SOFTWARE_1                          = 55;
    public static int ADIMINISTRACAO_EMPRESARIAL                     = 56;
    public static int ECONOMIA                                       = 57;
    public static int PEQUISA_OPERACIONAL_1                          = 58; 
    public static int COMPUTACAO_GRAFICA                             = 59;
    public static int ENGENHARIA_ECONOMICA                           = 60;
    public static int PROJETO_FINAL_CURSO_1                          = 61;
    public static int ESTAGIO_SUPERSIONADO                           = 62;
    public static int PROJETO_FINAL_CURSO_2                          = 63;
    
    //Carga Horaria Total das disciplinas
    public static int CHS_ALGORITMOS_PROGRAMACAO_1                       = 64;
    public static int CHS_CALCULO_1                                      = 96;
    public static int CHS_QUIMICA_GERAL                                  = 64;
    public static int CHS_QUIMICA_GERAL_EXPERIMENTAL                     = 32;
    public static int CHS_INTRODUCAO_ENGENHARIA_COMPUTACAO               = 32;
    public static int CHS_FUNDAMENTOS_LOGICA                             = 32;
    public static int CHS_CALCULO_2                                      = 96;
    public static int CHS_ALGEBRA_LINEAR                                 = 64;
    public static int CHS_ALGORITMOS_PROGRAMACAO_2                       = 64;
    public static int CHS_FISICA_1                                       = 64;
    public static int CHS_LABORATORIO_FISICA_1                           = 32;
    public static int CHS_ESTRUTURA_DADOS_1                              = 64;
    public static int CHS_EQUACOES_DIFERENCIAS                           = 64;
    public static int CHS_CALCULO_3                                      = 64;
    public static int CHS_MATEMATICA_DISCRETA                            = 64;
    public static int CHS_FISICA_3                                       = 64;
    public static int CHS_ESTRUTURA_DADOS_2                              = 64;
    public static int CHS_FISICA_4                                       = 64;
    public static int CHS_LABORATORIO_FISICA_4                           = 32;
    public static int CHS_ELETROMAGNETISMO                               = 64;
    public static int CHS_DESENHO_TECNICO                                = 32;
    public static int CHS_METODOS_MATEMATICOS_LINEARES                   = 64;
    public static int CHS_BANCO_DADOS_1                                  = 64;
    public static int CHS_CIRCUITOS_ELETRICOS_1                          = 64;
    public static int CHS_LABORATORIO_CIRCUITOS_ELETRICOS                = 16;
    public static int CHS_ANALISE_SISTEMAS_LINEARES                      = 64;
    public static int CHS_MATERIAIS_ELETRICOS                            = 64;
    public static int CHS_LABORATORIO_MATERIAIS_ELETRICOS                = 16;
    public static int CHS_PROBABILIDADE_ESTATISTICA                      = 64;
    public static int CHS_SISTEMA_CONTROLE                               = 64;
    public static int CHS_CONVERSAO_ELETROMECANICA_ENERGIA_1             = 64;
    public static int CHS_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 = 16;
    public static int CHS_ELETRONICA_1                                   = 64;
    public static int CHS_LABORATORIO_ELETRONICA                         = 16;
    public static int CHS_CALCULO_NUMERICO                               = 64;
    public static int CHS_FENOMENOS_TRANSPORTE                           = 64;
    public static int CHS_MECANICA                                       = 64;
    public static int CHS_LABORATORIO_SISTEMA_CONTROLE                   = 16;
    public static int CHS_CIRCUITOS_LOGICOS_1                            = 64;
    public static int CHS_LABORATORIO_CIRCUITOS_LOGICOS_1                = 16;
    public static int CHS_SISTEMAS_OPERACIONAIS                          = 64;
    public static int CHS_RESISTENCIA_MATERIAIS_1                        = 64;
    public static int CHS_METODOLOGIA_CIENTIFICA                         = 32;
    public static int CHS_TEORIA_TELECOMUNICACOES                        = 64;
    public static int CHS_MICROPROCESSADORES_MICROCONTROLADORES          = 64;
    public static int CHS_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = 16;  
    public static int CHS_SISTEMAS_DISTIBUIDOS_1                         = 64;
    public static int CHS_LINGUAGENS_FORMAIS                             = 32;
    public static int CHS_DIREITO_ENGENHARIA                             = 32;
    public static int CHS_CIENCIAS_AMBIENTE                              = 64;
    public static int CHS_REDES_COMPUTADORES_1                           = 64;
    public static int CHS_ARQUITETURA_COMPUTADORES_1                     = 64;  
    public static int CHS_COMPILADORES_1                                 = 64;
    public static int CHS_INTELIGENCIA_COMPUTACIONAL                     = 64;
    public static int CHS_ENGENHARIA_SOFTWARE_1                          = 64;
    public static int CHS_ADIMINISTRACAO_EMPRESARIAL                     = 32;
    public static int CHS_ECONOMIA                                       = 32;
    public static int CHS_PEQUISA_OPERACIONAL_1                          = 64; 
    public static int CHS_COMPUTACAO_GRAFICA                             = 64;
    public static int CHS_ENGENHARIA_ECONOMICA                           = 64;
    public static int CHS_PROJETO_FINAL_CURSO_1                          = 64;
    public static int CHS_ESTAGIO_SUPERSIONADO                           = 320;
    public static int CHS_PROJETO_FINAL_CURSO_2                          = 64;
    
    //Carga Horaria Teorica das disciplinas
    public static int CHST_ALGORITMOS_PROGRAMACAO_1                       = 32;
    public static int CHST_CALCULO_1                                      = 96;
    public static int CHST_QUIMICA_GERAL                                  = 64;
    public static int CHST_QUIMICA_GERAL_EXPERIMENTAL                     = 0;
    public static int CHST_INTRODUCAO_ENGENHARIA_COMPUTACAO               = 32;
    public static int CHST_FUNDAMENTOS_LOGICA                             = 32;
    public static int CHST_CALCULO_2                                      = 96;
    public static int CHST_ALGEBRA_LINEAR                                 = 64;
    public static int CHST_ALGORITMOS_PROGRAMACAO_2                       = 32;
    public static int CHST_FISICA_1                                       = 64;
    public static int CHST_LABORATORIO_FISICA_1                           = 0;
    public static int CHST_ESTRUTURA_DADOS_1                              = 48;
    public static int CHST_EQUACOES_DIFERENCIAS                           = 64;
    public static int CHST_CALCULO_3                                      = 64;
    public static int CHST_MATEMATICA_DISCRETA                            = 64;
    public static int CHST_FISICA_3                                       = 64;
    public static int CHST_ESTRUTURA_DADOS_2                              = 48;
    public static int CHST_FISICA_4                                       = 64;
    public static int CHST_LABORATORIO_FISICA_4                           = 0;
    public static int CHST_ELETROMAGNETISMO                               = 64;
    public static int CHST_DESENHO_TECNICO                                = 32;
    public static int CHST_METODOS_MATEMATICOS_LINEARES                   = 64;
    public static int CHST_BANCO_DADOS_1                                  = 48;
    public static int CHST_CIRCUITOS_ELETRICOS_1                          = 64;
    public static int CHST_LABORATORIO_CIRCUITOS_ELETRICOS                = 0;
    public static int CHST_ANALISE_SISTEMAS_LINEARES                      = 64;
    public static int CHST_MATERIAIS_ELETRICOS                            = 64;
    public static int CHST_LABORATORIO_MATERIAIS_ELETRICOS                = 0;
    public static int CHST_PROBABILIDADE_ESTATISTICA                      = 64;
    public static int CHST_SISTEMA_CONTROLE                               = 64;
    public static int CHST_CONVERSAO_ELETROMECANICA_ENERGIA_1             = 64;
    public static int CHST_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 = 0;
    public static int CHST_ELETRONICA_1                                   = 64;
    public static int CHST_LABORATORIO_ELETRONICA                         = 0;
    public static int CHST_CALCULO_NUMERICO                               = 32;
    public static int CHST_FENOMENOS_TRANSPORTE                           = 64;
    public static int CHST_MECANICA                                       = 64;
    public static int CHST_LABORATORIO_SISTEMA_CONTROLE                   = 0;
    public static int CHST_CIRCUITOS_LOGICOS_1                            = 64;
    public static int CHST_LABORATORIO_CIRCUITOS_LOGICOS_1                = 0;
    public static int CHST_SISTEMAS_OPERACIONAIS                          = 48;
    public static int CHST_RESISTENCIA_MATERIAIS_1                        = 64;
    public static int CHST_METODOLOGIA_CIENTIFICA                         = 32;
    public static int CHST_TEORIA_TELECOMUNICACOES                        = 64;
    public static int CHST_MICROPROCESSADORES_MICROCONTROLADORES          = 64;
    public static int CHST_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = 0;  
    public static int CHST_SISTEMAS_DISTIBUIDOS_1                         = 48;
    public static int CHST_LINGUAGENS_FORMAIS                             = 32;
    public static int CHST_DIREITO_ENGENHARIA                             = 32;
    public static int CHST_CIENCIAS_AMBIENTE                              = 64;
    public static int CHST_REDES_COMPUTADORES_1                           = 48;
    public static int CHST_ARQUITETURA_COMPUTADORES_1                     = 64;  
    public static int CHST_COMPILADORES_1                                 = 48;
    public static int CHST_INTELIGENCIA_COMPUTACIONAL                     = 48;
    public static int CHST_ENGENHARIA_SOFTWARE_1                          = 48;
    public static int CHST_ADIMINISTRACAO_EMPRESARIAL                     = 32;
    public static int CHST_ECONOMIA                                       = 32;
    public static int CHST_PEQUISA_OPERACIONAL_1                          = 32; 
    public static int CHST_COMPUTACAO_GRAFICA                             = 48;
    public static int CHST_ENGENHARIA_ECONOMICA                           = 64;
    public static int CHST_PROJETO_FINAL_CURSO_1                          = 0;
    public static int CHST_ESTAGIO_SUPERSIONADO                           = 0;
    public static int CHST_PROJETO_FINAL_CURSO_2                          = 0;
    
     //Carga Horaria Pratica das disciplinas
    public static int CHSP_ALGORITMOS_PROGRAMACAO_1                       = 32;
    public static int CHSP_CALCULO_1                                      = 0;
    public static int CHSP_QUIMICA_GERAL                                  = 0;
    public static int CHSP_QUIMICA_GERAL_EXPERIMENTAL                     = 32;
    public static int CHSP_INTRODUCAO_ENGENHARIA_COMPUTACAO               = 0;
    public static int CHSP_FUNDAMENTOS_LOGICA                             = 0;
    public static int CHSP_CALCULO_2                                      = 0;
    public static int CHSP_ALGEBRA_LINEAR                                 = 0;
    public static int CHSP_ALGORITMOS_PROGRAMACAO_2                       = 32;
    public static int CHSP_FISICA_1                                       = 0;
    public static int CHSP_LABORATORIO_FISICA_1                           = 32;
    public static int CHSP_ESTRUTURA_DADOS_1                              = 16;
    public static int CHSP_EQUACOES_DIFERENCIAS                           = 0;
    public static int CHSP_CALCULO_3                                      = 0;
    public static int CHSP_MATEMATICA_DISCRETA                            = 0;
    public static int CHSP_FISICA_3                                       = 0;
    public static int CHSP_ESTRUTURA_DADOS_2                              = 16;
    public static int CHSP_FISICA_4                                       = 0;
    public static int CHSP_LABORATORIO_FISICA_4                           = 32;
    public static int CHSP_ELETROMAGNETISMO                               = 0;
    public static int CHSP_DESENHO_TECNICO                                = 0;
    public static int CHSP_METODOS_MATEMATICOS_LINEARES                   = 0;
    public static int CHSP_BANCO_DADOS_1                                  = 16;
    public static int CHSP_CIRCUITOS_ELETRICOS_1                          = 0;
    public static int CHSP_LABORATORIO_CIRCUITOS_ELETRICOS                = 16;
    public static int CHSP_ANALISE_SISTEMAS_LINEARES                      = 0;
    public static int CHSP_MATERIAIS_ELETRICOS                            = 0;
    public static int CHSP_LABORATORIO_MATERIAIS_ELETRICOS                = 16;
    public static int CHSP_PROBABILIDADE_ESTATISTICA                      = 0;
    public static int CHSP_SISTEMA_CONTROLE                               = 0;
    public static int CHSP_CONVERSAO_ELETROMECANICA_ENERGIA_1             = 0;
    public static int CHSP_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 = 16;
    public static int CHSP_ELETRONICA_1                                   = 0;
    public static int CHSP_LABORATORIO_ELETRONICA                         = 16;
    public static int CHSP_CALCULO_NUMERICO                               = 32;
    public static int CHSP_FENOMENOS_TRANSPORTE                           = 0;
    public static int CHSP_MECANICA                                       = 0;
    public static int CHSP_LABORATORIO_SISTEMA_CONTROLE                   = 16;
    public static int CHSP_CIRCUITOS_LOGICOS_1                            = 0;
    public static int CHSP_LABORATORIO_CIRCUITOS_LOGICOS_1                = 16;
    public static int CHSP_SISTEMAS_OPERACIONAIS                          = 16;
    public static int CHSP_RESISTENCIA_MATERIAIS_1                        = 0;
    public static int CHSP_METODOLOGIA_CIENTIFICA                         = 0;
    public static int CHSP_TEORIA_TELECOMUNICACOES                        = 0;
    public static int CHSP_MICROPROCESSADORES_MICROCONTROLADORES          = 0;
    public static int CHSP_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = 16;  
    public static int CHSP_SISTEMAS_DISTIBUIDOS_1                         = 16;
    public static int CHSP_LINGUAGENS_FORMAIS                             = 0;
    public static int CHSP_DIREITO_ENGENHARIA                             = 0;
    public static int CHSP_CIENCIAS_AMBIENTE                              = 0;
    public static int CHSP_REDES_COMPUTADORES_1                           = 16;
    public static int CHSP_ARQUITETURA_COMPUTADORES_1                     = 0;  
    public static int CHSP_COMPILADORES_1                                 = 16;
    public static int CHSP_INTELIGENCIA_COMPUTACIONAL                     = 16;
    public static int CHSP_ENGENHARIA_SOFTWARE_1                          = 16;
    public static int CHSP_ADIMINISTRACAO_EMPRESARIAL                     = 0;
    public static int CHSP_ECONOMIA                                       = 0;
    public static int CHSP_PEQUISA_OPERACIONAL_1                          = 32; 
    public static int CHSP_COMPUTACAO_GRAFICA                             = 16;
    public static int CHSP_ENGENHARIA_ECONOMICA                           = 0;
    public static int CHSP_PROJETO_FINAL_CURSO_1                          = 64;
    public static int CHSP_ESTAGIO_SUPERSIONADO                           = 320;
    public static int CHSP_PROJETO_FINAL_CURSO_2                          = 64;
    
    //Nome Das Disciplinas
    public static String _ALGORITMOS_PROGRAMACAO_1                   = "Algoritmos e Programação 1";
    public static String _CALCULO_1                                  = "Cálculo 1A";
    public static String _QUIMICA_GERAL                              = "Química Geral B";
    public static String _QUIMICA_GERAL_EXPERIMENTAL                 = "Química Geral Experimental";
    public static String _INTRODUCAO_ENGENHARIA_COMPUTACAO           = "Introdução à Engenharia de Computação";
    public static String _FUNDAMENTOS_LOGICA                         = "Fundamentos de Lógica";
    public static String _CALCULO_2                                  = "Cálculo 2A";
    public static String _ALGEBRA_LINEAR                             = "Álgebra Linear";
    public static String _ALGORITMOS_PROGRAMACAO_2                   = "Algoritmos e Programação 2";
    public static String _FISICA_1                                   = "Física 1";
    public static String _LABORATORIO_FISICA_1                       = "Laboratório de Física 1";
    public static String _ESTRUTURA_DADOS_1                          = "Estruturas de Dados 1";
    public static String _EQUACOES_DIFERENCIAS                       = "Equações Diferenciais Ordinárias";
    public static String _CALCULO_3                                  = "Cálculo 3A";
    public static String _MATEMATICA_DISCRETA                        = "Matemática Discreta";
    public static String _FISICA_3                                   = "Física 3";
    public static String _ESTRUTURA_DADOS_2                          = "Estruturas de Dados 2";
    public static String _FISICA_4                                   = "Física 4";
    public static String _LABORATORIO_FISICA_4                       = "Laboratório de Física 4";
    public static String _ELETROMAGNETISMO                           = "Eletromagnetismo";
    public static String _DESENHO_TECNICO                            = "Desenho Técnico";
    public static String _METODOS_MATEMATICOS_LINEARES               = "Métodos Matemáticos Lineares";
    public static String _BANCO_DADOS_1                              = "Banco de Dados 1";
    public static String _CIRCUITOS_ELETRICOS_1                      = "Circuitos Elétricos 1";
    public static String _LABORATORIO_CIRCUITOS_ELETRICOS_1          = "Laboratório de Circuitos Elétricos 1";
    public static String _ANALISE_SISTEMAS_LINEARES                  = "Análise de Sistemas Lineares";
    public static String _MATERIAIS_ELETRICOS                        = "Materiais Elétricos";
    public static String _LABORATORIO_MATERIAIS_ELETRICOS            = "Laboratório de Materiais Elétricos";
    public static String _PROBABILIDADE_ESTATISTICA                  = "Probabilidade e Estatística";
    public static String _SISTEMA_CONTROLE                           = "Sistemas de Controle";
    public static String _CONVERSAO_ELETROMECANICA_ENERGIA_1         = "Conversão Eletromecânica de Energia 1";
    public static String _LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA = "Laboratório de Conversão Eletromecânica de Energia 1";
    public static String _ELETRONICA_1                               = "Eletrônica 1";
    public static String _LABORATORIO_ELETRONICA                     = "Laboratório de Eletrônica 1";
    public static String _CALCULO_NUMERICO                           = "Cálculo Numérico";
    public static String _FENOMENOS_TRANSPORTE                       = "Fenômenos de Transporte";
    public static String _MECANICA                                   = "Mecânica";
    public static String _LABORATORIO_SISTEMA_CONTROLE               = "Laboratório de Sistemas de Controle";
    public static String _CIRCUITOS_LOGICOS_1                        = "Circuitos Lógicos 1";
    public static String _LABORATORIO_CIRCUITOS_LOGICOS_1            = "Laboratório de Circuitos Lógicos 1";
    public static String _SISTEMAS_OPERACIONAIS                      = "Sistemas Operacionais";
    public static String _RESISTENCIA_MATERIAIS_1                    = "Resistência dos Materiais 1";
    public static String _METODOLOGIA_CIENTIFICA                     = "Metodologia Científica";
    public static String _TEORIA_TELECOMUNICACOES                    = "Teoria de Telecomunicações";
    public static String _MICROPROCESSADORES_MICROCONTROLADORES      = "Microprocessadores e Microcontroladores";
    public static String _LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = "Laboratório de Microprocessadores e Microcontroladores";  
    public static String _SISTEMAS_DISTIBUIDOS_1                     = "Sistemas Distribuídos 1";
    public static String _LINGUAGENS_FORMAIS                         = "Linguagens Formais";
    public static String _DIREITO_ENGENHARIA                         = "Direito para Engenharia";
    public static String _CIENCIAS_AMBIENTE                          = "Ciências do Ambiente";
    public static String _REDES_COMPUTADORES_1                       = "Redes de Computadores 1";
    public static String _ARQUITETURA_COMPUTADORES_1                 = "Arquitetura de Computadores 1";  
    public static String _COMPILADORES_1                             = "Compiladores 1";
    public static String _INTELIGENCIA_COMPUTACIONAL                 = "Inteligência Computacional";
    public static String _ENGENHARIA_SOFTWARE_1                      = "Engenharia de Software 1";
    public static String _ADIMINISTRACAO_EMPRESARIAL                 = "Administração Empresarial";
    public static String _ECONOMIA                                   = "Economia";
    public static String _PEQUISA_OPERACIONAL_1                      = "Pesquisa Operacional 1"; 
    public static String _COMPUTACAO_GRAFICA                         = "Computação Gráfica";
    public static String _ENGENHARIA_ECONOMICA                       = "Engenharia Econômica";
    public static String _PROJETO_FINAL_CURSO_1                      = "Projeto Final de Curso 1";
    public static String _ESTAGIO_SUPERSIONADO                       = "Estágio Supervisionado";
    public static String _PROJETO_FINAL_CURSO_2                      = "Projeto Final de Curso 2";
    
    //SIGLA Das Disciplinas
    public static String SIGLA_ALGORITMOS_PROGRAMACAO_1                   = "AP1  ";
    public static String SIGLA_CALCULO_1                                  = "C1A  ";
    public static String SIGLA_QUIMICA_GERAL                              = "QGB  ";
    public static String SIGLA_QUIMICA_GERAL_EXPERIMENTAL                 = "QGE  ";
    public static String SIGLA_INTRODUCAO_ENGENHARIA_COMPUTACAO           = "IEC  ";
    public static String SIGLA_FUNDAMENTOS_LOGICA                         = "FL   ";
    public static String SIGLA_CALCULO_2                                  = "C2A  ";
    public static String SIGLA_ALGEBRA_LINEAR                             = "AL   ";
    public static String SIGLA_ALGORITMOS_PROGRAMACAO_2                   = "AP2  ";
    public static String SIGLA_FISICA_1                                   = "FIS1 ";
    public static String SIGLA_LABORATORIO_FISICA_1                       = "LFIS1";
    public static String SIGLA_ESTRUTURA_DADOS_1                          = "ED1  ";
    public static String SIGLA_EQUACOES_DIFERENCIAS                       = "EDO  ";
    public static String SIGLA_CALCULO_3                                  = "C3A  ";
    public static String SIGLA_MATEMATICA_DISCRETA                        = "MD   ";
    public static String SIGLA_FISICA_3                                   = "FIS3 ";
    public static String SIGLA_ESTRUTURA_DADOS_2                          = "ED2  ";
    public static String SIGLA_FISICA_4                                   = "FIS4 ";
    public static String SIGLA_LABORATORIO_FISICA_4                       = "LFIS4";
    public static String SIGLA_ELETROMAGNETISMO                           = "ELM  ";
    public static String SIGLA_DESENHO_TECNICO                            = "DT   ";
    public static String SIGLA_METODOS_MATEMATICOS_LINEARES               = "MML  ";
    public static String SIGLA_BANCO_DADOS_1                              = "BD1  ";
    public static String SIGLA_CIRCUITOS_ELETRICOS_1                      = "CE1  ";
    public static String SIGLA_LABORATORIO_CIRCUITOS_ELETRICOS_1          = "LCE1 ";
    public static String SIGLA_ANALISE_SISTEMAS_LINEARES                  = "ASL  ";
    public static String SIGLA_MATERIAIS_ELETRICOS                        = "ME   ";
    public static String SIGLA_LABORATORIO_MATERIAIS_ELETRICOS            = "LME  ";
    public static String SIGLA_PROBABILIDADE_ESTATISTICA                  = "PE   ";
    public static String SIGLA_SISTEMA_CONTROLE                           = "SC   ";
    public static String SIGLA_CONVERSAO_ELETROMECANICA_ENERGIA_1         = "CEE1 ";
    public static String SIGLA_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA = "LCEE1";
    public static String SIGLA_ELETRONICA_1                               = "ELE1 ";
    public static String SIGLA_LABORATORIO_ELETRONICA                     = "LELE1";
    public static String SIGLA_CALCULO_NUMERICO                           = "CN   ";
    public static String SIGLA_FENOMENOS_TRANSPORTE                       = "FT   ";
    public static String SIGLA_MECANICA                                   = "MEC  ";
    public static String SIGLA_LABORATORIO_SISTEMA_CONTROLE               = "LSC  ";
    public static String SIGLA_CIRCUITOS_LOGICOS_1                        = "CL1  ";
    public static String SIGLA_LABORATORIO_CIRCUITOS_LOGICOS_1            = "LCL1 ";
    public static String SIGLA_SISTEMAS_OPERACIONAIS                      = "SO   ";
    public static String SIGLA_RESISTENCIA_MATERIAIS_1                    = "REMA1";
    public static String SIGLA_METODOLOGIA_CIENTIFICA                     = "MC   ";
    public static String SIGLA_TEORIA_TELECOMUNICACOES                    = "TT   ";
    public static String SIGLA_MICROPROCESSADORES_MICROCONTROLADORES      = "MM   ";
    public static String SIGLA_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES = "LMM  ";  
    public static String SIGLA_SISTEMAS_DISTIBUIDOS_1                     = "SD1  ";
    public static String SIGLA_LINGUAGENS_FORMAIS                         = "LF   ";
    public static String SIGLA_DIREITO_ENGENHARIA                         = "DE   ";
    public static String SIGLA_CIENCIAS_AMBIENTE                          = "CA   ";
    public static String SIGLA_REDES_COMPUTADORES_1                       = "RC1  ";
    public static String SIGLA_ARQUITETURA_COMPUTADORES_1                 = "AC1  ";  
    public static String SIGLA_COMPILADORES_1                             = "COM1 ";
    public static String SIGLA_INTELIGENCIA_COMPUTACIONAL                 = "IC   ";
    public static String SIGLA_ENGENHARIA_SOFTWARE_1                      = "ES1  ";
    public static String SIGLA_ADIMINISTRACAO_EMPRESARIAL                 = "ADM  ";
    public static String SIGLA_ECONOMIA                                   = "EC   ";
    public static String SIGLA_PEQUISA_OPERACIONAL_1                      = "PO1  "; 
    public static String SIGLA_COMPUTACAO_GRAFICA                         = "CG   ";
    public static String SIGLA_ENGENHARIA_ECONOMICA                       = "EE   ";
    public static String SIGLA_PROJETO_FINAL_CURSO_1                      = "PFC1 ";
    public static String SIGLA_ESTAGIO_SUPERSIONADO                       = "ESS  ";
    public static String SIGLA_PROJETO_FINAL_CURSO_2                      = "PFC2 ";
    
    //Metodos para retorna as disciplinas de um determinado periodo
    public static int[] getFirstPeriod(){
      int aux[] =  {ALGORITMOS_PROGRAMACAO_1,INTRODUCAO_ENGENHARIA_COMPUTACAO,CALCULO_1,QUIMICA_GERAL,QUIMICA_GERAL_EXPERIMENTAL,FUNDAMENTOS_LOGICA};
      return aux;
    }
    
    public static int[] getSecondPeriod(){
      int aux[] =  {ALGORITMOS_PROGRAMACAO_2,ALGEBRA_LINEAR,CALCULO_2,FISICA_1,LABORATORIO_FISICA_1};
      return aux;
    }
    
    public static int[] getThirdPeriod(){
      int aux[] =  {ESTRUTURA_DADOS_1,EQUACOES_DIFERENCIAS,CALCULO_3,FISICA_3,MATEMATICA_DISCRETA};
      return aux;
    }
    
    public static int[] getFouthPeriod(){
      int aux[] =  {ESTRUTURA_DADOS_2,METODOS_MATEMATICOS_LINEARES,ELETROMAGNETISMO,FISICA_4,LABORATORIO_FISICA_4,DESENHO_TECNICO};
      return aux;
    }
      
    public static int[] getFifthPeriod(){
      int aux[] =  {BANCO_DADOS_1,ANALISE_SISTEMAS_LINEARES,CIRCUITOS_ELETRICOS_1,LABORATORIO_CIRCUITOS_ELETRICOS,MATERIAIS_ELETRICOS,LABORATORIO_MATERIAIS_ELETRICOS};
      return aux;
    }
    
    public static int[] getSixthPeriod(){
      int aux[] =  {PROBABILIDADE_ESTATISTICA,SISTEMA_CONTROLE,CONVERSAO_ELETROMECANICA_ENERGIA_1,LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1,ELETRONICA_1,LABORATORIO_ELETRONICA};
      return aux;
    }
    
    public static int [] getSeventhPeriod(){
      int aux[] =  {FENOMENOS_TRANSPORTE,CALCULO_NUMERICO,LABORATORIO_SISTEMA_CONTROLE,MECANICA,CIRCUITOS_LOGICOS_1,LABORATORIO_CIRCUITOS_LOGICOS_1};
      return aux;
    }
    
    public static int[] getEighthPeriod(){
      int aux[] =  {SISTEMAS_OPERACIONAIS,METODOLOGIA_CIENTIFICA,RESISTENCIA_MATERIAIS_1,TEORIA_TELECOMUNICACOES,LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES,MICROPROCESSADORES_MICROCONTROLADORES};
      return aux;
    }
    
    public static int[] getNinthPeriod(){
      int aux[] =  {SISTEMAS_DISTIBUIDOS_1,LINGUAGENS_FORMAIS,DIREITO_ENGENHARIA,REDES_COMPUTADORES_1,CIENCIAS_AMBIENTE,ARQUITETURA_COMPUTADORES_1};
      return aux;
    }
    
    public static int[] getTenthPeriod(){
      int aux[] =  {COMPILADORES_1,INTELIGENCIA_COMPUTACIONAL,PEQUISA_OPERACIONAL_1,ADIMINISTRACAO_EMPRESARIAL,ECONOMIA,ENGENHARIA_SOFTWARE_1};
      return aux;
    }
    
    public static int[] getEleventhPeriod(){
      int aux[] =  {COMPUTACAO_GRAFICA,PROJETO_FINAL_CURSO_1,ENGENHARIA_ECONOMICA};
      return aux;
    }
    
    public static int[] getTwelfthPeriod(){
      int aux[] =  {PROJETO_FINAL_CURSO_2,ESTAGIO_SUPERSIONADO};
      return aux;
    }
    
 //Retorna quantidade da carga horaria da disciplina dado o codigo da disciplina
    public static int getClassCHS(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return CHS_ALGORITMOS_PROGRAMACAO_1;    
        else if(INTRODUCAO_ENGENHARIA_COMPUTACAO == data)  
          return CHS_INTRODUCAO_ENGENHARIA_COMPUTACAO;
        else if(CALCULO_1 == data)
            return CHS_CALCULO_1;
        else if(QUIMICA_GERAL == data)
            return CHS_QUIMICA_GERAL;
        else if(QUIMICA_GERAL_EXPERIMENTAL == data)
            return CHS_QUIMICA_GERAL_EXPERIMENTAL;
        else if(FUNDAMENTOS_LOGICA == data)
            return CHS_FUNDAMENTOS_LOGICA;
        else if(ALGORITMOS_PROGRAMACAO_2 == data)
            return CHS_ALGORITMOS_PROGRAMACAO_2;
        else if(ALGEBRA_LINEAR == data)
            return CHS_ALGEBRA_LINEAR;
        else if(CALCULO_2 == data)
            return CHS_CALCULO_2;
        else if(FISICA_1 == data)
            return CHS_FISICA_1;
        else if(LABORATORIO_FISICA_1 == data)
            return CHS_LABORATORIO_FISICA_1;
        else if(ESTRUTURA_DADOS_1 == data)
            return CHS_ESTRUTURA_DADOS_1;
        else if(EQUACOES_DIFERENCIAS == data)
            return CHS_EQUACOES_DIFERENCIAS;
        else if(CALCULO_3 == data)
            return CHS_CALCULO_3;
        else if(FISICA_3 == data)
            return CHS_FISICA_3;
        else if(MATEMATICA_DISCRETA == data)
            return CHS_MATEMATICA_DISCRETA;
        else if(ESTRUTURA_DADOS_2 == data)
            return CHS_ESTRUTURA_DADOS_2;
        else if(METODOS_MATEMATICOS_LINEARES == data)
            return CHS_METODOS_MATEMATICOS_LINEARES;
        else if(ELETROMAGNETISMO == data)
            return CHS_ELETROMAGNETISMO;
        else if(FISICA_4 == data)
            return CHS_FISICA_4;
        else if(LABORATORIO_FISICA_4 == data)
            return CHS_LABORATORIO_FISICA_4;
        else if(DESENHO_TECNICO == data)
            return CHS_DESENHO_TECNICO;
        else if(BANCO_DADOS_1 == data)
            return CHS_BANCO_DADOS_1;
        else if(ANALISE_SISTEMAS_LINEARES == data)
            return CHS_ANALISE_SISTEMAS_LINEARES;
        else if(CIRCUITOS_ELETRICOS_1 == data)
            return CHS_CIRCUITOS_ELETRICOS_1;
        else if(LABORATORIO_CIRCUITOS_ELETRICOS == data)
            return CHS_LABORATORIO_CIRCUITOS_ELETRICOS;
        else if(MATERIAIS_ELETRICOS == data)
            return CHS_MATERIAIS_ELETRICOS;
        else if(LABORATORIO_MATERIAIS_ELETRICOS == data)
            return CHS_LABORATORIO_MATERIAIS_ELETRICOS;
        else if(PROBABILIDADE_ESTATISTICA == data)
            return CHS_PROBABILIDADE_ESTATISTICA;
        else if(SISTEMA_CONTROLE == data)
            return CHS_SISTEMA_CONTROLE;
        else if (CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return CHS_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return CHS_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(ELETRONICA_1 == data)
            return CHS_ELETRONICA_1;
        else if(LABORATORIO_ELETRONICA == data)
            return CHS_LABORATORIO_ELETRONICA;
        else if(FENOMENOS_TRANSPORTE == data)
            return CHS_FENOMENOS_TRANSPORTE;
        else if(CALCULO_NUMERICO == data)
            return CHS_CALCULO_NUMERICO;
        else if(LABORATORIO_SISTEMA_CONTROLE == data)
            return CHS_LABORATORIO_SISTEMA_CONTROLE;
        else if(MECANICA == data)
            return CHS_MECANICA;
        else if(CIRCUITOS_LOGICOS_1 == data)
            return CHS_CIRCUITOS_LOGICOS_1;
        else if(LABORATORIO_CIRCUITOS_LOGICOS_1 == data)
            return CHS_LABORATORIO_CIRCUITOS_LOGICOS_1;
        else if(SISTEMAS_OPERACIONAIS == data)
            return CHS_SISTEMAS_OPERACIONAIS;
        else if(METODOLOGIA_CIENTIFICA == data)
            return CHS_METODOLOGIA_CIENTIFICA;
        else if(RESISTENCIA_MATERIAIS_1 == data)
            return CHS_RESISTENCIA_MATERIAIS_1;
        else if(TEORIA_TELECOMUNICACOES == data)
            return CHS_TEORIA_TELECOMUNICACOES;
        else if(LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES == data)
            return CHS_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES;
        else if (MICROPROCESSADORES_MICROCONTROLADORES == data)
            return CHS_MICROPROCESSADORES_MICROCONTROLADORES;
        else if(SISTEMAS_DISTIBUIDOS_1 == data)
            return CHS_SISTEMAS_DISTIBUIDOS_1;
        else if(LINGUAGENS_FORMAIS == data)
            return CHS_LINGUAGENS_FORMAIS;
        else if(DIREITO_ENGENHARIA == data)
            return CHS_DIREITO_ENGENHARIA;
        else if(REDES_COMPUTADORES_1 == data)
            return CHS_REDES_COMPUTADORES_1;
        else if(CIENCIAS_AMBIENTE == data)
            return CHS_CIENCIAS_AMBIENTE;
        else if(ARQUITETURA_COMPUTADORES_1 == data)
            return CHS_ARQUITETURA_COMPUTADORES_1;
        else if(COMPILADORES_1 == data)
            return CHS_COMPILADORES_1;
        else if(INTELIGENCIA_COMPUTACIONAL == data)
            return CHS_INTELIGENCIA_COMPUTACIONAL;
        else if(PEQUISA_OPERACIONAL_1 == data)
            return CHS_PEQUISA_OPERACIONAL_1;
        else if(ADIMINISTRACAO_EMPRESARIAL == data)
            return CHS_ADIMINISTRACAO_EMPRESARIAL;
        else if(ECONOMIA == data)
            return CHS_ECONOMIA;
        else if(ENGENHARIA_SOFTWARE_1 == data)
            return CHS_ENGENHARIA_SOFTWARE_1;
        else if(COMPUTACAO_GRAFICA == data)
            return CHS_COMPUTACAO_GRAFICA;
        else if(PROJETO_FINAL_CURSO_1 == data)
            return CHS_PROJETO_FINAL_CURSO_1;
        else if(ENGENHARIA_ECONOMICA == data)
            return CHS_ENGENHARIA_ECONOMICA;
        else if(PROJETO_FINAL_CURSO_2 == data)
            return CHS_PROJETO_FINAL_CURSO_2;
        else if(ESTAGIO_SUPERSIONADO == data)
            return CHS_ESTAGIO_SUPERSIONADO;
        
        return -1;
    }
    
//Retorna quantidade da carga horaria Teorica da disciplina dado o codigo da disciplina
    public static int getClassCHSTheory(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return CHST_ALGORITMOS_PROGRAMACAO_1;    
        else if(INTRODUCAO_ENGENHARIA_COMPUTACAO == data)  
          return CHST_INTRODUCAO_ENGENHARIA_COMPUTACAO;
        else if(CALCULO_1 == data)
            return CHST_CALCULO_1;
        else if(QUIMICA_GERAL == data)
            return CHST_QUIMICA_GERAL;
        else if(QUIMICA_GERAL_EXPERIMENTAL == data)
            return CHST_QUIMICA_GERAL_EXPERIMENTAL;
        else if(FUNDAMENTOS_LOGICA == data)
            return CHST_FUNDAMENTOS_LOGICA;
        else if(ALGORITMOS_PROGRAMACAO_2 == data)
            return CHST_ALGORITMOS_PROGRAMACAO_2;
        else if(ALGEBRA_LINEAR == data)
            return CHST_ALGEBRA_LINEAR;
        else if(CALCULO_2 == data)
            return CHST_CALCULO_2;
        else if(FISICA_1 == data)
            return CHST_FISICA_1;
        else if(LABORATORIO_FISICA_1 == data)
            return CHST_LABORATORIO_FISICA_1;
        else if(ESTRUTURA_DADOS_1 == data)
            return CHST_ESTRUTURA_DADOS_1;
        else if(EQUACOES_DIFERENCIAS == data)
            return CHST_EQUACOES_DIFERENCIAS;
        else if(CALCULO_3 == data)
            return CHST_CALCULO_3;
        else if(FISICA_3 == data)
            return CHST_FISICA_3;
        else if(MATEMATICA_DISCRETA == data)
            return CHST_MATEMATICA_DISCRETA;
        else if(ESTRUTURA_DADOS_2 == data)
            return CHST_ESTRUTURA_DADOS_2;
        else if(METODOS_MATEMATICOS_LINEARES == data)
            return CHST_METODOS_MATEMATICOS_LINEARES;
        else if(ELETROMAGNETISMO == data)
            return CHST_ELETROMAGNETISMO;
        else if(FISICA_4 == data)
            return CHST_FISICA_4;
        else if(LABORATORIO_FISICA_4 == data)
            return CHST_LABORATORIO_FISICA_4;
        else if(DESENHO_TECNICO == data)
            return CHST_DESENHO_TECNICO;
        else if(BANCO_DADOS_1 == data)
            return CHST_BANCO_DADOS_1;
        else if(ANALISE_SISTEMAS_LINEARES == data)
            return CHST_ANALISE_SISTEMAS_LINEARES;
        else if(CIRCUITOS_ELETRICOS_1 == data)
            return CHST_CIRCUITOS_ELETRICOS_1;
        else if(LABORATORIO_CIRCUITOS_ELETRICOS == data)
            return CHST_LABORATORIO_CIRCUITOS_ELETRICOS;
        else if(MATERIAIS_ELETRICOS == data)
            return CHST_MATERIAIS_ELETRICOS;
        else if(LABORATORIO_MATERIAIS_ELETRICOS == data)
            return CHST_LABORATORIO_MATERIAIS_ELETRICOS;
        else if(PROBABILIDADE_ESTATISTICA == data)
            return CHST_PROBABILIDADE_ESTATISTICA;
        else if(SISTEMA_CONTROLE == data)
            return CHST_SISTEMA_CONTROLE;
        else if (CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return CHST_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return CHST_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(ELETRONICA_1 == data)
            return CHST_ELETRONICA_1;
        else if(LABORATORIO_ELETRONICA == data)
            return CHST_LABORATORIO_ELETRONICA;
        else if(FENOMENOS_TRANSPORTE == data)
            return CHST_FENOMENOS_TRANSPORTE;
        else if(CALCULO_NUMERICO == data)
            return CHST_CALCULO_NUMERICO;
        else if(LABORATORIO_SISTEMA_CONTROLE == data)
            return CHST_LABORATORIO_SISTEMA_CONTROLE;
        else if(MECANICA == data)
            return CHST_MECANICA;
        else if(CIRCUITOS_LOGICOS_1 == data)
            return CHST_CIRCUITOS_LOGICOS_1;
        else if(LABORATORIO_CIRCUITOS_LOGICOS_1 == data)
            return CHST_LABORATORIO_CIRCUITOS_LOGICOS_1;
        else if(SISTEMAS_OPERACIONAIS == data)
            return CHST_SISTEMAS_OPERACIONAIS;
        else if(METODOLOGIA_CIENTIFICA == data)
            return CHST_METODOLOGIA_CIENTIFICA;
        else if(RESISTENCIA_MATERIAIS_1 == data)
            return CHST_RESISTENCIA_MATERIAIS_1;
        else if(TEORIA_TELECOMUNICACOES == data)
            return CHST_TEORIA_TELECOMUNICACOES;
        else if(LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES == data)
            return CHST_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES;
        else if (MICROPROCESSADORES_MICROCONTROLADORES == data)
            return CHST_MICROPROCESSADORES_MICROCONTROLADORES;
        else if(SISTEMAS_DISTIBUIDOS_1 == data)
            return CHST_SISTEMAS_DISTIBUIDOS_1;
        else if(LINGUAGENS_FORMAIS == data)
            return CHST_LINGUAGENS_FORMAIS;
        else if(DIREITO_ENGENHARIA == data)
            return CHST_DIREITO_ENGENHARIA;
        else if(REDES_COMPUTADORES_1 == data)
            return CHST_REDES_COMPUTADORES_1;
        else if(CIENCIAS_AMBIENTE == data)
            return CHST_CIENCIAS_AMBIENTE;
        else if(ARQUITETURA_COMPUTADORES_1 == data)
            return CHST_ARQUITETURA_COMPUTADORES_1;
        else if(COMPILADORES_1 == data)
            return CHST_COMPILADORES_1;
        else if(INTELIGENCIA_COMPUTACIONAL == data)
            return CHST_INTELIGENCIA_COMPUTACIONAL;
        else if(PEQUISA_OPERACIONAL_1 == data)
            return CHST_PEQUISA_OPERACIONAL_1;
        else if(ADIMINISTRACAO_EMPRESARIAL == data)
            return CHST_ADIMINISTRACAO_EMPRESARIAL;
        else if(ECONOMIA == data)
            return CHST_ECONOMIA;
        else if(ENGENHARIA_SOFTWARE_1 == data)
            return CHST_ENGENHARIA_SOFTWARE_1;
        else if(COMPUTACAO_GRAFICA == data)
            return CHST_COMPUTACAO_GRAFICA;
        else if(PROJETO_FINAL_CURSO_1 == data)
            return CHST_PROJETO_FINAL_CURSO_1;
        else if(ENGENHARIA_ECONOMICA == data)
            return CHST_ENGENHARIA_ECONOMICA;
        else if(PROJETO_FINAL_CURSO_2 == data)
            return CHST_PROJETO_FINAL_CURSO_2;
        else if(ESTAGIO_SUPERSIONADO == data)
            return CHST_ESTAGIO_SUPERSIONADO;
        
        return -1;
    }
    
    //Retorna quantidade da carga Pratica da disciplina dado o codigo da disciplina
    public static int getClassCHSPractice(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return CHSP_ALGORITMOS_PROGRAMACAO_1;    
        else if(INTRODUCAO_ENGENHARIA_COMPUTACAO == data)  
          return CHSP_INTRODUCAO_ENGENHARIA_COMPUTACAO;
        else if(CALCULO_1 == data)
            return CHSP_CALCULO_1;
        else if(QUIMICA_GERAL == data)
            return CHSP_QUIMICA_GERAL;
        else if(QUIMICA_GERAL_EXPERIMENTAL == data)
            return CHSP_QUIMICA_GERAL_EXPERIMENTAL;
        else if(FUNDAMENTOS_LOGICA == data)
            return CHSP_FUNDAMENTOS_LOGICA;
        else if(ALGORITMOS_PROGRAMACAO_2 == data)
            return CHSP_ALGORITMOS_PROGRAMACAO_2;
        else if(ALGEBRA_LINEAR == data)
            return CHSP_ALGEBRA_LINEAR;
        else if(CALCULO_2 == data)
            return CHSP_CALCULO_2;
        else if(FISICA_1 == data)
            return CHSP_FISICA_1;
        else if(LABORATORIO_FISICA_1 == data)
            return CHSP_LABORATORIO_FISICA_1;
        else if(ESTRUTURA_DADOS_1 == data)
            return CHSP_ESTRUTURA_DADOS_1;
        else if(EQUACOES_DIFERENCIAS == data)
            return CHSP_EQUACOES_DIFERENCIAS;
        else if(CALCULO_3 == data)
            return CHSP_CALCULO_3;
        else if(FISICA_3 == data)
            return CHSP_FISICA_3;
        else if(MATEMATICA_DISCRETA == data)
            return CHSP_MATEMATICA_DISCRETA;
        else if(ESTRUTURA_DADOS_2 == data)
            return CHSP_ESTRUTURA_DADOS_2;
        else if(METODOS_MATEMATICOS_LINEARES == data)
            return CHSP_METODOS_MATEMATICOS_LINEARES;
        else if(ELETROMAGNETISMO == data)
            return CHSP_ELETROMAGNETISMO;
        else if(FISICA_4 == data)
            return CHSP_FISICA_4;
        else if(LABORATORIO_FISICA_4 == data)
            return CHSP_LABORATORIO_FISICA_4;
        else if(DESENHO_TECNICO == data)
            return CHSP_DESENHO_TECNICO;
        else if(BANCO_DADOS_1 == data)
            return CHSP_BANCO_DADOS_1;
        else if(ANALISE_SISTEMAS_LINEARES == data)
            return CHSP_ANALISE_SISTEMAS_LINEARES;
        else if(CIRCUITOS_ELETRICOS_1 == data)
            return CHSP_CIRCUITOS_ELETRICOS_1;
        else if(LABORATORIO_CIRCUITOS_ELETRICOS == data)
            return CHSP_LABORATORIO_CIRCUITOS_ELETRICOS;
        else if(MATERIAIS_ELETRICOS == data)
            return CHSP_MATERIAIS_ELETRICOS;
        else if(LABORATORIO_MATERIAIS_ELETRICOS == data)
            return CHSP_LABORATORIO_MATERIAIS_ELETRICOS;
        else if(PROBABILIDADE_ESTATISTICA == data)
            return CHSP_PROBABILIDADE_ESTATISTICA;
        else if(SISTEMA_CONTROLE == data)
            return CHSP_SISTEMA_CONTROLE;
        else if (CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return CHSP_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return CHSP_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(ELETRONICA_1 == data)
            return CHSP_ELETRONICA_1;
        else if(LABORATORIO_ELETRONICA == data)
            return CHSP_LABORATORIO_ELETRONICA;
        else if(FENOMENOS_TRANSPORTE == data)
            return CHSP_FENOMENOS_TRANSPORTE;
        else if(CALCULO_NUMERICO == data)
            return CHSP_CALCULO_NUMERICO;
        else if(LABORATORIO_SISTEMA_CONTROLE == data)
            return CHSP_LABORATORIO_SISTEMA_CONTROLE;
        else if(MECANICA == data)
            return CHSP_MECANICA;
        else if(CIRCUITOS_LOGICOS_1 == data)
            return CHSP_CIRCUITOS_LOGICOS_1;
        else if(LABORATORIO_CIRCUITOS_LOGICOS_1 == data)
            return CHSP_LABORATORIO_CIRCUITOS_LOGICOS_1;
        else if(SISTEMAS_OPERACIONAIS == data)
            return CHSP_SISTEMAS_OPERACIONAIS;
        else if(METODOLOGIA_CIENTIFICA == data)
            return CHSP_METODOLOGIA_CIENTIFICA;
        else if(RESISTENCIA_MATERIAIS_1 == data)
            return CHSP_RESISTENCIA_MATERIAIS_1;
        else if(TEORIA_TELECOMUNICACOES == data)
            return CHSP_TEORIA_TELECOMUNICACOES;
        else if(LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES == data)
            return CHSP_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES;
        else if (MICROPROCESSADORES_MICROCONTROLADORES == data)
            return CHSP_MICROPROCESSADORES_MICROCONTROLADORES;
        else if(SISTEMAS_DISTIBUIDOS_1 == data)
            return CHSP_SISTEMAS_DISTIBUIDOS_1;
        else if(LINGUAGENS_FORMAIS == data)
            return CHSP_LINGUAGENS_FORMAIS;
        else if(DIREITO_ENGENHARIA == data)
            return CHSP_DIREITO_ENGENHARIA;
        else if(REDES_COMPUTADORES_1 == data)
            return CHSP_REDES_COMPUTADORES_1;
        else if(CIENCIAS_AMBIENTE == data)
            return CHSP_CIENCIAS_AMBIENTE;
        else if(ARQUITETURA_COMPUTADORES_1 == data)
            return CHSP_ARQUITETURA_COMPUTADORES_1;
        else if(COMPILADORES_1 == data)
            return CHSP_COMPILADORES_1;
        else if(INTELIGENCIA_COMPUTACIONAL == data)
            return CHSP_INTELIGENCIA_COMPUTACIONAL;
        else if(PEQUISA_OPERACIONAL_1 == data)
            return CHSP_PEQUISA_OPERACIONAL_1;
        else if(ADIMINISTRACAO_EMPRESARIAL == data)
            return CHSP_ADIMINISTRACAO_EMPRESARIAL;
        else if(ECONOMIA == data)
            return CHSP_ECONOMIA;
        else if(ENGENHARIA_SOFTWARE_1 == data)
            return CHSP_ENGENHARIA_SOFTWARE_1;
        else if(COMPUTACAO_GRAFICA == data)
            return CHSP_COMPUTACAO_GRAFICA;
        else if(PROJETO_FINAL_CURSO_1 == data)
            return CHSP_PROJETO_FINAL_CURSO_1;
        else if(ENGENHARIA_ECONOMICA == data)
            return CHSP_ENGENHARIA_ECONOMICA;
        else if(PROJETO_FINAL_CURSO_2 == data)
            return CHSP_PROJETO_FINAL_CURSO_2;
        else if(ESTAGIO_SUPERSIONADO == data)
            return CHSP_ESTAGIO_SUPERSIONADO;
        
        return -1;
    }

    //Retorna o nome  da disciplina o codigo da disciplina
    public static String getClassName(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return _ALGORITMOS_PROGRAMACAO_1;    
        else if(INTRODUCAO_ENGENHARIA_COMPUTACAO == data)  
          return _INTRODUCAO_ENGENHARIA_COMPUTACAO;
        else if(CALCULO_1 == data)
            return _CALCULO_1;
        else if(QUIMICA_GERAL == data)
            return _QUIMICA_GERAL;
        else if(QUIMICA_GERAL_EXPERIMENTAL == data)
            return _QUIMICA_GERAL_EXPERIMENTAL;
        else if(FUNDAMENTOS_LOGICA == data)
            return _FUNDAMENTOS_LOGICA;
        else if(ALGORITMOS_PROGRAMACAO_2 == data)
            return _ALGORITMOS_PROGRAMACAO_2;
        else if(ALGEBRA_LINEAR == data)
            return _ALGEBRA_LINEAR;
        else if(CALCULO_2 == data)
            return _CALCULO_2;
        else if(FISICA_1 == data)
            return _FISICA_1;
        else if(LABORATORIO_FISICA_1 == data)
            return _LABORATORIO_FISICA_1;
        else if(ESTRUTURA_DADOS_1 == data)
            return _ESTRUTURA_DADOS_1;
        else if(EQUACOES_DIFERENCIAS == data)
            return _EQUACOES_DIFERENCIAS;
        else if(CALCULO_3 == data)
            return _CALCULO_3;
        else if(FISICA_3 == data)
            return _FISICA_3;
        else if(MATEMATICA_DISCRETA == data)
            return _MATEMATICA_DISCRETA;
        else if(ESTRUTURA_DADOS_2 == data)
            return _ESTRUTURA_DADOS_2;
        else if(METODOS_MATEMATICOS_LINEARES == data)
            return _METODOS_MATEMATICOS_LINEARES;
        else if(ELETROMAGNETISMO == data)
            return _ELETROMAGNETISMO;
        else if(FISICA_4 == data)
            return _FISICA_4;
        else if(LABORATORIO_FISICA_4 == data)
            return _LABORATORIO_FISICA_4;
        else if(DESENHO_TECNICO == data)
            return _DESENHO_TECNICO;
        else if(BANCO_DADOS_1 == data)
            return _BANCO_DADOS_1;
        else if(ANALISE_SISTEMAS_LINEARES == data)
            return _ANALISE_SISTEMAS_LINEARES;
        else if(CIRCUITOS_ELETRICOS_1 == data)
            return _CIRCUITOS_ELETRICOS_1;
        else if(LABORATORIO_CIRCUITOS_ELETRICOS == data)
            return _LABORATORIO_CIRCUITOS_ELETRICOS_1;
        else if(MATERIAIS_ELETRICOS == data)
            return _MATERIAIS_ELETRICOS;
        else if(LABORATORIO_MATERIAIS_ELETRICOS == data)
            return _LABORATORIO_MATERIAIS_ELETRICOS;
        else if(PROBABILIDADE_ESTATISTICA == data)
            return _PROBABILIDADE_ESTATISTICA;
        else if(SISTEMA_CONTROLE == data)
            return _SISTEMA_CONTROLE;
        else if (CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return _CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return _LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA;
        else if(ELETRONICA_1 == data)
            return _ELETRONICA_1;
        else if(LABORATORIO_ELETRONICA == data)
            return _LABORATORIO_ELETRONICA;
        else if(FENOMENOS_TRANSPORTE == data)
            return _FENOMENOS_TRANSPORTE;
        else if(CALCULO_NUMERICO == data)
            return _CALCULO_NUMERICO;
        else if(LABORATORIO_SISTEMA_CONTROLE == data)
            return _LABORATORIO_SISTEMA_CONTROLE;
        else if(MECANICA == data)
            return _MECANICA;
        else if(CIRCUITOS_LOGICOS_1 == data)
            return _CIRCUITOS_LOGICOS_1;
        else if(LABORATORIO_CIRCUITOS_LOGICOS_1 == data)
            return _LABORATORIO_CIRCUITOS_LOGICOS_1;
        else if(SISTEMAS_OPERACIONAIS == data)
            return _SISTEMAS_OPERACIONAIS;
        else if(METODOLOGIA_CIENTIFICA == data)
            return _METODOLOGIA_CIENTIFICA;
        else if(RESISTENCIA_MATERIAIS_1 == data)
            return _RESISTENCIA_MATERIAIS_1;
        else if(TEORIA_TELECOMUNICACOES == data)
            return _TEORIA_TELECOMUNICACOES;
        else if(LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES == data)
            return _LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES;
        else if (MICROPROCESSADORES_MICROCONTROLADORES == data)
            return _MICROPROCESSADORES_MICROCONTROLADORES;
        else if(SISTEMAS_DISTIBUIDOS_1 == data)
            return _SISTEMAS_DISTIBUIDOS_1;
        else if(LINGUAGENS_FORMAIS == data)
            return _LINGUAGENS_FORMAIS;
        else if(DIREITO_ENGENHARIA == data)
            return _DIREITO_ENGENHARIA;
        else if(REDES_COMPUTADORES_1 == data)
            return _REDES_COMPUTADORES_1;
        else if(CIENCIAS_AMBIENTE == data)
            return _CIENCIAS_AMBIENTE;
        else if(ARQUITETURA_COMPUTADORES_1 == data)
            return _ARQUITETURA_COMPUTADORES_1;
        else if(COMPILADORES_1 == data)
            return _COMPILADORES_1;
        else if(INTELIGENCIA_COMPUTACIONAL == data)
            return _INTELIGENCIA_COMPUTACIONAL;
        else if(PEQUISA_OPERACIONAL_1 == data)
            return _PEQUISA_OPERACIONAL_1;
        else if(ADIMINISTRACAO_EMPRESARIAL == data)
            return _ADIMINISTRACAO_EMPRESARIAL;
        else if(ECONOMIA == data)
            return _ECONOMIA;
        else if(ENGENHARIA_SOFTWARE_1 == data)
            return _ENGENHARIA_SOFTWARE_1;
        else if(COMPUTACAO_GRAFICA == data)
            return _COMPUTACAO_GRAFICA;
        else if(PROJETO_FINAL_CURSO_1 == data)
            return _PROJETO_FINAL_CURSO_1;
        else if(ENGENHARIA_ECONOMICA == data)
            return _ENGENHARIA_ECONOMICA;
        else if(PROJETO_FINAL_CURSO_2 == data)
            return _PROJETO_FINAL_CURSO_2;
        else if(ESTAGIO_SUPERSIONADO == data)
            return _ESTAGIO_SUPERSIONADO;
        
        return "";
    }

//Retorna a sigla da disciplina dado o codigo
    public static String getClassLabel(int data){
        
        if(ALGORITMOS_PROGRAMACAO_1 == data)
          return SIGLA_ALGORITMOS_PROGRAMACAO_1;    
        else if(INTRODUCAO_ENGENHARIA_COMPUTACAO == data)  
          return SIGLA_INTRODUCAO_ENGENHARIA_COMPUTACAO;
        else if(CALCULO_1 == data)
            return SIGLA_CALCULO_1;
        else if(QUIMICA_GERAL == data)
            return SIGLA_QUIMICA_GERAL;
        else if(QUIMICA_GERAL_EXPERIMENTAL == data)
            return SIGLA_QUIMICA_GERAL_EXPERIMENTAL;
        else if(FUNDAMENTOS_LOGICA == data)
            return SIGLA_FUNDAMENTOS_LOGICA;
        else if(ALGORITMOS_PROGRAMACAO_2 == data)
            return SIGLA_ALGORITMOS_PROGRAMACAO_2;
        else if(ALGEBRA_LINEAR == data)
            return SIGLA_ALGEBRA_LINEAR;
        else if(CALCULO_2 == data)
            return SIGLA_CALCULO_2;
        else if(FISICA_1 == data)
            return SIGLA_FISICA_1;
        else if(LABORATORIO_FISICA_1 == data)
            return SIGLA_LABORATORIO_FISICA_1;
        else if(ESTRUTURA_DADOS_1 == data)
            return SIGLA_ESTRUTURA_DADOS_1;
        else if(EQUACOES_DIFERENCIAS == data)
            return SIGLA_EQUACOES_DIFERENCIAS;
        else if(CALCULO_3 == data)
            return SIGLA_CALCULO_3;
        else if(FISICA_3 == data)
            return SIGLA_FISICA_3;
        else if(MATEMATICA_DISCRETA == data)
            return SIGLA_MATEMATICA_DISCRETA;
        else if(ESTRUTURA_DADOS_2 == data)
            return SIGLA_ESTRUTURA_DADOS_2;
        else if(METODOS_MATEMATICOS_LINEARES == data)
            return SIGLA_METODOS_MATEMATICOS_LINEARES;
        else if(ELETROMAGNETISMO == data)
            return SIGLA_ELETROMAGNETISMO;
        else if(FISICA_4 == data)
            return SIGLA_FISICA_4;
        else if(LABORATORIO_FISICA_4 == data)
            return SIGLA_LABORATORIO_FISICA_4;
        else if(DESENHO_TECNICO == data)
            return SIGLA_DESENHO_TECNICO;
        else if(BANCO_DADOS_1 == data)
            return SIGLA_BANCO_DADOS_1;
        else if(ANALISE_SISTEMAS_LINEARES == data)
            return SIGLA_ANALISE_SISTEMAS_LINEARES;
        else if(CIRCUITOS_ELETRICOS_1 == data)
            return SIGLA_CIRCUITOS_ELETRICOS_1;
        else if(LABORATORIO_CIRCUITOS_ELETRICOS == data)
            return SIGLA_LABORATORIO_CIRCUITOS_ELETRICOS_1;
        else if(MATERIAIS_ELETRICOS == data)
            return SIGLA_MATERIAIS_ELETRICOS;
        else if(LABORATORIO_MATERIAIS_ELETRICOS == data)
            return SIGLA_LABORATORIO_MATERIAIS_ELETRICOS;
        else if(PROBABILIDADE_ESTATISTICA == data)
            return SIGLA_PROBABILIDADE_ESTATISTICA;
        else if(SISTEMA_CONTROLE == data)
            return SIGLA_SISTEMA_CONTROLE;
        else if (CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return SIGLA_CONVERSAO_ELETROMECANICA_ENERGIA_1;
        else if(LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA_1 == data)
            return SIGLA_LABORATORIO_CONVERSAO_ELETROMECANICA_ENERGIA;
        else if(ELETRONICA_1 == data)
            return SIGLA_ELETRONICA_1;
        else if(LABORATORIO_ELETRONICA == data)
            return SIGLA_LABORATORIO_ELETRONICA;
        else if(FENOMENOS_TRANSPORTE == data)
            return SIGLA_FENOMENOS_TRANSPORTE;
        else if(CALCULO_NUMERICO == data)
            return SIGLA_CALCULO_NUMERICO;
        else if(LABORATORIO_SISTEMA_CONTROLE == data)
            return SIGLA_LABORATORIO_SISTEMA_CONTROLE;
        else if(MECANICA == data)
            return SIGLA_MECANICA;
        else if(CIRCUITOS_LOGICOS_1 == data)
            return SIGLA_CIRCUITOS_LOGICOS_1;
        else if(LABORATORIO_CIRCUITOS_LOGICOS_1 == data)
            return SIGLA_LABORATORIO_CIRCUITOS_LOGICOS_1;
        else if(SISTEMAS_OPERACIONAIS == data)
            return SIGLA_SISTEMAS_OPERACIONAIS;
        else if(METODOLOGIA_CIENTIFICA == data)
            return SIGLA_METODOLOGIA_CIENTIFICA;
        else if(RESISTENCIA_MATERIAIS_1 == data)
            return SIGLA_RESISTENCIA_MATERIAIS_1;
        else if(TEORIA_TELECOMUNICACOES == data)
            return SIGLA_TEORIA_TELECOMUNICACOES;
        else if(LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES == data)
            return SIGLA_LABORATORIO_MICROPROCESSADORES_MICROCONTROLADORES;
        else if (MICROPROCESSADORES_MICROCONTROLADORES == data)
            return SIGLA_MICROPROCESSADORES_MICROCONTROLADORES;
        else if(SISTEMAS_DISTIBUIDOS_1 == data)
            return SIGLA_SISTEMAS_DISTIBUIDOS_1;
        else if(LINGUAGENS_FORMAIS == data)
            return SIGLA_LINGUAGENS_FORMAIS;
        else if(DIREITO_ENGENHARIA == data)
            return SIGLA_DIREITO_ENGENHARIA;
        else if(REDES_COMPUTADORES_1 == data)
            return SIGLA_REDES_COMPUTADORES_1;
        else if(CIENCIAS_AMBIENTE == data)
            return SIGLA_CIENCIAS_AMBIENTE;
        else if(ARQUITETURA_COMPUTADORES_1 == data)
            return SIGLA_ARQUITETURA_COMPUTADORES_1;
        else if(COMPILADORES_1 == data)
            return SIGLA_COMPILADORES_1;
        else if(INTELIGENCIA_COMPUTACIONAL == data)
            return SIGLA_INTELIGENCIA_COMPUTACIONAL;
        else if(PEQUISA_OPERACIONAL_1 == data)
            return SIGLA_PEQUISA_OPERACIONAL_1;
        else if(ADIMINISTRACAO_EMPRESARIAL == data)
            return SIGLA_ADIMINISTRACAO_EMPRESARIAL;
        else if(ECONOMIA == data)
            return SIGLA_ECONOMIA;
        else if(ENGENHARIA_SOFTWARE_1 == data)
            return SIGLA_ENGENHARIA_SOFTWARE_1;
        else if(COMPUTACAO_GRAFICA == data)
            return SIGLA_COMPUTACAO_GRAFICA;
        else if(PROJETO_FINAL_CURSO_1 == data)
            return SIGLA_PROJETO_FINAL_CURSO_1;
        else if(ENGENHARIA_ECONOMICA == data)
            return SIGLA_ENGENHARIA_ECONOMICA;
        else if(PROJETO_FINAL_CURSO_2 == data)
            return SIGLA_PROJETO_FINAL_CURSO_2;
        else if(ESTAGIO_SUPERSIONADO == data)
            return SIGLA_ESTAGIO_SUPERSIONADO;
        
        return "";
    }
   
//Retorna tipo de turma se ela e apenas teorica, pratica ou ambos
    public static int getTypeClass(int data){
        
        int CHST = getClassCHSTheory(data);
        int CHSP = getClassCHSPractice(data);
        
        if(CHST > 0 && CHSP >0)
            return CONSTANTS.THEORY_PRACTICE;
        else if(CHST > 0)
            return CONSTANTS.THEORY;
        else if(CHSP > 0)
            return CONSTANTS.PRACTICE;
        
        return -1;
    }
  
    //Retorna quantidade de salas disponiveis
    public static int getClassroomQuantity(){     
        return CLASSROOM;
    }
    
    //Retorna quantidade de laboratorios disponiveis
    public static int getLaboratoryClassroomQuantity(){     
        return LABORATORY_CLASSROOM;
    }
    
    //Retorna quantidade de bloco para cada disciplina por mês
    public static int getClassCHSBlockPerMonth(int data){
        if(CONSTANTS.CHS_96 == data)
            return 12;
        if(CONSTANTS.CHS_64 == data)
            return 8;
        if(CONSTANTS.CHS_48 == data)
            return 6;
        if(CONSTANTS.CHS_32 == data)
            return 4;
        if(CONSTANTS.CHS_16 == data)
            return 2;
        
        return -1;
    }
    
    //Retorna quantidade de meses para uma disciplina dependendo da carga horaria
    public static int getClassMonths(int data){
        
        if(CONSTANTS.CHS_96 == data)
            return 4;
        if(CONSTANTS.CHS_64 == data)
            return 4;
        if(CONSTANTS.CHS_48 == data)
            return 4;
        if(CONSTANTS.CHS_32 == data)
            return 4;
        if(CONSTANTS.CHS_16 == data)
            return 4;
        
        return -1;
    }

}
