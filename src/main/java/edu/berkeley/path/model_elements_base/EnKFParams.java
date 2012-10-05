/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;  
@SuppressWarnings("all")
/** * Context and Run Config section
   *
   * Configuration that applies to one run or a group of runs.
   *
   * These objects correspond to the TBD Run tables. */
public class EnKFParams extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EnKFParams\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Context and Run Config section\\n   *\\n   * Configuration that applies to one run or a group of runs.\\n   *\\n   * These objects correspond to the TBD Run tables.\",\"fields\":[{\"name\":\"n_ensembles\",\"type\":\"int\"}]}");
  @Deprecated public int n_ensembles;

  /**
   * Default constructor.
   */
  public EnKFParams() {}

  /**
   * All-args constructor.
   */
  public EnKFParams(java.lang.Integer n_ensembles) {
    this.n_ensembles = n_ensembles;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return n_ensembles;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: n_ensembles = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'n_ensembles' field.
   */
  public java.lang.Integer getNEnsembles() {
    return n_ensembles;
  }

  /**
   * Sets the value of the 'n_ensembles' field.
   * @param value the value to set.
   */
  public void setNEnsembles(java.lang.Integer value) {
    this.n_ensembles = value;
  }

  /** Creates a new EnKFParams RecordBuilder */
  public static edu.berkeley.path.model_elements_base.EnKFParams.Builder newBuilder() {
    return new edu.berkeley.path.model_elements_base.EnKFParams.Builder();
  }
  
  /** Creates a new EnKFParams RecordBuilder by copying an existing Builder */
  public static edu.berkeley.path.model_elements_base.EnKFParams.Builder newBuilder(edu.berkeley.path.model_elements_base.EnKFParams.Builder other) {
    return new edu.berkeley.path.model_elements_base.EnKFParams.Builder(other);
  }
  
  /** Creates a new EnKFParams RecordBuilder by copying an existing EnKFParams instance */
  public static edu.berkeley.path.model_elements_base.EnKFParams.Builder newBuilder(edu.berkeley.path.model_elements_base.EnKFParams other) {
    return new edu.berkeley.path.model_elements_base.EnKFParams.Builder(other);
  }
  
  /**
   * RecordBuilder for EnKFParams instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EnKFParams>
    implements org.apache.avro.data.RecordBuilder<EnKFParams> {

    private int n_ensembles;

    /** Creates a new Builder */
    private Builder() {
      super(edu.berkeley.path.model_elements_base.EnKFParams.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(edu.berkeley.path.model_elements_base.EnKFParams.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing EnKFParams instance */
    private Builder(edu.berkeley.path.model_elements_base.EnKFParams other) {
            super(edu.berkeley.path.model_elements_base.EnKFParams.SCHEMA$);
      if (isValidValue(fields()[0], other.n_ensembles)) {
        this.n_ensembles = (java.lang.Integer) data().deepCopy(fields()[0].schema(), other.n_ensembles);
        fieldSetFlags()[0] = true;
      }
    }

    /** Gets the value of the 'n_ensembles' field */
    public java.lang.Integer getNEnsembles() {
      return n_ensembles;
    }
    
    /** Sets the value of the 'n_ensembles' field */
    public edu.berkeley.path.model_elements_base.EnKFParams.Builder setNEnsembles(int value) {
      validate(fields()[0], value);
      this.n_ensembles = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'n_ensembles' field has been set */
    public boolean hasNEnsembles() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'n_ensembles' field */
    public edu.berkeley.path.model_elements_base.EnKFParams.Builder clearNEnsembles() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    public EnKFParams build() {
      try {
        EnKFParams record = new EnKFParams();
        record.n_ensembles = fieldSetFlags()[0] ? this.n_ensembles : (java.lang.Integer) defaultValue(fields()[0]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
