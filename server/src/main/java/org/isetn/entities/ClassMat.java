package org.isetn.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ClassMat")
public class ClassMat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public ClassMat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
    @JoinColumn(name = "codClass")
    private Classe classe;

    @ManyToOne
    @JoinColumn(name = "codMat")
    private Matiere matiere;

    private Float coefMat;
    private Float nbrHS;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	public Matiere getMatiere() {
		return matiere;
	}
	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	public Float getCoefMat() {
		return coefMat;
	}
	public void setCoefMat(Float coefMat) {
		this.coefMat = coefMat;
	}
	public Float getNbrHS() {
		return nbrHS;
	}
	public void setNbrHS(Float nbrHS) {
		this.nbrHS = nbrHS;
	}
	public ClassMat(Long id, Classe classe, Matiere matiere, Float coefMat, Float nbrHS) {
		super();
		this.id = id;
		this.classe = classe;
		this.matiere = matiere;
		this.coefMat = coefMat;
		this.nbrHS = nbrHS;
	}
    
}
