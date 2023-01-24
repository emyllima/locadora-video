package com.api.locadoravideo.Dtos;

import jakarta.validation.constraints.NotBlank;

public class LocadoraDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String endereco;
    @NotBlank
    private int telefone;
    @NotBlank
    private String titulo;
    @NotBlank
    private String genero;
    @NotBlank
    private String descricao;
    @NotBlank
    private String diretor;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }



}
