package tr.edu.hacettepe.bbm490;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface FighterService {
	
	@WebMethod
	List<Fighter> getAll();

}