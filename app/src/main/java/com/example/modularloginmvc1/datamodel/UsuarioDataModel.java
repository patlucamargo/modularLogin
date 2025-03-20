package com.example.modularloginmvc1.datamodel;

public class UsuarioDataModel {
    /*  passo 1 - Atributo com o nome da tabela
        passo 2 - Atributo um para um com os nomes dos campos da tabela
        passo 3 - Query (consulta) para criar a tabela no banco de dados
        passo 4 - Metodo para gerar o script para criar a tabela
     */
    //passo1
    public static final String TABELA = "usuario";

    //passo2
    public static final String ID = "id";

    public static final String NOME = "nome";

    public static final String EMAIL = "email";

    public static final String SENHA = "senha";

    //passo3
    public static String consultaCriarTabela = "";

    public static String criarTabela() {
        consultaCriarTabela += "CREATE TABLE " + TABELA + "(";
        consultaCriarTabela += ID + " integer primary key autoincrement, ";
        consultaCriarTabela += NOME + " text, ";
        consultaCriarTabela += EMAIL + " text, ";
        consultaCriarTabela += SENHA + " text ";
        consultaCriarTabela += SENHA + ")";

        return consultaCriarTabela;
    }
}



