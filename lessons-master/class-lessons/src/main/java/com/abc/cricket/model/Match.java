/**
 * 
 */
package com.abc.cricket.model;

import java.util.Date;

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

/**
 * @author Soham.Chakravarti
 *
 */
@Entity
@Table(name="MATCHES")
@Getter @Setter @ToString
public class Match {
	
	@Id
	@SequenceGenerator(name="SEQ_MATCHES")
	@Column(name="ID")
	private int id;
	
	@Column(name="WHEN")
	private Date when;
	
	@ManyToOne
	@JoinColumn
	private Address location;
	
	@ManyToOne
	@JoinColumn
	private Team team1;
	
	@ManyToOne
	@JoinColumn
	private Team team2;

}
