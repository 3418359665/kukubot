package me.kuku.simbot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "host_loc")
public class HostLocEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne
	@JoinColumn(name = "qq")
	private QqEntity qqEntity;
	@Column(length = 2000)
	private String cookie;
	private Boolean sign = false;
	private Boolean monitor = false;

	public HostLocEntity(QqEntity qqEntity){
		this.qqEntity = qqEntity;
	}

	public HostLocEntity(String cookie){
		this.cookie = cookie;
	}
}
