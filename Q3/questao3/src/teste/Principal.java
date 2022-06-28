import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args) {
        
        
        List<Trabalhador> pessoa = new ArrayList<Trabalhador>();

        pessoa.add(new Trabalhador("João", 20, 30.0));
        pessoa.add(new Trabalhador("Douglas", 20, 30.0));
        pessoa.add(new Trabalhador("Diego", 20, 30.0));
        pessoa.add(new Trabalhador("Eduardo", 20, 30.0));
        pessoa.add(new Trabalhador("Guilherme", 20, 30.0));

        System.out.println(pessoa.size());

        for (int i = 0; i < pessoa.size(); i++) {

        Integer cont = i+1 ;  
        System.out.println("Nome do "+ cont+ " trabalhador: "+pessoa.get(i).getNome());
        System.out.println("Horas trabalhadas do "+  cont+ " trabalhador: "+pessoa.get(i).getHorasTrabalhadas());
        System.out.println("Salário por hora do "+  cont+ " trabalhador: "+pessoa.get(i).getSalarioPorHora());
        calcularSalario( pessoa.get(i).getSalarioPorHora(),pessoa.get(i).getHorasTrabalhadas());
        System.out.println("");

        }
        
    }

    public static void calcularSalario(Double salarioPorHora, Integer horasTrabalhadas) {
        
        System.out.println("Salário total: R$ "+salarioPorHora * horasTrabalhadas);
        
    }
}
