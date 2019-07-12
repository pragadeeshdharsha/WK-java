package com.abc.cricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="BOWLER")
@Getter @Setter @ToString
public class Bowler {
	
	@Id
	@SequenceGenerator(name="SEQ_BOWLER_ID")
	@Column(name="ID")
	private int id;
	
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Player player;
	
	
	@Column(name="OVERS")
	private int overs;
	
	@Column(name="MAIDEN_OVERS")
	private int maidenOvers;
	
	@Column(name="RUNS_GIVEN")
	private int runsGiven;
	
	@Column(name="WICKETS")
	private int wickets;
	
	@Column(name="NO_BALLS")
	private String noBalls;
	
	@Column(name="WIDES")
	private String wides;
	
	
}
