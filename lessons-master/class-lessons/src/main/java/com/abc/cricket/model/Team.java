/**
 * 
 */
package com.abc.cricket.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name="TEAM")
@Getter @Setter @ToString
public class Team {

	@Id
	@SequenceGenerator(name="SEQ_TEAM")
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="TEAM_ID", updatable = true, insertable = true)
	private List<Player> players;
}
