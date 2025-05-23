/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeAlunos;

/**
 *
 * @author renan90483657
 */
public class Aluno implements Comparable<Aluno>{
    
    private String nome;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome, Double nota1, Double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;      
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    
    public Double getMedia() {
        return (nota1+nota2)/2;
    }
    
    public String getSituacao(){
        if(getMedia() <6){
            return "Reprovado!";
        }else{
            return "Aprovado!";
        }
    }
    
    @Override
    public String toString(){
        
        if((nota1+nota2)/2 >= 60){
            return "\n nome: "+ nome + "\n media: " + (nota1+nota2)/2 + "\n" + "Aprovado"+ "\n";
        }
        
        return "\n nome: "+ nome + "\n media: " + (nota1+nota2)/2 + "\n" + "Reprovado"+ "\n";
    }
    
    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
    }
    
}
