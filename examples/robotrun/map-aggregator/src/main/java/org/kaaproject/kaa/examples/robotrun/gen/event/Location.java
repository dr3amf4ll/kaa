/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.examples.robotrun.gen.event;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Location extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Location\",\"namespace\":\"org.kaaproject.kaa.examples.robotrun.gen.event\",\"fields\":[{\"name\":\"x\",\"type\":[\"int\",\"null\"]},{\"name\":\"y\",\"type\":[\"int\",\"null\"]}],\"classType\":\"object\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private java.lang.Integer x;
   private java.lang.Integer y;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public Location() {}

  /**
   * All-args constructor.
   */
  public Location(java.lang.Integer x, java.lang.Integer y) {
    this.x = x;
    this.y = y;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return x;
    case 1: return y;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: x = (java.lang.Integer)value$; break;
    case 1: y = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'x' field.
   */
  public java.lang.Integer getX() {
    return x;
  }

  /**
   * Sets the value of the 'x' field.
   * @param value the value to set.
   */
  public void setX(java.lang.Integer value) {
    this.x = value;
  }

  /**
   * Gets the value of the 'y' field.
   */
  public java.lang.Integer getY() {
    return y;
  }

  /**
   * Sets the value of the 'y' field.
   * @param value the value to set.
   */
  public void setY(java.lang.Integer value) {
    this.y = value;
  }

  /** Creates a new Location RecordBuilder */
  public static org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder newBuilder() {
    return new org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder();
  }
  
  /** Creates a new Location RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder newBuilder(org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder other) {
    return new org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder(other);
  }
  
  /** Creates a new Location RecordBuilder by copying an existing Location instance */
  public static org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder newBuilder(org.kaaproject.kaa.examples.robotrun.gen.event.Location other) {
    return new org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder(other);
  }
  
  /**
   * RecordBuilder for Location instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Location>
    implements org.apache.avro.data.RecordBuilder<Location> {

    private java.lang.Integer x;
    private java.lang.Integer y;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.examples.robotrun.gen.event.Location.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.x)) {
        this.x = data().deepCopy(fields()[0].schema(), other.x);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.y)) {
        this.y = data().deepCopy(fields()[1].schema(), other.y);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Location instance */
    private Builder(org.kaaproject.kaa.examples.robotrun.gen.event.Location other) {
            super(org.kaaproject.kaa.examples.robotrun.gen.event.Location.SCHEMA$);
      if (isValidValue(fields()[0], other.x)) {
        this.x = data().deepCopy(fields()[0].schema(), other.x);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.y)) {
        this.y = data().deepCopy(fields()[1].schema(), other.y);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'x' field */
    public java.lang.Integer getX() {
      return x;
    }
    
    /** Sets the value of the 'x' field */
    public org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder setX(java.lang.Integer value) {
      validate(fields()[0], value);
      this.x = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'x' field has been set */
    public boolean hasX() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'x' field */
    public org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder clearX() {
      x = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'y' field */
    public java.lang.Integer getY() {
      return y;
    }
    
    /** Sets the value of the 'y' field */
    public org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder setY(java.lang.Integer value) {
      validate(fields()[1], value);
      this.y = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'y' field has been set */
    public boolean hasY() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'y' field */
    public org.kaaproject.kaa.examples.robotrun.gen.event.Location.Builder clearY() {
      y = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Location build() {
      try {
        Location record = new Location();
        record.x = fieldSetFlags()[0] ? this.x : (java.lang.Integer) defaultValue(fields()[0]);
        record.y = fieldSetFlags()[1] ? this.y : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
