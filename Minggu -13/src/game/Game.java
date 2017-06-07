package game;
public class Game<T> extends GamePC {
      
    public <T> void Engine(T engine){
        System.out.println(engine);
    }  
    
    public <T> void Platform(T platform){
        System.out.println(platform);
    }  

    public void Tahunrilis() {
        int tahun = 2017;
        System.out.println(tahun);
    }
    
     private static <T> Object Tgame(T Type){
        return Type;
    }
    
    public static void main(String[] args) {
        Game<String> action = new Game<>();
        GameMobile qq = new GameMobile();
        
        action.Game("FAR CRY 5");
        action.Developer("UBISOFT");
        action.Genre("Adventure");
        action.Engine("Unreal Engine");
        action.Platform("PC,PS4,Xbox One");
        action.Tahunrilis();
        Tgame((qq).setGame1("FAR CRY 4"));
        System.out.println("FAR CRY 5 merupakan kelanjutan dari edisi "+Tgame((qq).getGame1());
        
        
    }
}
