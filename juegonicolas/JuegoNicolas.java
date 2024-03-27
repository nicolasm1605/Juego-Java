
package juegonicolas;
import java.util.Scanner;

public class JuegoNicolas 
{
    Juego juego1 = new Juego();
	Boolean jugando;
	
	public JuegoNicolas() 
        {
        }
	
	public void Crearjuego() 
        {
		juego1.creartablero();	
	}
	
	
	
	public void moverse()
        {
		Boolean jugando = true;
		Boolean Gano = false;
		Scanner teclado = new Scanner(System.in);
		while(jugando) 
                {
			juego1.mostrartablajugando();
			System.out.println("Siguiente movimiento : ");
			char movimiento = teclado.next().charAt(0);
			jugando = juego1.mover(movimiento);
			
		
			
			if(juego1.posx == 9 &&juego1.posy == 9 ) 
                        {
				jugando = false;
				Gano = true;
			}
			
		}
		if(Gano) 
                {
			System.out.println("Ganaste");
		}else 
                {
			System.out.println("Perdiste");
		}
		
		juego1.mostrartabla();
		
		teclado.close();
	}
	
	
	
	
	 public static void main(String[] args)
		{
                 System.out.println("instrucciones");
                 System.out.println("mover con las letras awsd");
                 System.out.println("");
		 JuegoNicolas a = new JuegoNicolas();
		 a.Crearjuego();
		 a.moverse();
		}
	
	

}
    