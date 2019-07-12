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
@Table(name="SCORECARD")
@Getter @Setter @ToString
public class ScoreCard {
	
	@Id
	@SequenceGenerator(name="SEQ_SCORECARD")	
	@Column(name="MATCH_ID")
	private int matchId;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="OVERS")
	private int overs;	
	
}
