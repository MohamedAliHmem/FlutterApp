package org.isetn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codClass;
    private String nomClass;
    private int nbreEtud;

    @JsonIgnore
    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    private List<Etudiant> etudiants = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "ClassMat", 
            joinColumns = @JoinColumn(name = "codClass"), 
            inverseJoinColumns = @JoinColumn(name = "codMat"))
    private List<Matiere> matieres = new ArrayList<>();

	public Long getCodClass() {
		return codClass;
	}

	public void setCodClass(Long codClass) {
		this.codClass = codClass;
	}

	public String getNomClass() {
		return nomClass;
	}

	public void setNomClass(String nomClass) {
		this.nomClass = nomClass;
	}

	public int getNbreEtud() {
		return nbreEtud;
	}

	public void setNbreEtud(int nbreEtud) {
		this.nbreEtud = nbreEtud;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	public Classe(Long codClass, String nomClass, int nbreEtud, List<Etudiant> etudiants, List<Matiere> matieres) {
		super();
		this.codClass = codClass;
		this.nomClass = nomClass;
		this.nbreEtud = nbreEtud;
		this.etudiants = etudiants;
		this.matieres = matieres;
	}
    
}
