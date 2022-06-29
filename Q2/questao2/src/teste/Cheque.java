import java.util.Date;

public class Cheque implements IRecebivel{
 
    private Integer tipo;
    private Double valor;
    private Date prazoVencimento;
    
    public Cheque(Integer tipo, Double valor, Date prazoVencimento) {
        this.tipo = tipo;
        this.valor = valor;
        this.prazoVencimento = prazoVencimento;
    }


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
    
        Integer cont = 0;
        Double resultado = 0.0;
        setValor(valor);
        if(getTipo() <= 30){
            resultado = getValor()-(getValor() * 0.05);
        System.out.println(resultado); 
        }else if(getTipo() <= 60){
            resultado = getValor()-(getValor() * 0.075);
        System.out.println(resultado); 
        }
        else if(getTipo() <= 90){
            resultado = getValor()-(getValor() * 0.10); 
        System.out.println(resultado);

        }else if(getTipo() > 90){
           
            cont = getTipo() / 30;
            cont = cont - 2;
            
            resultado = getValor()-(getValor() * 0.10) - (getValor()*(cont * 0.03));
        System.out.println(resultado); 

        }
        
    }
}
