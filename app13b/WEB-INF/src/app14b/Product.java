package app14b;
import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    public Product() {
    }
    public Product (int id, String name) {
			this.id = id;
			this.name = name;
    }    
    public int getId() {
    	return id;
    }         	
    public void setId(int id) {
    	this.id = id;
    }
    public String getName() {
     return name;
    }    	
    public void setName(String name) {
      this.name = name;
    }   
}
