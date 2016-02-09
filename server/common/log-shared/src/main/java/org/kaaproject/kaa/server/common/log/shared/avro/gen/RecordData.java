/**
 *  Copyright 2014-2016 CyberVision, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.common.log.shared.avro.gen;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class RecordData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordData\",\"namespace\":\"org.kaaproject.kaa.server.common.log.shared.avro.gen\",\"fields\":[{\"name\":\"recordHeader\",\"type\":[{\"type\":\"record\",\"name\":\"RecordHeader\",\"fields\":[{\"name\":\"endpointKeyHash\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"applicationToken\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"headerVersion\",\"type\":[\"int\",\"null\"]},{\"name\":\"timestamp\",\"type\":[\"long\",\"null\"]},{\"name\":\"logSchemaVersion\",\"type\":[\"int\",\"null\"]}]},\"null\"]},{\"name\":\"schemaVersion\",\"type\":\"int\"},{\"name\":\"applicationToken\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"eventRecords\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}},{\"name\":\"clientProfileBody\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"clientSchemaId\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"serverProfileBody\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]},{\"name\":\"serverSchemaId\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader recordHeader;
   private int schemaVersion;
   private java.lang.String applicationToken;
   private java.util.List<java.nio.ByteBuffer> eventRecords;
   private java.lang.String clientProfileBody;
   private java.lang.String clientSchemaId;
   private java.lang.String serverProfileBody;
   private java.lang.String serverSchemaId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public RecordData() {}

  /**
   * All-args constructor.
   */
  public RecordData(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader recordHeader, java.lang.Integer schemaVersion, java.lang.String applicationToken, java.util.List<java.nio.ByteBuffer> eventRecords, java.lang.String clientProfileBody, java.lang.String clientSchemaId, java.lang.String serverProfileBody, java.lang.String serverSchemaId) {
    this.recordHeader = recordHeader;
    this.schemaVersion = schemaVersion;
    this.applicationToken = applicationToken;
    this.eventRecords = eventRecords;
    this.clientProfileBody = clientProfileBody;
    this.clientSchemaId = clientSchemaId;
    this.serverProfileBody = serverProfileBody;
    this.serverSchemaId = serverSchemaId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return recordHeader;
    case 1: return schemaVersion;
    case 2: return applicationToken;
    case 3: return eventRecords;
    case 4: return clientProfileBody;
    case 5: return clientSchemaId;
    case 6: return serverProfileBody;
    case 7: return serverSchemaId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: recordHeader = (org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader)value$; break;
    case 1: schemaVersion = (java.lang.Integer)value$; break;
    case 2: applicationToken = (java.lang.String)value$; break;
    case 3: eventRecords = (java.util.List<java.nio.ByteBuffer>)value$; break;
    case 4: clientProfileBody = (java.lang.String)value$; break;
    case 5: clientSchemaId = (java.lang.String)value$; break;
    case 6: serverProfileBody = (java.lang.String)value$; break;
    case 7: serverSchemaId = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'recordHeader' field.
   */
  public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader getRecordHeader() {
    return recordHeader;
  }

  /**
   * Sets the value of the 'recordHeader' field.
   * @param value the value to set.
   */
  public void setRecordHeader(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader value) {
    this.recordHeader = value;
  }

  /**
   * Gets the value of the 'schemaVersion' field.
   */
  public java.lang.Integer getSchemaVersion() {
    return schemaVersion;
  }

  /**
   * Sets the value of the 'schemaVersion' field.
   * @param value the value to set.
   */
  public void setSchemaVersion(java.lang.Integer value) {
    this.schemaVersion = value;
  }

  /**
   * Gets the value of the 'applicationToken' field.
   */
  public java.lang.String getApplicationToken() {
    return applicationToken;
  }

  /**
   * Sets the value of the 'applicationToken' field.
   * @param value the value to set.
   */
  public void setApplicationToken(java.lang.String value) {
    this.applicationToken = value;
  }

  /**
   * Gets the value of the 'eventRecords' field.
   */
  public java.util.List<java.nio.ByteBuffer> getEventRecords() {
    return eventRecords;
  }

  /**
   * Sets the value of the 'eventRecords' field.
   * @param value the value to set.
   */
  public void setEventRecords(java.util.List<java.nio.ByteBuffer> value) {
    this.eventRecords = value;
  }

  /**
   * Gets the value of the 'clientProfileBody' field.
   */
  public java.lang.String getClientProfileBody() {
    return clientProfileBody;
  }

  /**
   * Sets the value of the 'clientProfileBody' field.
   * @param value the value to set.
   */
  public void setClientProfileBody(java.lang.String value) {
    this.clientProfileBody = value;
  }

  /**
   * Gets the value of the 'clientSchemaId' field.
   */
  public java.lang.String getClientSchemaId() {
    return clientSchemaId;
  }

  /**
   * Sets the value of the 'clientSchemaId' field.
   * @param value the value to set.
   */
  public void setClientSchemaId(java.lang.String value) {
    this.clientSchemaId = value;
  }

  /**
   * Gets the value of the 'serverProfileBody' field.
   */
  public java.lang.String getServerProfileBody() {
    return serverProfileBody;
  }

  /**
   * Sets the value of the 'serverProfileBody' field.
   * @param value the value to set.
   */
  public void setServerProfileBody(java.lang.String value) {
    this.serverProfileBody = value;
  }

  /**
   * Gets the value of the 'serverSchemaId' field.
   */
  public java.lang.String getServerSchemaId() {
    return serverSchemaId;
  }

  /**
   * Sets the value of the 'serverSchemaId' field.
   * @param value the value to set.
   */
  public void setServerSchemaId(java.lang.String value) {
    this.serverSchemaId = value;
  }

  /** Creates a new RecordData RecordBuilder */
  public static org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder();
  }
  
  /** Creates a new RecordData RecordBuilder by copying an existing Builder */
  public static org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder newBuilder(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder other) {
    return new org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder(other);
  }
  
  /** Creates a new RecordData RecordBuilder by copying an existing RecordData instance */
  public static org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder newBuilder(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData other) {
    return new org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder(other);
  }
  
  /**
   * RecordBuilder for RecordData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordData>
    implements org.apache.avro.data.RecordBuilder<RecordData> {

    private org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader recordHeader;
    private int schemaVersion;
    private java.lang.String applicationToken;
    private java.util.List<java.nio.ByteBuffer> eventRecords;
    private java.lang.String clientProfileBody;
    private java.lang.String clientSchemaId;
    private java.lang.String serverProfileBody;
    private java.lang.String serverSchemaId;

    /** Creates a new Builder */
    private Builder() {
      super(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.recordHeader)) {
        this.recordHeader = data().deepCopy(fields()[0].schema(), other.recordHeader);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.schemaVersion)) {
        this.schemaVersion = data().deepCopy(fields()[1].schema(), other.schemaVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.applicationToken)) {
        this.applicationToken = data().deepCopy(fields()[2].schema(), other.applicationToken);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.eventRecords)) {
        this.eventRecords = data().deepCopy(fields()[3].schema(), other.eventRecords);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.clientProfileBody)) {
        this.clientProfileBody = data().deepCopy(fields()[4].schema(), other.clientProfileBody);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.clientSchemaId)) {
        this.clientSchemaId = data().deepCopy(fields()[5].schema(), other.clientSchemaId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.serverProfileBody)) {
        this.serverProfileBody = data().deepCopy(fields()[6].schema(), other.serverProfileBody);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.serverSchemaId)) {
        this.serverSchemaId = data().deepCopy(fields()[7].schema(), other.serverSchemaId);
        fieldSetFlags()[7] = true;
      }
    }
    
    /** Creates a Builder by copying an existing RecordData instance */
    private Builder(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData other) {
            super(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.SCHEMA$);
      if (isValidValue(fields()[0], other.recordHeader)) {
        this.recordHeader = data().deepCopy(fields()[0].schema(), other.recordHeader);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.schemaVersion)) {
        this.schemaVersion = data().deepCopy(fields()[1].schema(), other.schemaVersion);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.applicationToken)) {
        this.applicationToken = data().deepCopy(fields()[2].schema(), other.applicationToken);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.eventRecords)) {
        this.eventRecords = data().deepCopy(fields()[3].schema(), other.eventRecords);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.clientProfileBody)) {
        this.clientProfileBody = data().deepCopy(fields()[4].schema(), other.clientProfileBody);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.clientSchemaId)) {
        this.clientSchemaId = data().deepCopy(fields()[5].schema(), other.clientSchemaId);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.serverProfileBody)) {
        this.serverProfileBody = data().deepCopy(fields()[6].schema(), other.serverProfileBody);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.serverSchemaId)) {
        this.serverSchemaId = data().deepCopy(fields()[7].schema(), other.serverSchemaId);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'recordHeader' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader getRecordHeader() {
      return recordHeader;
    }
    
    /** Sets the value of the 'recordHeader' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setRecordHeader(org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader value) {
      validate(fields()[0], value);
      this.recordHeader = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'recordHeader' field has been set */
    public boolean hasRecordHeader() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'recordHeader' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearRecordHeader() {
      recordHeader = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'schemaVersion' field */
    public java.lang.Integer getSchemaVersion() {
      return schemaVersion;
    }
    
    /** Sets the value of the 'schemaVersion' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setSchemaVersion(int value) {
      validate(fields()[1], value);
      this.schemaVersion = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'schemaVersion' field has been set */
    public boolean hasSchemaVersion() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'schemaVersion' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearSchemaVersion() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'applicationToken' field */
    public java.lang.String getApplicationToken() {
      return applicationToken;
    }
    
    /** Sets the value of the 'applicationToken' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setApplicationToken(java.lang.String value) {
      validate(fields()[2], value);
      this.applicationToken = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'applicationToken' field has been set */
    public boolean hasApplicationToken() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'applicationToken' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearApplicationToken() {
      applicationToken = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'eventRecords' field */
    public java.util.List<java.nio.ByteBuffer> getEventRecords() {
      return eventRecords;
    }
    
    /** Sets the value of the 'eventRecords' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setEventRecords(java.util.List<java.nio.ByteBuffer> value) {
      validate(fields()[3], value);
      this.eventRecords = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'eventRecords' field has been set */
    public boolean hasEventRecords() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'eventRecords' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearEventRecords() {
      eventRecords = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'clientProfileBody' field */
    public java.lang.String getClientProfileBody() {
      return clientProfileBody;
    }
    
    /** Sets the value of the 'clientProfileBody' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setClientProfileBody(java.lang.String value) {
      validate(fields()[4], value);
      this.clientProfileBody = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'clientProfileBody' field has been set */
    public boolean hasClientProfileBody() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'clientProfileBody' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearClientProfileBody() {
      clientProfileBody = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'clientSchemaId' field */
    public java.lang.String getClientSchemaId() {
      return clientSchemaId;
    }
    
    /** Sets the value of the 'clientSchemaId' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setClientSchemaId(java.lang.String value) {
      validate(fields()[5], value);
      this.clientSchemaId = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'clientSchemaId' field has been set */
    public boolean hasClientSchemaId() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'clientSchemaId' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearClientSchemaId() {
      clientSchemaId = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'serverProfileBody' field */
    public java.lang.String getServerProfileBody() {
      return serverProfileBody;
    }
    
    /** Sets the value of the 'serverProfileBody' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setServerProfileBody(java.lang.String value) {
      validate(fields()[6], value);
      this.serverProfileBody = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'serverProfileBody' field has been set */
    public boolean hasServerProfileBody() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'serverProfileBody' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearServerProfileBody() {
      serverProfileBody = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'serverSchemaId' field */
    public java.lang.String getServerSchemaId() {
      return serverSchemaId;
    }
    
    /** Sets the value of the 'serverSchemaId' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder setServerSchemaId(java.lang.String value) {
      validate(fields()[7], value);
      this.serverSchemaId = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'serverSchemaId' field has been set */
    public boolean hasServerSchemaId() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'serverSchemaId' field */
    public org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordData.Builder clearServerSchemaId() {
      serverSchemaId = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    public RecordData build() {
      try {
        RecordData record = new RecordData();
        record.recordHeader = fieldSetFlags()[0] ? this.recordHeader : (org.kaaproject.kaa.server.common.log.shared.avro.gen.RecordHeader) defaultValue(fields()[0]);
        record.schemaVersion = fieldSetFlags()[1] ? this.schemaVersion : (java.lang.Integer) defaultValue(fields()[1]);
        record.applicationToken = fieldSetFlags()[2] ? this.applicationToken : (java.lang.String) defaultValue(fields()[2]);
        record.eventRecords = fieldSetFlags()[3] ? this.eventRecords : (java.util.List<java.nio.ByteBuffer>) defaultValue(fields()[3]);
        record.clientProfileBody = fieldSetFlags()[4] ? this.clientProfileBody : (java.lang.String) defaultValue(fields()[4]);
        record.clientSchemaId = fieldSetFlags()[5] ? this.clientSchemaId : (java.lang.String) defaultValue(fields()[5]);
        record.serverProfileBody = fieldSetFlags()[6] ? this.serverProfileBody : (java.lang.String) defaultValue(fields()[6]);
        record.serverSchemaId = fieldSetFlags()[7] ? this.serverSchemaId : (java.lang.String) defaultValue(fields()[7]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
