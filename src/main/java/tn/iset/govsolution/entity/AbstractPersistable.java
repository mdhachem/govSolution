package tn.iset.govsolution.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;



@MappedSuperclass
public abstract class AbstractPersistable<PK extends Serializable>  {

	private static final long serialVersionUID = -5554308939380869754L;

	@Id @GeneratedValue private PK id;
	
	@Column(name = "id_tenant")
	private Long id_tenant;

	
	
	
	
	public AbstractPersistable() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public AbstractPersistable(PK id) {
		super();
		this.id = id;
	}




	public AbstractPersistable(PK id, Long id_tenant) {
		super();
		this.id = id;
		this.id_tenant = id_tenant;
	}




	public  PK getId() {
		return id;
	}

	protected  void setId(final PK id) {
		this.id = id;
	}

	@Transient 
	public  boolean isNew() {
		return null == getId();
	}

	
	@Override
	public  String toString() {
		return String.format("Entity of type %s with id: %s", this.getClass().getName(), getId());
	}

	
	@Override
	public  boolean equals(Object obj) {

		if (null == obj) {
			return false;
		}

		if (this == obj) {
			return true;
		}

//		if (!getClass().equals(ClassUtils.getUserClass(obj))) {
//			return false;
//		}

		AbstractPersistable<?> that = (AbstractPersistable<?>) obj;

		return null == this.getId() ? false : this.getId().equals(that.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public  int hashCode() {

		int hashCode = 17;

		hashCode += null == getId() ? 0 : getId().hashCode() * 31;

		return hashCode;
	}
}
