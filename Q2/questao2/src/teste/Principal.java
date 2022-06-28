
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Principal {
    
    public static void main(String[] args) throws ParseException {
    
        
    
                
                DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
                Date date = df.parse("08/6/2022");
                Cheque cheque = new Cheque(30,2500.00,date);
                Promissoria promissoria = new Promissoria(60,2500.00,date);
                Titulo titulo = new Titulo(90,2500.00,date);

                cheque.calcularValorRecebivel(cheque.getValor());
                promissoria.calcularValorRecebivel(promissoria.getValor());
                titulo.calcularValorRecebivel(titulo.getValor());
               

    
}
    }
