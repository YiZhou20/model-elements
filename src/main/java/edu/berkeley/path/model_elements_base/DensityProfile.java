/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** Density on each link at a point in time */
public class DensityProfile extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DensityProfile\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"Density on each link at a point in time\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]}");
  @Deprecated public java.lang.CharSequence id;
  /** map key is linkId */
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Double> vehiclesPerMeter;

  /**
   * Default constructor.
   */
  public DensityProfile() {}

  /**
   * All-args constructor.
   */
  public DensityProfile(java.lang.CharSequence id, java.util.Map<java.lang.CharSequence,java.lang.Double> vehiclesPerMeter) {
    this.id = id;
    this.vehiclesPerMeter = vehiclesPerMeter;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return vehiclesPerMeter;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: vehiclesPerMeter = (java.util.Map<java.lang.CharSequence,java.lang.Double>)value$; break;
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
   * Gets the value of the 'vehiclesPerMeter' field.
   * map key is linkId   */
  public java.util.Map<java.lang.CharSequence,java.lang.Double> getVehiclesPerMeter() {
    return vehiclesPerMeter;
  }

  /**
   * Sets the value of the 'vehiclesPerMeter' field.
   * map key is linkId   * @param value the value to set.
   */
  public void setVehiclesPerMeter(java.util.Map<java.lang.CharSequence,java.lang.Double> value) {
    this.vehiclesPerMeter = value;
  }

  /** Creates a new DensityProfile RecordBuilder */
  public static edu.berkeley.path.model_elements_base.DensityProfile.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.DensityProfile.Builder();
  }
  
  /** Creates a new DensityProfile RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.DensityProfile.Builder newBuilder(edu.berkeley.path.model_elements_base.DensityProfile.Builder other) {
    return new edu.berkeley.path.model_elements_base.DensityProfile.Builder(other);
  }
  
  /** Creates a new DensityProfile RecordBuilder by copying an existing DensityProfile instance */
  public static edu.berkeley.path.model_elements_base.DensityProfile.Builder newBuilder(edu.berkeley.path.model_elements_base.DensityProfile other) {
    return new edu.berkeley.path.model_elements_base.DensityProfile.Builder(other);
  }
  
  /**
   * RecordBuilder for DensityProfile instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DensityProfile>
    implements org.apache.avro.data.RecordBuilder<DensityProfile> {

    private java.lang.CharSequence id;
    private java.util.Map<java.lang.CharSequence,java.lang.Double> vehiclesPerMeter;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.DensityProfile.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.DensityProfile.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DensityProfile instance */
    private Builder(edu.berkeley.path.model_elements_base.DensityProfile other) {
            super(edu.berkeley.path.model_elements_base.DensityProfile.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = (java.lang.CharSequence) data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.vehiclesPerMeter)) {
        this.vehiclesPerMeter = (java.util.Map<java.lang.CharSequence,java.lang.Double>) data().deepCopy(fields()[1].schema(), other.vehiclesPerMeter);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public edu.berkeley.path.model_elements_base.DensityProfile.Builder setId(java.lang.CharSequence value) {
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
    public edu.berkeley.path.model_elements_base.DensityProfile.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'vehiclesPerMeter' field */
    public java.util.Map<java.lang.CharSequence,java.lang.Double> getVehiclesPerMeter() {
      return vehiclesPerMeter;
    }
    
    /** Sets the value of the 'vehiclesPerMeter' field */
    public edu.berkeley.path.model_elements_base.DensityProfile.Builder setVehiclesPerMeter(java.util.Map<java.lang.CharSequence,java.lang.Double> value) {
      validate(fields()[1], value);
      this.vehiclesPerMeter = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'vehiclesPerMeter' field has been set */
    public boolean hasVehiclesPerMeter() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'vehiclesPerMeter' field */
    public edu.berkeley.path.model_elements_base.DensityProfile.Builder clearVehiclesPerMeter() {
      vehiclesPerMeter = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public DensityProfile build() {
      try {
        DensityProfile record = new DensityProfile();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.vehiclesPerMeter = fieldSetFlags()[1] ? this.vehiclesPerMeter : (java.util.Map<java.lang.CharSequence,java.lang.Double>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
