/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Represents both the 5 minute and 1 hour aggregated data. If delay map
   * is present, then it represents a daily aggregate.
   * */
public class PeMSStationAggregate extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PeMSStationAggregate\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Represents both the 5 minute and 1 hour aggregated data. If delay map\\n   * is present, then it represents a daily aggregate.\\n   *\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]}},{\"name\":\"total\",\"type\":{\"type\":\"record\",\"name\":\"PeMSAggregate\",\"doc\":\"* Used in both the 5 minute and 1 hour case for per-lane\\n   * and per-station aggregated data, and in the 1 day case\\n   * for per-station aggregated data.\\n   *\",\"fields\":[{\"name\":\"samples\",\"type\":[\"long\",\"null\"]},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"avgOccupancy\",\"type\":[\"double\",\"null\"]},{\"name\":\"avgSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"observed\",\"type\":[\"double\",\"null\"]}]}},{\"name\":\"byLane\",\"type\":{\"type\":\"array\",\"items\":\"PeMSAggregate\"}},{\"name\":\"delay\",\"type\":[{\"type\":\"map\",\"values\":\"float\"},\"null\"]}]}");
  @Deprecated public long vdsId;
  @Deprecated public edu.berkeley.path.model_elements_base.DateTime timeMeasured;
  @Deprecated public edu.berkeley.path.model_elements_base.PeMSAggregate total;
  @Deprecated public java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> byLane;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Float> delay;

  /**
   * Default constructor.
   */
  public PeMSStationAggregate() {}

  /**
   * All-args constructor.
   */
  public PeMSStationAggregate(java.lang.Long vdsId, edu.berkeley.path.model_elements_base.DateTime timeMeasured, edu.berkeley.path.model_elements_base.PeMSAggregate total, java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> byLane, java.util.Map<java.lang.CharSequence,java.lang.Float> delay) {
    this.vdsId = vdsId;
    this.timeMeasured = timeMeasured;
    this.total = total;
    this.byLane = byLane;
    this.delay = delay;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vdsId;
    case 1: return timeMeasured;
    case 2: return total;
    case 3: return byLane;
    case 4: return delay;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vdsId = (java.lang.Long)value$; break;
    case 1: timeMeasured = (edu.berkeley.path.model_elements_base.DateTime)value$; break;
    case 2: total = (edu.berkeley.path.model_elements_base.PeMSAggregate)value$; break;
    case 3: byLane = (java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate>)value$; break;
    case 4: delay = (java.util.Map<java.lang.CharSequence,java.lang.Float>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vdsId' field.
   */
  public java.lang.Long getVdsId() {
    return vdsId;
  }

  /**
   * Sets the value of the 'vdsId' field.
   * @param value the value to set.
   */
  public void setVdsId(java.lang.Long value) {
    this.vdsId = value;
  }

  /**
   * Gets the value of the 'timeMeasured' field.
   */
  public edu.berkeley.path.model_elements_base.DateTime getTimeMeasured() {
    return timeMeasured;
  }

  /**
   * Sets the value of the 'timeMeasured' field.
   * @param value the value to set.
   */
  public void setTimeMeasured(edu.berkeley.path.model_elements_base.DateTime value) {
    this.timeMeasured = value;
  }

  /**
   * Gets the value of the 'total' field.
   */
  public edu.berkeley.path.model_elements_base.PeMSAggregate getTotal() {
    return total;
  }

  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(edu.berkeley.path.model_elements_base.PeMSAggregate value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'byLane' field.
   */
  public java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> getByLane() {
    return byLane;
  }

  /**
   * Sets the value of the 'byLane' field.
   * @param value the value to set.
   */
  public void setByLane(java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> value) {
    this.byLane = value;
  }

  /**
   * Gets the value of the 'delay' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Float> getDelay() {
    return delay;
  }

  /**
   * Sets the value of the 'delay' field.
   * @param value the value to set.
   */
  public void setDelay(java.util.Map<java.lang.CharSequence,java.lang.Float> value) {
    this.delay = value;
  }

  /** Creates a new PeMSStationAggregate RecordBuilder */
  public static edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder();
  }
  
  /** Creates a new PeMSStationAggregate RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder other) {
    return new edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder(other);
  }
  
  /** Creates a new PeMSStationAggregate RecordBuilder by copying an existing PeMSStationAggregate instance */
  public static edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder newBuilder(edu.berkeley.path.model_elements_base.PeMSStationAggregate other) {
    return new edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder(other);
  }
  
  /**
   * RecordBuilder for PeMSStationAggregate instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PeMSStationAggregate>
    implements org.apache.avro.data.RecordBuilder<PeMSStationAggregate> {

    private long vdsId;
    private edu.berkeley.path.model_elements_base.DateTime timeMeasured;
    private edu.berkeley.path.model_elements_base.PeMSAggregate total;
    private java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> byLane;
    private java.util.Map<java.lang.CharSequence,java.lang.Float> delay;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.PeMSStationAggregate.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing PeMSStationAggregate instance */
    private Builder(edu.berkeley.path.model_elements_base.PeMSStationAggregate other) {
            super(edu.berkeley.path.model_elements_base.PeMSStationAggregate.SCHEMA$);
      if (isValidValue(fields()[0], other.vdsId)) {
        this.vdsId = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.vdsId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeMeasured)) {
        this.timeMeasured = (edu.berkeley.path.model_elements_base.DateTime) data().deepCopy(fields()[1].schema(), other.timeMeasured);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = (edu.berkeley.path.model_elements_base.PeMSAggregate) data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.byLane)) {
        this.byLane = (java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate>) data().deepCopy(fields()[3].schema(), other.byLane);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.delay)) {
        this.delay = (java.util.Map<java.lang.CharSequence,java.lang.Float>) data().deepCopy(fields()[4].schema(), other.delay);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'vdsId' field */
    public java.lang.Long getVdsId() {
      return vdsId;
    }
    
    /** Sets the value of the 'vdsId' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder setVdsId(long value) {
      validate(fields()[0], value);
      this.vdsId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'vdsId' field has been set */
    public boolean hasVdsId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'vdsId' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder clearVdsId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeMeasured' field */
    public edu.berkeley.path.model_elements_base.DateTime getTimeMeasured() {
      return timeMeasured;
    }
    
    /** Sets the value of the 'timeMeasured' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder setTimeMeasured(edu.berkeley.path.model_elements_base.DateTime value) {
      validate(fields()[1], value);
      this.timeMeasured = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeMeasured' field has been set */
    public boolean hasTimeMeasured() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeMeasured' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder clearTimeMeasured() {
      timeMeasured = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'total' field */
    public edu.berkeley.path.model_elements_base.PeMSAggregate getTotal() {
      return total;
    }
    
    /** Sets the value of the 'total' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder setTotal(edu.berkeley.path.model_elements_base.PeMSAggregate value) {
      validate(fields()[2], value);
      this.total = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'total' field has been set */
    public boolean hasTotal() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'total' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder clearTotal() {
      total = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'byLane' field */
    public java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> getByLane() {
      return byLane;
    }
    
    /** Sets the value of the 'byLane' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder setByLane(java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate> value) {
      validate(fields()[3], value);
      this.byLane = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'byLane' field has been set */
    public boolean hasByLane() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'byLane' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder clearByLane() {
      byLane = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'delay' field */
    public java.util.Map<java.lang.CharSequence,java.lang.Float> getDelay() {
      return delay;
    }
    
    /** Sets the value of the 'delay' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder setDelay(java.util.Map<java.lang.CharSequence,java.lang.Float> value) {
      validate(fields()[4], value);
      this.delay = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'delay' field has been set */
    public boolean hasDelay() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'delay' field */
    public edu.berkeley.path.model_elements_base.PeMSStationAggregate.Builder clearDelay() {
      delay = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public PeMSStationAggregate build() {
      try {
        PeMSStationAggregate record = new PeMSStationAggregate();
        record.vdsId = fieldSetFlags()[0] ? this.vdsId : (java.lang.Long) defaultValue(fields()[0]);
        record.timeMeasured = fieldSetFlags()[1] ? this.timeMeasured : (edu.berkeley.path.model_elements_base.DateTime) defaultValue(fields()[1]);
        record.total = fieldSetFlags()[2] ? this.total : (edu.berkeley.path.model_elements_base.PeMSAggregate) defaultValue(fields()[2]);
        record.byLane = fieldSetFlags()[3] ? this.byLane : (java.util.List<edu.berkeley.path.model_elements_base.PeMSAggregate>) defaultValue(fields()[3]);
        record.delay = fieldSetFlags()[4] ? this.delay : (java.util.Map<java.lang.CharSequence,java.lang.Float>) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}