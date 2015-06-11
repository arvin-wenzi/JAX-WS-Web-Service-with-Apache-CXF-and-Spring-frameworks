package tr.edu.hacettepe.bbm490;

import java.util.ArrayList;
import java.util.List;

public class FighterServiceImpl implements FighterService {

	public List<Fighter> getAll() {
		List <Fighter> fighterList = new ArrayList<Fighter>();
		fighterList.add(new Fighter("Rambo","Sylvester","Stallone",30));
		fighterList.add(new Fighter("Rocky","Sylvester","Stallone",33));
		fighterList.add(new Fighter("Muhammad Ali","Marcellus","Clay",28));
		fighterList.add(new Fighter("Thriller in Manila","Joe","Frazier",35));
		fighterList.add(new Fighter("Tiger","Mike","Tyson",31));
		
		return fighterList;
	}

}