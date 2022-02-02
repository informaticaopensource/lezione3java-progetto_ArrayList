import java.util.*;
import java.lang.*;
import java.io.*;
public class Merce
{
    private List<Prodotto> merce; 
    /**
     * Costruttore degli oggetti di classe  Merce
     */
    public Merce()
    {
       merce = new ArrayList<Prodotto>();
    }
    public void aggiungi()
    {
        InputStreamReader S_input =new InputStreamReader(System.in);
        BufferedReader linea = new BufferedReader(S_input);
        String tmp="",tmp1="";
        float pr=0;
        int q=0;
        boolean ok=false;
       
        do {
        try 
        {   System.out.println("Inserimento Prodotto:");
            System.out.println("\nCodice Prodotto max 6 caratteri");
            tmp=linea.readLine();
            System.out.println("\nInserisci Desscrizione:");
            tmp1=linea.readLine();
            System.out.println("\nInserisci il prezzo");
            pr=Float.parseFloat(linea.readLine());
            System.out.println("\nInserisci la quantità:");
            q=Integer.parseInt(linea.readLine());
             Prodotto p =new Prodotto(tmp, tmp1, pr, q);
            merce.add(p);
            ok=true;
        }
        catch (Exception e)
        {
            System.out.println("\nErrore nell'input !");
            ok=false;
        }
        if (!ok  )
            System.out.println("\nErrore nell'inserimento dati ! riprova");
        } while (!ok);
        System.out.println("\n Prodotto inserito alla lista ");
    }
    void stampa()
    {
        Prodotto p;
        System.out.println("Elenco prodotti:|n");
        Iterator <Prodotto> lt = merce.iterator();
        while (lt.hasNext())
            {
                p=lt.next();
                System.out.println(p.toString());
                System.out.println("\n <------------->\n");
            }
          
    }
  
}
