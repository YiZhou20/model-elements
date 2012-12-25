/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Used to feed a per-timestep "drip" input to freeway model.
   * This is sliced off of FDSet at a given time.
   *
   * Not part of Scenario; can be used interchangeably for
   * real-time input or for sliced up profiles from a scenario. */
public class FDMap extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FDMap\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\n   * This is sliced off of FDSet at a given time.\\n   *\\n   * Not part of Scenario; can be used interchangeably for\\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\\n   * Flow and density values are per lane in SI units.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"criticalSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeed\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacity\",\"type\":[\"null\",\"double\"]},{\"name\":\"jamDensity\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityDrop\",\"type\":[\"null\",\"double\"]},{\"name\":\"freeFlowSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"congestionWaveSpeedStd\",\"type\":[\"null\",\"double\"]},{\"name\":\"capacityStd\",\"type\":[\"null\",\"double\"]}]}},\"doc\":\"* map of FDs at a given time;\\n     * map key is linkId\"}]}");
  /** * map of FDs at a given time;
     * map key is linkId */
  @Deprecated public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> fd;

  /**
   * Default constructor.
   */
  public FDMap() {}

  /**
   * All-args constructor.
   */
  public FDMap(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> fd) {
    this.fd = fd;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return fd;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: fd = (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'fd' field.
   * * map of FDs at a given time;
     * map key is linkId   */
  public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> getFd() {
    return fd;
  }

  /**
   * Sets the value of the 'fd' field.
   * * map of FDs at a given time;
     * map key is linkId   * @param value the value to set.
   */
  public void setFd(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> value) {
    this.fd = value;
  }

  /** Creates a new FDMap RecordBuilder */
  public static edu.berkeley.path.model_elements_base.FDMap.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.FDMap.Builder();
  }
  
  /** Creates a new FDMap RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.FDMap.Builder newBuilder(edu.berkeley.path.model_elements_base.FDMap.Builder other) {
    return new edu.berkeley.path.model_elements_base.FDMap.Builder(other);
  }
  
  /** Creates a new FDMap RecordBuilder by copying an existing FDMap instance */
  public static edu.berkeley.path.model_elements_base.FDMap.Builder newBuilder(edu.berkeley.path.model_elements_base.FDMap other) {
    return new edu.berkeley.path.model_elements_base.FDMap.Builder(other);
  }
  
  /**
   * RecordBuilder for FDMap instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FDMap>
    implements org.apache.avro.data.RecordBuilder<FDMap> {

    private java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> fd;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.FDMap.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.FDMap.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FDMap instance */
    private Builder(edu.berkeley.path.model_elements_base.FDMap other) {
            super(edu.berkeley.path.model_elements_base.FDMap.SCHEMA$);
      if (isValidValue(fields()[0], other.fd)) {
        this.fd = (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD>) data().deepCopy(fields()[0].schema(), other.fd);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'fd' field */
    public java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> getFd() {
      return fd;
    }
    
    /** Sets the value of the 'fd' field */
    public edu.berkeley.path.model_elements_base.FDMap.Builder setFd(java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD> value) {
      validate(fields()[0], value);
      this.fd = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'fd' field has been set */
    public boolean hasFd() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'fd' field */
    public edu.berkeley.path.model_elements_base.FDMap.Builder clearFd() {
      fd = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public FDMap build() {
      try {
        FDMap record = new FDMap();
        record.fd = fieldSetFlags()[0] ? this.fd : (java.util.Map<java.lang.CharSequence,edu.berkeley.path.model_elements_base.FD>) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
