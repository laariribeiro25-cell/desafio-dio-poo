package br.com.dio.desafio.dominio;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


public class Bootcamp {
    private String nome;
private String descricao;
private LocalDate dataInicio = LocalDate.now();
private LocalDate dataFim = dataInicio.plusDays(45);

private Set<Conteudo> conteudos = new LinkedHashSet<>();
private Set<Dev> devs = new LinkedHashSet<>();
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getDescricao() {
    return descricao;
}
public void setDescricao(String descricao) {
    this.descricao = descricao;
}
public LocalDate getDataInicio() {
    return dataInicio;
}
public void setDataInicio(LocalDate dataInicio) {
    this.dataInicio = dataInicio;
}
public LocalDate getDataFim() {
    return dataFim;
}
public void setDataFim(LocalDate dataFim) {
    this.dataFim = dataFim;
}
public Set<Conteudo> getConteudos() {
    return conteudos;
}
public void setConteudos(Set<Conteudo> conteudos) {
    this.conteudos = conteudos;
}
public Set<Dev> getDevs() {
    return devs;
}
public void setDevs(Set<Dev> devs) {
    this.devs = devs;
}


}
