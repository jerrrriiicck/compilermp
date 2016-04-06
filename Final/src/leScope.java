import java.util.HashMap;

/**
 * Created by Angelo Amadora on 4/7/2016.
 */
public class leScope {
    private HashMap<String,Symbol> SymTable;

    public leScope(){
        SymTable = new HashMap<>();
    }

    public void declare(Symbol s){
        SymTable.put(s.getName(),s);
    }

    public void update(Symbol s){
        SymTable.get(s.getName()).setVal(s.getVal());
    }

    public Object retrieve (String item){
        return SymTable.get(item).getVal();
    }
    
    public boolean exists( String item ){
    	return SymTable.containsKey(item);
    }
}
