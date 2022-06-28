import java.util.Date;

public class Titulo  implements IRecebivel{
  
    private Integer tipo;
    public Titulo(Integer tipo, Double valor, Date prazoVencimento) {
        this.tipo = tipo;
        this.valor = valor;
        this.prazoVencimento = prazoVencimento;
    }

    private Double valor;
    private Date prazoVencimento;

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getPrazo() {
        return prazoVencimento;
    }

    public void setPrazo(Date prazo) {
        this.prazoVencimento = prazo;
    }

    @Override
    public void calcularValorRecebivel(Double valor) {
    
        Double resultado = 0.0;
        setValor(valor);
        if(getTipo() <= 30){
            resultado = getValor()-(getValor() * 0.03);
        System.out.println(resultado); 
        }else if(getTipo() <= 60){
            resultado = getValor()-(getValor() * 0.055);
        System.out.println(resultado); 
        }
        else if(getTipo() <= 90){
            resultado = getValor()-(getValor() * 0.065); 
        System.out.println(resultado);

        }else if(getTipo() > 90){
            
            resultado = getValor()-(getValor() * 0.065) - (getValor()* 0.01);
        System.out.println(resultado); 

        }
        
    }
    
}
