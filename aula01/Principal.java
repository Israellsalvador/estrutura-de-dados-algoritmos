import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){
        Pessoa obj1 = new Pessoa("Rafael", 34);
        Pessoa obj2 = new Pessoa("Sabrina", 23);
        Pessoa obj3 = new Pessoa("Emanuel", 13);

       
       

     

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        listaP.add(new Pessoa("Rafael", 34));
        listaP.add(new Pessoa("Sabrina", 23));
        listaP.add(new Pessoa("Emanuel", 14));

        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }

    }
}