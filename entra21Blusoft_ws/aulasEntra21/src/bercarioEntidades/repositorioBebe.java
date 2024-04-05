package bercarioEntidades;

import java.util.List;

public interface repositorioBebe {
	
	//exemplo interface
	public void create(Bebe bebe);
	public void delete(Bebe bebe);
	public void update(Bebe bebe);
	public List<Bebe> read();
	
}
