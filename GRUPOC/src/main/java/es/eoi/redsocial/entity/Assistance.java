package es.eoi.redsocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="assitance")
public class Assistance {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;

	@Column
	private boolean state;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_user")
	User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_event")
	Event event;
	
	
	
	
	
	
	
}
