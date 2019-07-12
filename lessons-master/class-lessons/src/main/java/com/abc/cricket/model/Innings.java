package com.abc.cricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="INNINGS")
@Getter @Setter @ToString
public class Innings {
	
		
	@Id
	@SequenceGenerator(name="SEQ_INN")	
	@Column(name="OVERS")
	private int overs;
	
	@OneToOne
	@JoinColumn(name="ID", insertable = false, updatable = false)
	private Team inning1;
	
	@OneToOne
	@JoinColumn(name="ID", insertable = false, updatable = false)
	private Team inning2;
	
	@Column(name="NO_OF_WICKETS")
	private int noOfWickets;
	
	@Column(name="EXTRAS")
	private int extras;
	
	@Column(name="NET_RUN_RATE")
	private int netRunRate;
	
	@Column(name="TEAM_ID")
	private int teamId;
	
	
}
