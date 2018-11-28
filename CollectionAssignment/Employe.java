package CollectionAssignment;

public class Employe {
	String name;
	int id;
	public Employe(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public  int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe next = (Employe) obj;
		if (id != next.id)
			return false;
		if (name == null) {
			if (next.name != null)
				return false;
		} else if (!name.equals(next.name))
			return false;
		return true;
	}


}
