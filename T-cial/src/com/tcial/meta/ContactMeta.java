package com.tcial.meta;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2012-10-15 20:49:26")
/** */
public final class ContactMeta extends org.slim3.datastore.ModelMeta<com.tcial.model.management.Contact> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> address = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "address", "address");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> contact_hours = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "contact_hours", "contact_hours");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> content = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "content", "content");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.tcial.model.management.Contact, java.util.Date> created_at = new org.slim3.datastore.CoreAttributeMeta<com.tcial.model.management.Contact, java.util.Date>(this, "created_at", "created_at", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> firstname = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "firstname", "firstname");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> goal = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "goal", "goal");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> grade = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "grade", "grade");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> how_know = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "how_know", "how_know");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> inquiry = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "inquiry", "inquiry");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.tcial.model.management.Contact, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<com.tcial.model.management.Contact, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> lastname = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "lastname", "lastname");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> mai = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "mai", "mai");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> mail = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "mail", "mail");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> postal_code = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "postal_code", "postal_code");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> problem = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "problem", "problem");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> sai = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "sai", "sai");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> school_category = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "school_category", "school_category");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> school_name = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "school_name", "school_name");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> strong_weakness = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "strong_weakness", "strong_weakness");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> tel = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "tel", "tel");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact> terms = new org.slim3.datastore.StringAttributeMeta<com.tcial.model.management.Contact>(this, "terms", "terms");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<com.tcial.model.management.Contact, java.lang.Long> version = new org.slim3.datastore.CoreAttributeMeta<com.tcial.model.management.Contact, java.lang.Long>(this, "version", "version", java.lang.Long.class);

    private static final org.slim3.datastore.CreationDate slim3_created_atAttributeListener = new org.slim3.datastore.CreationDate();

    private static final ContactMeta slim3_singleton = new ContactMeta();

    /**
     * @return the singleton
     */
    public static ContactMeta get() {
       return slim3_singleton;
    }

    /** */
    public ContactMeta() {
        super("Contact", com.tcial.model.management.Contact.class);
    }

    @Override
    public com.tcial.model.management.Contact entityToModel(com.google.appengine.api.datastore.Entity entity) {
        com.tcial.model.management.Contact model = new com.tcial.model.management.Contact();
        model.setAddress((java.lang.String) entity.getProperty("address"));
        model.setContact_hours((java.lang.String) entity.getProperty("contact_hours"));
        model.setContent((java.lang.String) entity.getProperty("content"));
        model.setCreated_at((java.util.Date) entity.getProperty("created_at"));
        model.setFirstname((java.lang.String) entity.getProperty("firstname"));
        model.setGoal((java.lang.String) entity.getProperty("goal"));
        model.setGrade((java.lang.String) entity.getProperty("grade"));
        model.setHow_know((java.lang.String) entity.getProperty("how_know"));
        model.setInquiry((java.lang.String) entity.getProperty("inquiry"));
        model.setKey(entity.getKey());
        model.setLastname((java.lang.String) entity.getProperty("lastname"));
        model.setMai((java.lang.String) entity.getProperty("mai"));
        model.setMail((java.lang.String) entity.getProperty("mail"));
        model.setPostal_code((java.lang.String) entity.getProperty("postal_code"));
        model.setProblem((java.lang.String) entity.getProperty("problem"));
        model.setSai((java.lang.String) entity.getProperty("sai"));
        model.setSchool_category((java.lang.String) entity.getProperty("school_category"));
        model.setSchool_name((java.lang.String) entity.getProperty("school_name"));
        model.setStrong_weakness((java.lang.String) entity.getProperty("strong_weakness"));
        model.setTel((java.lang.String) entity.getProperty("tel"));
        model.setTerms((java.lang.String) entity.getProperty("terms"));
        model.setVersion((java.lang.Long) entity.getProperty("version"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("address", m.getAddress());
        entity.setProperty("contact_hours", m.getContact_hours());
        entity.setProperty("content", m.getContent());
        entity.setProperty("created_at", m.getCreated_at());
        entity.setProperty("firstname", m.getFirstname());
        entity.setProperty("goal", m.getGoal());
        entity.setProperty("grade", m.getGrade());
        entity.setProperty("how_know", m.getHow_know());
        entity.setProperty("inquiry", m.getInquiry());
        entity.setProperty("lastname", m.getLastname());
        entity.setProperty("mai", m.getMai());
        entity.setProperty("mail", m.getMail());
        entity.setProperty("postal_code", m.getPostal_code());
        entity.setProperty("problem", m.getProblem());
        entity.setProperty("sai", m.getSai());
        entity.setProperty("school_category", m.getSchool_category());
        entity.setProperty("school_name", m.getSchool_name());
        entity.setProperty("strong_weakness", m.getStrong_weakness());
        entity.setProperty("tel", m.getTel());
        entity.setProperty("terms", m.getTerms());
        entity.setProperty("version", m.getVersion());
        entity.setProperty("slim3.schemaVersion", 1);
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        return m.getVersion() != null ? m.getVersion().longValue() : 0L;
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        long version = m.getVersion() != null ? m.getVersion().longValue() : 0L;
        m.setVersion(Long.valueOf(version + 1L));
    }

    @Override
    protected void prePut(Object model) {
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        m.setCreated_at(slim3_created_atAttributeListener.prePut(m.getCreated_at()));
    }

    @Override
    protected void postGet(Object model) {
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        com.tcial.model.management.Contact m = (com.tcial.model.management.Contact) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAddress() != null){
            writer.setNextPropertyName("address");
            encoder0.encode(writer, m.getAddress());
        }
        if(m.getContact_hours() != null){
            writer.setNextPropertyName("contact_hours");
            encoder0.encode(writer, m.getContact_hours());
        }
        if(m.getContent() != null){
            writer.setNextPropertyName("content");
            encoder0.encode(writer, m.getContent());
        }
        if(m.getCreated_at() != null){
            writer.setNextPropertyName("created_at");
            encoder0.encode(writer, m.getCreated_at());
        }
        if(m.getFirstname() != null){
            writer.setNextPropertyName("firstname");
            encoder0.encode(writer, m.getFirstname());
        }
        if(m.getGoal() != null){
            writer.setNextPropertyName("goal");
            encoder0.encode(writer, m.getGoal());
        }
        if(m.getGrade() != null){
            writer.setNextPropertyName("grade");
            encoder0.encode(writer, m.getGrade());
        }
        if(m.getHow_know() != null){
            writer.setNextPropertyName("how_know");
            encoder0.encode(writer, m.getHow_know());
        }
        if(m.getInquiry() != null){
            writer.setNextPropertyName("inquiry");
            encoder0.encode(writer, m.getInquiry());
        }
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        if(m.getLastname() != null){
            writer.setNextPropertyName("lastname");
            encoder0.encode(writer, m.getLastname());
        }
        if(m.getMai() != null){
            writer.setNextPropertyName("mai");
            encoder0.encode(writer, m.getMai());
        }
        if(m.getMail() != null){
            writer.setNextPropertyName("mail");
            encoder0.encode(writer, m.getMail());
        }
        if(m.getPostal_code() != null){
            writer.setNextPropertyName("postal_code");
            encoder0.encode(writer, m.getPostal_code());
        }
        if(m.getProblem() != null){
            writer.setNextPropertyName("problem");
            encoder0.encode(writer, m.getProblem());
        }
        if(m.getSai() != null){
            writer.setNextPropertyName("sai");
            encoder0.encode(writer, m.getSai());
        }
        if(m.getSchool_category() != null){
            writer.setNextPropertyName("school_category");
            encoder0.encode(writer, m.getSchool_category());
        }
        if(m.getSchool_name() != null){
            writer.setNextPropertyName("school_name");
            encoder0.encode(writer, m.getSchool_name());
        }
        if(m.getStrong_weakness() != null){
            writer.setNextPropertyName("strong_weakness");
            encoder0.encode(writer, m.getStrong_weakness());
        }
        if(m.getTel() != null){
            writer.setNextPropertyName("tel");
            encoder0.encode(writer, m.getTel());
        }
        if(m.getTerms() != null){
            writer.setNextPropertyName("terms");
            encoder0.encode(writer, m.getTerms());
        }
        if(m.getVersion() != null){
            writer.setNextPropertyName("version");
            encoder0.encode(writer, m.getVersion());
        }
        writer.endObject();
    }

    @Override
    protected com.tcial.model.management.Contact jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        com.tcial.model.management.Contact m = new com.tcial.model.management.Contact();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("address");
        m.setAddress(decoder0.decode(reader, m.getAddress()));
        reader = rootReader.newObjectReader("contact_hours");
        m.setContact_hours(decoder0.decode(reader, m.getContact_hours()));
        reader = rootReader.newObjectReader("content");
        m.setContent(decoder0.decode(reader, m.getContent()));
        reader = rootReader.newObjectReader("created_at");
        m.setCreated_at(decoder0.decode(reader, m.getCreated_at()));
        reader = rootReader.newObjectReader("firstname");
        m.setFirstname(decoder0.decode(reader, m.getFirstname()));
        reader = rootReader.newObjectReader("goal");
        m.setGoal(decoder0.decode(reader, m.getGoal()));
        reader = rootReader.newObjectReader("grade");
        m.setGrade(decoder0.decode(reader, m.getGrade()));
        reader = rootReader.newObjectReader("how_know");
        m.setHow_know(decoder0.decode(reader, m.getHow_know()));
        reader = rootReader.newObjectReader("inquiry");
        m.setInquiry(decoder0.decode(reader, m.getInquiry()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("lastname");
        m.setLastname(decoder0.decode(reader, m.getLastname()));
        reader = rootReader.newObjectReader("mai");
        m.setMai(decoder0.decode(reader, m.getMai()));
        reader = rootReader.newObjectReader("mail");
        m.setMail(decoder0.decode(reader, m.getMail()));
        reader = rootReader.newObjectReader("postal_code");
        m.setPostal_code(decoder0.decode(reader, m.getPostal_code()));
        reader = rootReader.newObjectReader("problem");
        m.setProblem(decoder0.decode(reader, m.getProblem()));
        reader = rootReader.newObjectReader("sai");
        m.setSai(decoder0.decode(reader, m.getSai()));
        reader = rootReader.newObjectReader("school_category");
        m.setSchool_category(decoder0.decode(reader, m.getSchool_category()));
        reader = rootReader.newObjectReader("school_name");
        m.setSchool_name(decoder0.decode(reader, m.getSchool_name()));
        reader = rootReader.newObjectReader("strong_weakness");
        m.setStrong_weakness(decoder0.decode(reader, m.getStrong_weakness()));
        reader = rootReader.newObjectReader("tel");
        m.setTel(decoder0.decode(reader, m.getTel()));
        reader = rootReader.newObjectReader("terms");
        m.setTerms(decoder0.decode(reader, m.getTerms()));
        reader = rootReader.newObjectReader("version");
        m.setVersion(decoder0.decode(reader, m.getVersion()));
        return m;
    }
}