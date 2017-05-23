package laptop;


public class Laptop implements ListItem {

    
    private String ASUS="ASUS merupakan merek laptop terkenal yang sangat mendunia dan banyak dipakai";
    private String ACER="ACER merupakan merek laptop terkenal yang sangat mendunia dan banyak dipakai";
    private String HP="HP merupakan merek laptop terkenal yang sangat mendunia dan banyak dipakai";
    private String DELL="DELL merupakan merek laptop terkenal yang sangat mendunia dan banyak dipakai";
    
    
    public String getASUS() {
        System.out.println(ASUS);
  
        return ASUS;
    }
    
    public String getACER() {
        System.out.println(ACER);
        
        return ACER;
    }
    
    public String getHP() {
        System.out.println(HP);
        
        return HP;
    }
    
    public String getDELL() {
        System.out.println(DELL);
        
        return DELL;
    }

    @Override
    public String getItem1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getItem2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getItem3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getItem4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}

