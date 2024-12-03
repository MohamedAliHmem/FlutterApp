package org.isetn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codMat;
    private String intMat;
    private String description;

    @JsonIgnore
    @ManyToMany(mappedBy = "matieres")
    private List<Classe> classes;

	public Long getCodMat() {
		return codMat;
	}

	public void setCodMat(Long codMat) {
		this.codMat = codMat;
	}

	public String getIntMat() {
		return intMat;
	}

	public void setIntMat(String intMat) {
		this.intMat = intMat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Classe> getClasses() {
		return classes;
	}

	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}

	public Matiere(Long codMat, String intMat, String description, List<Classe> classes) {
		super();
		this.codMat = codMat;
		this.intMat = intMat;
		this.description = description;
		this.classes = classes;
	}
    
}
