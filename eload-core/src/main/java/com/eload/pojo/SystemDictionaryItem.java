package com.eload.pojo;

public class SystemDictionaryItem {
    private Long id;

    private Long parentid;

    private String title;

    private Byte sequence;

    public SystemDictionaryItem(Long id, Long parentid, String title, Byte sequence) {
        this.id = id;
        this.parentid = parentid;
        this.title = title;
        this.sequence = sequence;
    }

    public SystemDictionaryItem() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getSequence() {
        return sequence;
    }

    public void setSequence(Byte sequence) {
        this.sequence = sequence;
    }
}