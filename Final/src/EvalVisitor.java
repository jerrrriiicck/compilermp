import java.util.ArrayList;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.antlr.v4.runtime.tree.ParseTree;

public class EvalVisitor extends HelloBaseVisitor implements Runnable {
	
	private static ParseTree tree;
	private ArrayList<String> printList;
	private ScriptEngineManager manager;
	private ScriptEngine engine;
	private SymbolTable st;
	private int ifcnt, fcnt, loopcnt;
	private boolean iflocal;
	private leScope g;
	
	public EvalVisitor(ParseTree tree, SymbolTable st){
		
		this.tree = tree;
		this.st = st;
		printList = new ArrayList<>();
		manager = new ScriptEngineManager();
		engine = manager.getEngineByName("JavaScript");
		ifcnt = fcnt = loopcnt = 0;
		iflocal = false;
		g = new leScope();
	}
	
	@Override
	public Object visitR(HelloParser.RContext ctx) {
		// TODO Auto-generated method stub
		super.visit(ctx.main());
		return null;
	}

	@Override
	public Object visitData_type(HelloParser.Data_typeContext ctx) {
		// TODO Auto-generated method stub
		return ctx.getText(); 
	}

	@Override
	public Object visitLiterals(HelloParser.LiteralsContext ctx) {
		// TODO Auto-generated method stub
		if( ctx != null){
			
				if( st.getCurrScope().exists( ctx.getText() ) ){
					return st.getCurrScope().retrieve(ctx.getText() );
				}
				else{				
					Object a;
					try {
						a = Integer.parseInt((String) ctx.getText());
					} catch(NumberFormatException e) {
						try {
						a = Float.parseFloat((String) ctx.getText());
						} catch(NumberFormatException e2){
							a = ctx.getText();
						}
					}				
					return a;
				}
		}
		return null;
	}

	@Override
	public Object visitAsop(HelloParser.AsopContext ctx) {
		// TODO Auto-generated method stub
		
		return ctx.getText();
	}

	@Override
	public Object visitMdop(HelloParser.MdopContext ctx) {
		// TODO Auto-generated method stub
		return ctx.getText();
	}

