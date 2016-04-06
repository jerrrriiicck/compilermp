import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
	
	public static void main( String[] args) throws Exception 
    {
		
		Gui g = new Gui();
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                g.createAndShowGUI();
            }
        });
		
		
        ANTLRInputStream input = new ANTLRInputStream("NUMEROUNO{ idol x = 10 * 12  \\m/ broout(x) \\m/ broout(\"fuck\nyou\") \\m/ }");

        HelloLexer lexer = new HelloLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HelloParser parser = new HelloParser(tokens);
        ParseTree tree = parser.r(); // begin parsing at rule 'r'
        SymbolTable st = new SymbolTable();
        
        
        new EvalVisitor(tree, st).run();;
        //EvalVisitor
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree
    }
}
