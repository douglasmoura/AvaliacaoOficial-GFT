public class Trabalhador {
    
    private String nome;
    private Integer horasTrabalhadas;
    private Double salarioPorHora;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public Double getSalarioPorHora() {
        return salarioPorHora;
    }
    public void setSalarioPorHora(Double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    public Trabalhador(String nome, Integer horasTrabalhadas, Double salarioPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

   
    
}
