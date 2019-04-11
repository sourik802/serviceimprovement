package com.monsanto.serviceimprovement.entity;

import javax.persistence.*;

/**
 * Created by SNAND3 on 4/3/2018.
 */
@Entity
@Table(name = "MIDAS_ROLE", schema = "MIDAS", catalog = "")
public class MidasRoleEntity {
	private byte midasRoleId;
	private String name;
	private String midasRoleRefId;
	private String midasRoleTypeId;
	private String refActive;
	private Byte listOrder;

	@Id
	@Column(name = "MIDAS_ROLE_ID")
	public byte getMidasRoleId() {
		return midasRoleId;
	}

	public void setMidasRoleId(byte midasRoleId) {
		this.midasRoleId = midasRoleId;
	}

	@Basic
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "MIDAS_ROLE_REF_ID")
	public String getMidasRoleRefId() {
		return midasRoleRefId;
	}

	public void setMidasRoleRefId(String midasRoleRefId) {
		this.midasRoleRefId = midasRoleRefId;
	}

	@Basic
	@Column(name = "MIDAS_ROLE_TYPE_ID")
	public String getMidasRoleTypeId() {
		return midasRoleTypeId;
	}

	public void setMidasRoleTypeId(String midasRoleTypeId) {
		this.midasRoleTypeId = midasRoleTypeId;
	}

	@Basic
	@Column(name = "REF_ACTIVE")
	public String getRefActive() {
		return refActive;
	}

	public void setRefActive(String refActive) {
		this.refActive = refActive;
	}

	@Basic
	@Column(name = "LIST_ORDER")
	public Byte getListOrder() {
		return listOrder;
	}

	public void setListOrder(Byte listOrder) {
		this.listOrder = listOrder;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MidasRoleEntity that = (MidasRoleEntity) o;

		if (midasRoleId != that.midasRoleId) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (midasRoleRefId != null ? !midasRoleRefId.equals(that.midasRoleRefId) : that.midasRoleRefId != null)
			return false;
		if (midasRoleTypeId != null ? !midasRoleTypeId.equals(that.midasRoleTypeId) : that.midasRoleTypeId != null)
			return false;
		if (refActive != null ? !refActive.equals(that.refActive) : that.refActive != null) return false;
		if (listOrder != null ? !listOrder.equals(that.listOrder) : that.listOrder != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (int) midasRoleId;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (midasRoleRefId != null ? midasRoleRefId.hashCode() : 0);
		result = 31 * result + (midasRoleTypeId != null ? midasRoleTypeId.hashCode() : 0);
		result = 31 * result + (refActive != null ? refActive.hashCode() : 0);
		result = 31 * result + (listOrder != null ? listOrder.hashCode() : 0);
		return result;
	}
}
