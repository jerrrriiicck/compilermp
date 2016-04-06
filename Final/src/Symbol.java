
import javax.xml.datatype.DatatypeConfigurationException;

/**
 * Created by Angelo Amadora on 4/7/2016.
 */
public class Symbol {

    private datatype dt;
    private String name;
    private Object val;

    public Symbol(datatype dt, Object val, String name) {
        this.dt = dt;
        this.val = val;
        this.name = name;
    }

    public Symbol (datatype dt,String name){
        this.dt = dt;
        this.name = name;
        val = null;
    }
    
    public Symbol(String name, Object val){
    	dt = null;
    	this.name = name;
    	this.val = val;
    }

    public datatype getDt() {
        return dt;
    }

    public void setDt(datatype dt) {
        this.dt = dt;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
