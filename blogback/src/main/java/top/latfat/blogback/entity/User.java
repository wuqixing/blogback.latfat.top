package top.latfat.blogback.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@SuppressWarnings("serial")
@Entity
@Table(name="user", catalog="blog")
@DynamicInsert(true)
@DynamicUpdate(true)
public class User implements java.io.Serializable {

	@Id
	@Column(name="id", unique=true)
	private String id;
	@Column(name="name", nullable=false)
	private String name;
	public User() {
	}
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
}
