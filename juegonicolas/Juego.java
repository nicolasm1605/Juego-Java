
package juegonicolas;
import java.util.Random;

public class Juego 
{
     private char[][] tablero;
    int posx;
    int posy;

    public  Juego()
    {
        tablero = new char[10][10];
        this.posx = 0;
        this.posy = 0;
    }

    
    public void creartablero()
    {
        int i = 8; 
        Random r = new Random();
         
        while(i > 0)
        {
           int posx = r.nextInt(9)+1;
           int posy = r.nextInt(9)+1;
           if(posx != 0 && posy != 0 || posx != 9  && posy != 9) 
           {  
              if(this.tablero[posx][posy] != 'X')
              {
                  this.tablero[posx][posy] = 'X';
                  i--;
              }
              
           }
          
        }
        this.tablero[0][0] = '@';
    }
    
    public void mostrartabla() {
    	for(int i=0;i<10;i++){
    		System.out.print("|");
    		for(int y=0;y<10;y++) {
    			System.out.print(this.tablero[y][i] + " ");
    		}
    		System.out.print("|");
    		System.out.println();
    	}	
    }
    
    public void mostrartablajugando() 
    {
		this.tablero[9][9] = 'g';
    	for(int i=0;i<10;i++){
    		System.out.print("|");
    		for(int y=0;y<10;y++) 
                {
    			if(this.tablero[y][i] == 'X') {
    				System.out.print("  ");
    			}else {
    				System.out.print(this.tablero[y][i] + " ");
    			}
    			
    		}
    		System.out.print("|");
    		System.out.println();
    	}
		
	}
    
    
    
    public Boolean mover(char m) 
    {
    	
      m = Character.toLowerCase(m);
    	
      switch(m) 
      {
      
      case 'a': 
    	  if(this.posx - 1 >= 0) 
          {
    		  this.posx--;
    		  if(this.tablero[this.posx][this.posy] != 'X') 
                  {
    			  this.tablero[this.posx][this.posy] = '@';
    			  return true;
    		  }else 
                  {
    			  return false;
    		  }
    		  
    	  }
    	  break;
      case 'd': 

    	  if(this.posx + 1 <= 9) 
          {
    		 this.posx++;
    		 if(this.tablero[this.posx][this.posy] != 'X') 
                 {
   			  this.tablero[this.posx][this.posy] = '@';
   			  return true;
   		 }else 
                 {
   			  return false;
   		  
                 }
    	   }
    	  break;
      case 'w': 
    	  if(this.posy - 1 >= 0) 
          {
    		  this.posy--;
    		  if(this.tablero[this.posx][this.posy] != 'X') 
                  {
    			  this.tablero[this.posx][this.posy] = '@';
    			  return true;
    		  }else 
                  {
    			  return false;
    		  
    		  }
    	  }
    	  break;
      case 's': 
    	  if(this.posy + 1 <= 9) 
          {
    		  this.posy++;
    		  if(this.tablero[this.posx][this.posy] != 'X') 
                  {
    			  this.tablero[this.posx][this.posy] = '@';
    			  return true;
    		  }else
                  {
    			  return false;
    		  
    		  }
    	  
    	  }
    	  break;
    	
    }
      return true;
    
    
   
    }
    
}
