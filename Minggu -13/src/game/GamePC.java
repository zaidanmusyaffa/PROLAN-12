package game;


public class GamePC {
        
    public <T> void Game(T game1){
        System.out.println(game1);
    }  
    
    public <T> void Developer(T developer){
        System.out.println(developer);
    }  
    
    public <T> void Genre(T genre){
        System.out.println(genre);
    }  
    
    public static <T,N> void Harga(T game1,T developer,T genre, N harga){
        System.out.println(harga);
    }  
   
    
}

