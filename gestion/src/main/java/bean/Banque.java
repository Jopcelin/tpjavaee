package bean;

public class Banque {
 private String id_banque;
 private String nom;
 private String adresse;
public String getId_banque() {
	return id_banque;
}
public void setId_banque(String id_banque) {
	this.id_banque = id_banque;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}


public void setAdresse(String ad) {
	this.adresse = ad;
}
public String getAdresse() {
	return this.adresse;
}
}
