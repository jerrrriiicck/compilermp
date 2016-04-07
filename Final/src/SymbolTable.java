
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by Angelo Amadora on 4/7/2016.
 */
public class SymbolTable {

    private Stack<leScope> theScope;
    private HashMap<String, leScope> local;
    private Stack<String> theLocalScope;

    public SymbolTable(){
        theScope = new Stack<>();

    }

    public leScope getCurrScope(){
        return theScope.peek();
    }

    public void pushScope(){
        leScope s = new leScope();

        theScope.push(s);
    }

    public void getOutOfScope(){
        theScope.pop();
    }
    
    
    public void initLocal(String str){
    	theLocalScope = new Stack<>();
        
    	local.put(str , new leScope());
    	theLocalScope.push(str);
    }
    
    public void popLocal(){
    	local.remove(theLocalScope.pop());
    }
    
    public String getCurrLocal(){
    	return theLocalScope.peek();
    }
    
    public leScope getScope(String str){
    	return local.get(str);
    }
    
    public String popLocalString(){
    	return theLocalScope.pop();
    }
    
    public void pushLocalString(String str){
    	theLocalScope.push(str);    	
    }
    
    public boolean isLocalEmpty(){
    	return theLocalScope.isEmpty();
    }
}
