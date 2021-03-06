package com.jax.seer2tools.entity;

public class Monster {
    private Short id;

    private String defName;

    private Byte type;
    
    private Byte star;
    
    private Byte isNew;
    
    private String boosAi;
    
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getDefName() {
        return defName;
    }

    public void setDefName(String defName) {
        this.defName = defName == null ? null : defName.trim();
    }
    
	public Byte getType() {
		return type;
	}

	public void setType(Byte type) {
		this.type = type;
	}

	public Byte getStar() {
		return star;
	}

	public void setStar(Byte star) {
		this.star = star;
	}

	public Byte getIsNew() {
		return isNew;
	}

	public void setIsNew(Byte isNew) {
		this.isNew = isNew;
	}

	public String getBoosAi() {
		return boosAi;
	}

	public void setBoosAi(String boosAi) {
		this.boosAi = boosAi;
	}

	@Override
	public String toString() {
		return "Monster [id=" + id + ", defName=" + defName + "]";
	}
    
}