	@Override
	public Object visitExpr(HelloParser.ExprContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.cond_op() != null && ctx.getChild(2) == ctx.expr() ){
			Object a = super.visit(ctx.literals());
			if( a instanceof Integer ){ 
				if( ctx.cond_op().getText().equals(">")){
					return (Integer) a > (Integer)super.visit(ctx.expr());
				}
				else if( ctx.cond_op().getText().equals("<")){
					return (Integer) a < (Integer)super.visit(ctx.expr());
					
				}
				else if( ctx.cond_op().getText().equals(">=")){
					return (Integer) a >= (Integer)super.visit(ctx.expr());
					
				}
				else if( ctx.cond_op().getText().equals("<=")){
					return (Integer) a <= (Integer)super.visit(ctx.expr());
					
				}
				else if( ctx.cond_op().getText().equals("!=")){
					return (Integer) a != (Integer)super.visit(ctx.expr());
					
				}
				else if( ctx.cond_op().getText().equals("==")){
					return (Integer) a > (Integer)super.visit(ctx.expr());
					
				}
			}
		}
		else if ( ctx.getChild(0) == ctx.adexpr() && ctx.adexpr() != null ){
			return super.visit(ctx.adexpr());
		}
		return null;
	}

	@Override
	public Object visitAdexpr(HelloParser.AdexprContext ctx) {
		// TODO Auto-generated method stub
		if( ctx.asop() != null && ctx.getChild(2) == ctx.adexpr() ){
			Object a = super.visit(ctx.literals());
			
			if( a instanceof Integer ){
				int result = 0;
				if( ctx.asop().getText().equals("+")){
					result = (Integer) a + (Integer)super.visit(ctx.adexpr());
				}
				else if( ctx.asop().getText().equals("-")){
					result = (Integer) a - (Integer)super.visit(ctx.adexpr());
				}
				return result;
			}
			else if ( a instanceof Float ){
				float result = 0; 
				if( ctx.asop().getText().equals("+")){
					result = (Float) a + (Float)super.visit(ctx.adexpr());
				}
				else if( ctx.asop().getText().equals("-")){
					result = (Float) a - (Float) super.visit(ctx.adexpr());
				} 
				
				return result;
			}		
			
		}
		else if( ctx.getChild(0) == ctx.mdexpr() &&  ctx.mdexpr() != null ){
			return super.visit(ctx.mdexpr());
		}
		return null;
	}

	@Override
	public Object visitMdexpr(HelloParser.MdexprContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.mdop() != null && ctx.getChild(2) == ctx.mdexpr() ){
			Object a = super.visit(ctx.literals());
						
			if( a instanceof Integer ){
				int result = 0;
				if( ctx.mdop().getText().equals("*")){
					result = (Integer) a * (Integer)super.visit(ctx.mdexpr());
				}
				else if( ctx.mdop().getText().equals("/")){
					result = (Integer) a / (Integer)super.visit(ctx.mdexpr());
				}
				else if( ctx.mdop().getText().equals("%")){
					result = (Integer) a % (Integer)super.visit(ctx.mdexpr());
				}
				return result;
			}
			else if ( a instanceof Float ){
				float result = 0; 
				if( ctx.mdop().getText().equals("*")){
					result = (Float) a * (Float)super.visit(ctx.mdexpr());
				}
				else if( ctx.mdop().getText().equals("/")){
					result = (Float) a / (Float)super.visit(ctx.mdexpr());
				} 
				else if( ctx.mdop().getText().equals("%")){
					result = (Float) a % (Float)super.visit(ctx.mdexpr());
				}
				
				return result;
			}
		}
		else if( ctx.getChild(0) == ctx.negexpr() && ctx.negexpr() != null ){
			
			return super.visit(ctx.negexpr());
		}
		
		return null;
	}
	
	@Override
	public Object visitNegexpr(HelloParser.NegexprContext ctx) {
		// TODO Auto-generated method stub
		if( ctx.getChild(0) == ctx.literals() && ctx.literals() != null ){
			return super.visit(ctx.literals());
		}
		else if( ctx.getChild(1) == ctx.expr() && ctx.expr() != null ){
			return super.visit(ctx.expr());
		}
		return null;
	}

	@Override
	public Object visitIncdec_stmt(HelloParser.Incdec_stmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitCond_op(HelloParser.Cond_opContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitVar_dec(HelloParser.Var_decContext ctx) {
		// TODO Auto-generated method stub
		
		datatype dt = null; 
		
		if( super.visit(ctx.data_type()).toString().equals("idol")){
			dt = datatype.INT;
		}
		else if( ctx.getText().equals("pare")){
			dt = datatype.FLOAT;
		}
		else if( ctx.getText().equals("bro")){
			dt = datatype.CHAR;
		}
		else if( ctx.getText().equals("bros")){
			dt = datatype.STRING;
		}
		else if ( ctx.getText().equals("bools")){
			dt = datatype.BOOLEAN;
		}
		
		ArrayList<Symbol> slist = (ArrayList<Symbol>) super.visit(ctx.var_dec_list());
		
		for(Symbol s : slist){
			s.setDt(dt);
			st.getCurrScope().declare(s);
		}
		
		return null;
	}

	@Override
	public Object visitVar_dec_list(HelloParser.Var_dec_listContext ctx) {
		// TODO Auto-generated method stub
		
		ArrayList<Symbol> slist = new ArrayList<>();
		
		if ( ctx.asgn_stmt() != null ){
			slist.add( (Symbol) super.visit(ctx.asgn_stmt()));
			if( ctx.var_dec_list() != null ){
				slist.addAll( (ArrayList<Symbol>) super.visit(ctx.var_dec_list()));
				return slist;
			}
			return slist;
		}
		return null;
	}

	@Override
	public Object visitAsgn_stmt(HelloParser.Asgn_stmtContext ctx) {
		// TODO Auto-generated method stub
		if( ctx.array() != null ){
			super.visit(ctx.array());
		}
		else {
			if( ctx.getChild(0) == ctx.ID() && ctx.expr() != null){

				if( !st.getCurrScope().exists(ctx.ID().getText())) {
					return new Symbol(ctx.ID().getText(), super.visit(ctx.expr())); 
				}
				else{
					st.getCurrScope().update(new Symbol(ctx.ID().getText(), super.visit(ctx.expr())));
				}
			}
			else{
				if( !st.getCurrScope().exists(ctx.ID().getText())) {
					return new Symbol(ctx.ID().getText()); 
				}			
			}
		}
		return null;
	}

	@Override
	public Object visitArray(HelloParser.ArrayContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunc_call(HelloParser.Func_callContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.ID() != null ){
			if( st.getCurrScope().exists(ctx.ID().getText())){
				ArrayList<HelloParser.CodeContext> list = 
						(ArrayList<HelloParser.CodeContext>) st.getCurrScope().retrieve(ctx.ID().getText());
				
				ArrayList<HelloParser.CodeContext> temp = (ArrayList) list.clone();
				
				for(HelloParser.CodeContext c : temp){
					this.visitCode(c);
				}
			}
		}
		
		return null;
	}

	@Override
	public Object visitParam_list_pass(HelloParser.Param_list_passContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFunc_dec(HelloParser.Func_decContext ctx) {
		// TODO Auto-generated method stub
		ArrayList<HelloParser.CodeContext> clist = new ArrayList<>();
		
		datatype dt = null; 
		
		if( ctx.data_type() != null ){
		
			if( super.visit(ctx.data_type()).toString().equals("idol")){
				dt = datatype.INT;
			}
			else if( ctx.data_type().getText().equals("pare")){
				dt = datatype.FLOAT;
			}
			else if( ctx.data_type().getText().equals("bro")){
				dt = datatype.CHAR;
			}
			else if( ctx.data_type().getText().equals("bros")){
				dt = datatype.STRING;
			}
			else if ( ctx.data_type().getText().equals("bools")){
				dt = datatype.BOOLEAN;
			}
			else if ( ctx.data_type().getText().equals("wala")){
				dt = datatype.VOID;
			}
			
			if( ctx.param_list_rcv() != null ){
				super.visit(ctx.param_list_rcv()); // param dec
			}
			
			if( ctx.code_block() != null ){
				clist.add( ctx.code_block().code());
			}
			Symbol s = new Symbol ( dt, clist, ctx.ID().getText());
			st.getCurrScope().declare(s);
		}
		return null;
	}

	@Override
	public Object visitParam_list_rcv(HelloParser.Param_list_rcvContext ctx) {
		// TODO Auto-generated method stub
		leScope local = new leScope();
		
		datatype dt = null; 

		if( ctx.data_type() != null){
			if( ctx.data_type() != null){
				if( super.visit(ctx.data_type()).toString().equals("idol")){
					dt = datatype.INT;
				}
				else if( ctx.getText().equals("pare")){
					dt = datatype.FLOAT;
				}
				else if( ctx.getText().equals("bro")){
					dt = datatype.CHAR;
				}
				else if( ctx.getText().equals("bros")){
					dt = datatype.STRING;
				}
				else if ( ctx.getText().equals("bools")){
					dt = datatype.BOOLEAN;
					
					local.declare(new Symbol(dt, ctx.ID().getText()));
				}
			}
		}
		
		return null;
	}

	@Override
	public Object visitIf_stmt(HelloParser.If_stmtContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.cond_stmt() != null ){
			if( (boolean)this.visit(ctx.cond_stmt().expr()) ){
				leScope g = st.getCurrScope();
				st.pushScope();
				this.visit(ctx.code_block());
				st.updateScope(st.getCurrScope());
				st.getOutOfScope();
			}						
		}
		
		return null;
	}

	@Override
	public Object visitCond_stmt(HelloParser.Cond_stmtContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.expr() != null ){
			return super.visit(ctx.expr());
		}
		else if ( ctx.cs_op() != null ){
			boolean a = (boolean) super.visit(ctx.expr());
			
			if( ctx.cs_op().getText().equals("&&") ){
				return a && (boolean) super.visit(ctx.cond_stmt());
			}
			else if ( ctx.cs_op().getText().equals("||")){
				return a || (boolean) super.visit(ctx.cond_stmt());
			}
		}
		return null;
	}

	@Override
	public Object visitReturn_stmt(HelloParser.Return_stmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSwitch_stmt(HelloParser.Switch_stmtContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitSwitch_block(HelloParser.Switch_blockContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitFor_loop(HelloParser.For_loopContext ctx) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Object visitWhile_loop(HelloParser.While_loopContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.cond_stmt() != null ){
			while( (boolean)this.visit(ctx.cond_stmt().expr()) ){
				this.visit(ctx.code_block());
			}						
		}
		
		return null;
	}

	@Override
	public Object visitDo_while(HelloParser.Do_whileContext ctx) {
		// TODO Auto-generated method stub
		
		if( ctx.cond_stmt() != null ){
			do{
				this.visit(ctx.code_block());
			}while ( (boolean) super.visit(ctx.cond_stmt()));
		}
		return null;
	}

	@Override
	public Object visitCode_block(HelloParser.Code_blockContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.code() != null ){
			Object a = super.visit(ctx.code());
			if(ctx.code_block() != null )
				super.visit(ctx.code_block());
			return a;
		}
		else 
			super.visit(ctx.empty());
		
		return null;
	}

	@Override
	public Object visitCode(HelloParser.CodeContext ctx) {
		// TODO Auto-generated method stub
		if(ctx.var_dec() != null){
			super.visit(ctx.var_dec());
		}
		else if( ctx.print() != null ){
			super.visit( ctx.print());
		}
		else if( ctx.if_stmt() != null ){
			super.visit( ctx.if_stmt()); 
		}
		else if ( ctx.func_call() != null ){
			super.visit( ctx.func_call());
		}
		else if ( ctx.asgn_stmt() != null ){
			super.visit( ctx.asgn_stmt() );
		}
		else if ( ctx.while_loop() != null ){
			super.visit( ctx.while_loop() );
		}
		else if ( ctx.do_while() != null ){
			super.visit( ctx.do_while() );
		}
		else if ( ctx.COMMENT() != null ){
			
		}
		
		return ctx;
	}

	@Override
	public Object visitEmpty(HelloParser.EmptyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTerminator(HelloParser.TerminatorContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object visitMain(HelloParser.MainContext ctx) {
		// TODO Auto-generated method stub
		st.pushScope();
		super.visit(ctx.func_dec());
		super.visit(ctx.code_block());
		return null;
	}
	
	
	@Override
	public Object visitPrint(HelloParser.PrintContext ctx) {		
		// TODO Auto-generated method stub
		
		if( ctx.expr() != null){
			
			if( super.visit(ctx.expr()) instanceof Integer
				|| super.visit(ctx.expr()) instanceof Float ){
				String str = "" + super.visit(ctx.expr());
				System.out.println(str);
			}
			else{
				String str = "" + super.visit(ctx.expr());
				System.out.println(str);
				
			}
		}		
		
		return null;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("THREAD");
		this.visit(tree);
		st.printStack();
	}
	
}
