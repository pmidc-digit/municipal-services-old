DROP TABLE IF EXISTS eg_sw_connectionholder;
CREATE TABLE eg_sw_connectionholder (
  tenantId            	CHARACTER VARYING (256),
  connectionid      	CHARACTER VARYING (128) NOT NULL,
  status             	CHARACTER VARYING (128),
  userid              	CHARACTER VARYING (128),
  isprimaryholder      	BOOLEAN,
  connectionholdertype  CHARACTER VARYING (256),
  holdershippercentage 	CHARACTER VARYING (128),
  relationship        	CHARACTER VARYING (128),
  createdby           	CHARACTER VARYING (128),
  createdtime         	BIGINT,
  lastmodifiedby      	CHARACTER VARYING (128),
  lastmodifiedtime    	BIGINT,
  CONSTRAINT fk_eg_sw_connectionholder FOREIGN KEY (connectionid) REFERENCES eg_sw_connection (id)
  );