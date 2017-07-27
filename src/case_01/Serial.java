package case_01;

import java.io.Serializable;

public class Serial implements Serializable
{
    private static final long serialVersionUID = 6977402643848374753L;
    private final int id=1;
    private final String name="hello";

    public Serial(int id, String name)
    {
    	System.out.println(""+this.id);
//        this.id = id;
//        this.name = name;
    }

//	@Override
//	public String toString() {
//		return "Serial [id=" + id + ", name=" + name + "]";
//	}



}

