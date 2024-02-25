package br.com.lucas.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class <T> classe);
}
