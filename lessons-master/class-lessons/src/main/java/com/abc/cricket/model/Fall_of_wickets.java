package com.abc.cricket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="FALL_OF_WICKETS")
@Getter @Setter @ToString
public class Fall_of_wickets {
	
	@Id
	@SequenceGenerator(name="SEQ_FALL_OF_WICKETS")	
	@Column(name="BATSMAN_ID")
	private int batsmanId;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="OVERS")
	private int overs;	
	
}
