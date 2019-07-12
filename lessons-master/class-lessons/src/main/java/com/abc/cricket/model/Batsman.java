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
@Table(name="BATSMAN")
@Getter @Setter @ToString
public class Batsman {
	
	@Id
	@SequenceGenerator(name="BATSMAN_ID")
	@Column(name="BATSMAN_ID")
	private int id;
	
	@OneToOne
	@JoinColumn(name="ID", insertable = false, updatable = false)
	private Player player;
	
	@Column(name="SIX_S")
	private int sixs;
	
	@Column(name="FOUR_S")
	private int fours;
	
	@Column(name="STRIKE_RATE")
	private float strikeRate;
	
	@Column(name="SCORE")
	private int score;
	
	@Column(name="OUT_TYPE")
	private String outType;
	
	@OneToOne
	@JoinColumn(name="BOWLER_ID")
	private Bowler bowlerId;
	
	@OneToOne
	@JoinColumn(name="ID")
	private Player outFielderId;
	
	
}
