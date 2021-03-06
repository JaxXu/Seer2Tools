package com.jax.seer2tools.entity;

public class MonsterInfo {
    private Short id;

    private Integer numbersId;

    private String defName;

    private Byte growthType;

    private Short hp;

    private Short atk;

    private Short def;

    private Short spAtk;

    private Short spDef;

    private Short spd;

    private Short yieldingExp;

    private Short yieldingEv;

    private Short evolvesFrom;

    private Short evolvesTo;

    private Short evolvesLv;

    private Byte type;

    private Short catchRat;

    private Short evolvFlag;

    private Byte freeForbidden;

    private String height;

    private String weight;

    private String gender;

    private Short features;

    private Byte ride;

    private Byte useNum;

    private Short chgMonId;
    
    private Monster evolvesFromInfo;

    private Monster evolvesToInfo;
    
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getNumbersId() {
        return numbersId;
    }

    public void setNumbersId(Integer numbersId) {
        this.numbersId = numbersId;
    }

    public String getDefName() {
        return defName;
    }

    public void setDefName(String defName) {
        this.defName = defName == null ? null : defName.trim();
    }

    public Byte getGrowthType() {
        return growthType;
    }

    public void setGrowthType(Byte growthType) {
        this.growthType = growthType;
    }

    public Short getHp() {
        return hp;
    }

    public void setHp(Short hp) {
        this.hp = hp;
    }

    public Short getAtk() {
        return atk;
    }

    public void setAtk(Short atk) {
        this.atk = atk;
    }

    public Short getDef() {
        return def;
    }

    public void setDef(Short def) {
        this.def = def;
    }

    public Short getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(Short spAtk) {
        this.spAtk = spAtk;
    }

    public Short getSpDef() {
        return spDef;
    }

    public void setSpDef(Short spDef) {
        this.spDef = spDef;
    }

    public Short getSpd() {
        return spd;
    }

    public void setSpd(Short spd) {
        this.spd = spd;
    }

    public Short getYieldingExp() {
        return yieldingExp;
    }

    public void setYieldingExp(Short yieldingExp) {
        this.yieldingExp = yieldingExp;
    }

    public Short getYieldingEv() {
        return yieldingEv;
    }

    public void setYieldingEv(Short yieldingEv) {
        this.yieldingEv = yieldingEv;
    }

    public Short getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(Short evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    public Short getEvolvesTo() {
        return evolvesTo;
    }

    public void setEvolvesTo(Short evolvesTo) {
        this.evolvesTo = evolvesTo;
    }

    public Short getEvolvesLv() {
        return evolvesLv;
    }

    public void setEvolvesLv(Short evolvesLv) {
        this.evolvesLv = evolvesLv;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Short getCatchRat() {
        return catchRat;
    }

    public void setCatchRat(Short catchRat) {
        this.catchRat = catchRat;
    }

    public Short getEvolvFlag() {
        return evolvFlag;
    }

    public void setEvolvFlag(Short evolvFlag) {
        this.evolvFlag = evolvFlag;
    }

    public Byte getFreeForbidden() {
        return freeForbidden;
    }

    public void setFreeForbidden(Byte freeForbidden) {
        this.freeForbidden = freeForbidden;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Short getFeatures() {
        return features;
    }

    public void setFeatures(Short features) {
        this.features = features;
    }

    public Byte getRide() {
        return ride;
    }

    public void setRide(Byte ride) {
        this.ride = ride;
    }

    public Byte getUseNum() {
        return useNum;
    }

    public void setUseNum(Byte useNum) {
        this.useNum = useNum;
    }

    public Short getChgMonId() {
        return chgMonId;
    }

    public void setChgMonId(Short chgMonId) {
        this.chgMonId = chgMonId;
    }

    
	public Monster getEvolvesFromInfo() {
		return evolvesFromInfo;
	}

	public void setEvolvesFromInfo(Monster evolvesFromInfo) {
		this.evolvesFromInfo = evolvesFromInfo;
	}

	public Monster getEvolvesToInfo() {
		return evolvesToInfo;
	}

	public void setEvolvesToInfo(Monster evolvesToInfo) {
		this.evolvesToInfo = evolvesToInfo;
	}

	@Override
	public String toString() {
		return "MonsterInfo [id=" + id + ", numbersId=" + numbersId + ", defName=" + defName + ", growthType="
				+ growthType + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", spAtk=" + spAtk + ", spDef=" + spDef
				+ ", spd=" + spd + ", yieldingExp=" + yieldingExp + ", yieldingEv=" + yieldingEv + ", evolvesFrom="
				+ evolvesFrom + ", evolvesTo=" + evolvesTo + ", evolvesLv=" + evolvesLv + ", type=" + type
				+ ", catchRat=" + catchRat + ", evolvFlag=" + evolvFlag + ", freeForbidden=" + freeForbidden
				+ ", height=" + height + ", weight=" + weight + ", gender=" + gender + ", features=" + features
				+ ", ride=" + ride + ", useNum=" + useNum + ", chgMonId=" + chgMonId + ", evolvesFromInfo="
				+ evolvesFromInfo + ", evolvesToInfo=" + evolvesToInfo + "]";
	}
    
}