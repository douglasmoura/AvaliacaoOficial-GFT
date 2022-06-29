import java.util.Date;

public class Promissoria implements IRecebivel{

    private Integer tipo;
    private Double valor;
    private Date prazoVencimento;

    public Promissoria(Integer tipo, Double valor, Date prazo) {
        this.tipo = tipo;
        this.valor = valor;
        this.prazoVencimento = prazo;
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
            resultado = getValor()-(getValor() * 0.04);
        System.out.println(resultado); 
        }else if(getTipo() <= 60){
            resultado = getValor()-(getValor() * 0.065);
        System.out.println(resultado); 
        }
        else if(getTipo() <= 90){
            resultado = getValor()-(getValor() * 0.085); 
        System.out.println(resultado);

        }else if(getTipo() > 90){

            cont = getTipo() / 30;
            cont = cont - 2;
            
            resultado = getValor()-(getValor() * 0.085) - (getValor()*(cont * 0.02));
        System.out.println(resultado); 

        }
        
    }
    
}
