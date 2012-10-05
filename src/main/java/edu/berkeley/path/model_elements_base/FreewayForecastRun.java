/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
public class FreewayForecastRun extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FreewayForecastRun\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":{\"type\":\"record\",\"name\":\"ProcessConfig\",\"doc\":\"* Encapsulates a single run of a process.\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"pid\",\"type\":\"long\"},{\"name\":\"timeBegin\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},\"doc\":\"Note: wall clock time on host, not world time or sim time\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]}}]}");
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  /** Refers to the FreewayContext for this run (among others) */
  @Deprecated public java.lang.CharSequence contextId;
  @Deprecated public java.util.List<java.lang.Long> seeds;
  @Deprecated public edu.berkeley.path.model_elements_base.ProcessConfig process;

  /**
   * Default constructor.
   */
  public FreewayForecastRun() {}

  /**
   * All-args constructor.
   */
  public FreewayForecastRun(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence contextId, java.util.List<java.lang.Long> seeds, edu.berkeley.path.model_elements_base.ProcessConfig process) {
    this.id = id;
    this.name = name;
    this.contextId = contextId;
    this.seeds = seeds;
    this.process = process;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return contextId;
    case 3: return seeds;
    case 4: return process;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: contextId = (java.lang.CharSequence)value$; break;
    case 3: seeds = (java.util.List<java.lang.Long>)value$; break;
    case 4: process = (edu.berkeley.path.model_elements_base.ProcessConfig)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'contextId' field.
   * Refers to the FreewayContext for this run (among others)   */
  public java.lang.CharSequence getContextId() {
    return contextId;
  }

  /**
   * Sets the value of the 'contextId' field.
   * Refers to the FreewayContext for this run (among others)   * @param value the value to set.
   */
  public void setContextId(java.lang.CharSequence value) {
    this.contextId = value;
  }

  /**
   * Gets the value of the 'seeds' field.
   */
  public java.util.List<java.lang.Long> getSeeds() {
    return seeds;
  }

  /**
   * Sets the value of the 'seeds' field.
   * @param value the value to set.
   */
  public void setSeeds(java.util.List<java.lang.Long> value) {
    this.seeds = value;
  }

  /**
   * Gets the value of the 'process' field.
   */
  public edu.berkeley.path.model_elements_base.ProcessConfig getProcess() {
    return process;
  }

  /**
   * Sets the value of the 'process' field.
   * @param value the value to set.
   */
  public void setProcess(edu.berkeley.path.model_elements_base.ProcessConfig value) {
    this.process = value;
  }

  /** Creates a new FreewayForecastRun RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder();
  }
  
  /** Creates a new FreewayForecastRun RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder other) {
    return new edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder(other);
  }
  
  /** Creates a new FreewayForecastRun RecordBuilder by copying an existing FreewayForecastRun instance */
  public static edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder newBuilder(edu.berkeley.path.model_elements_base.FreewayForecastRun other) {
    return new edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder(other);
  }
  
  /**
   * RecordBuilder for FreewayForecastRun instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FreewayForecastRun>
    implements org.apache.avro.data.RecordBuilder<FreewayForecastRun> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence contextId;
    private java.util.List<java.lang.Long> seeds;
    private edu.berkeley.path.model_elements_base.ProcessConfig process;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FreewayForecastRun.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FreewayForecastRun instance */
    private Builder(edu.berkeley.path.model_elements_base.FreewayForecastRun other) {
            super(edu.berkeley.path.model_elements_base.FreewayForecastRun.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contextId)) {
        this.contextId = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.contextId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.seeds)) {
        this.seeds = (java.util.List<java.lang.Long>) data().deepCopy(fields()[3].schema(), other.seeds);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.process)) {
        this.process = (edu.berkeley.path.model_elements_base.ProcessConfig) data().deepCopy(fields()[4].schema(), other.process);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'contextId' field */
    public java.lang.CharSequence getContextId() {
      return contextId;
    }
    
    /** Sets the value of the 'contextId' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder setContextId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.contextId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'contextId' field has been set */
    public boolean hasContextId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'contextId' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder clearContextId() {
      contextId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'seeds' field */
    public java.util.List<java.lang.Long> getSeeds() {
      return seeds;
    }
    
    /** Sets the value of the 'seeds' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder setSeeds(java.util.List<java.lang.Long> value) {
      validate(fields()[3], value);
      this.seeds = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'seeds' field has been set */
    public boolean hasSeeds() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'seeds' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder clearSeeds() {
      seeds = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'process' field */
    public edu.berkeley.path.model_elements_base.ProcessConfig getProcess() {
      return process;
    }
    
    /** Sets the value of the 'process' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder setProcess(edu.berkeley.path.model_elements_base.ProcessConfig value) {
      validate(fields()[4], value);
      this.process = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'process' field has been set */
    public boolean hasProcess() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'process' field */
    public edu.berkeley.path.model_elements_base.FreewayForecastRun.Builder clearProcess() {
      process = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public FreewayForecastRun build() {
      try {
        FreewayForecastRun record = new FreewayForecastRun();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.contextId = fieldSetFlags()[2] ? this.contextId : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.seeds = fieldSetFlags()[3] ? this.seeds : (java.util.List<java.lang.Long>) defaultValue(fields()[3]);
        record.process = fieldSetFlags()[4] ? this.process : (edu.berkeley.path.model_elements_base.ProcessConfig) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
