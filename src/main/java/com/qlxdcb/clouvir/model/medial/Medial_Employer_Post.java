package com.qlxdcb.clouvir.model.medial;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.qlxdcb.clouvir.model.Model;

@Entity
@Table(name = "medial_file")
public class Medial_Employer_Post extends Model<Medial_Employer_Post> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8083774806308632942L;

	public Medial_Employer_Post() {
		this.setId(0l);
	}
	@Transient
	private Medial_Employer employer;

	public Medial_Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Medial_Employer employer) {
		this.employer = employer;
	}		
}
	
