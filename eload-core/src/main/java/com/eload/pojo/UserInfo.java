package com.eload.pojo;

public class UserInfo {
    private Long id;

    private Integer version;

    private Long bitstate;

    private String realname;

    private String idnumber;

    private String phonenumber;

    private Long incomegradeId;

    private Long marriageId;

    private Long kidcountId;

    private Long educationbackgroundId;

    private Integer authscore;

    private Long houseconditionId;

    private Long realauthid;

    private String email;

    public UserInfo(Long id, Integer version, Long bitstate, String realname, String idnumber, String phonenumber, Long incomegradeId, Long marriageId, Long kidcountId, Long educationbackgroundId, Integer authscore, Long houseconditionId, Long realauthid, String email) {
        this.id = id;
        this.version = version;
        this.bitstate = bitstate;
        this.realname = realname;
        this.idnumber = idnumber;
        this.phonenumber = phonenumber;
        this.incomegradeId = incomegradeId;
        this.marriageId = marriageId;
        this.kidcountId = kidcountId;
        this.educationbackgroundId = educationbackgroundId;
        this.authscore = authscore;
        this.houseconditionId = houseconditionId;
        this.realauthid = realauthid;
        this.email = email;
    }

    public UserInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getBitstate() {
        return bitstate;
    }

    public void setBitstate(Long bitstate) {
        this.bitstate = bitstate;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Long getIncomegradeId() {
        return incomegradeId;
    }

    public void setIncomegradeId(Long incomegradeId) {
        this.incomegradeId = incomegradeId;
    }

    public Long getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Long marriageId) {
        this.marriageId = marriageId;
    }

    public Long getKidcountId() {
        return kidcountId;
    }

    public void setKidcountId(Long kidcountId) {
        this.kidcountId = kidcountId;
    }

    public Long getEducationbackgroundId() {
        return educationbackgroundId;
    }

    public void setEducationbackgroundId(Long educationbackgroundId) {
        this.educationbackgroundId = educationbackgroundId;
    }

    public Integer getAuthscore() {
        return authscore;
    }

    public void setAuthscore(Integer authscore) {
        this.authscore = authscore;
    }

    public Long getHouseconditionId() {
        return houseconditionId;
    }

    public void setHouseconditionId(Long houseconditionId) {
        this.houseconditionId = houseconditionId;
    }

    public Long getRealauthid() {
        return realauthid;
    }

    public void setRealauthid(Long realauthid) {
        this.realauthid = realauthid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}