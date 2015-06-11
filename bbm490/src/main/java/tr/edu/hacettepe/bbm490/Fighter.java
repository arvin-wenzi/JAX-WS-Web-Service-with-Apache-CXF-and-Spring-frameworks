package tr.edu.hacettepe.bbm490;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Fighter {

	private String nickname;
	private String name;
	private String lastName;
	private Integer age;
	
	public Fighter(){
	
	}
	
	public Fighter(String nickname, String name, String lastName, Integer age) {
		super();
		this.nickname = nickname;
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	@XmlAttribute
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}