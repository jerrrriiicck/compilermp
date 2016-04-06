
import java.util.Stack;

/**
 * Created by Angelo Amadora on 4/7/2016.
 */
public class SymbolTable {

    private Stack<leScope> theScope;

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
}
